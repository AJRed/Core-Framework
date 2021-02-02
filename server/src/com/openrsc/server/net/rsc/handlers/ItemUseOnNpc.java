package com.openrsc.server.net.rsc.handlers;

import com.openrsc.server.constants.ItemId;
import com.openrsc.server.constants.NpcId;
import com.openrsc.server.model.action.WalkToMobAction;
import com.openrsc.server.model.container.Inventory;
import com.openrsc.server.model.container.Item;
import com.openrsc.server.model.entity.npc.Npc;
import com.openrsc.server.model.entity.player.Player;
import com.openrsc.server.net.Packet;
import com.openrsc.server.net.rsc.PacketHandler;

import static com.openrsc.server.plugins.Functions.inArray;

public class ItemUseOnNpc implements PacketHandler {

	public void handlePacket(Packet packet, Player player) throws Exception {
		if (player.inCombat()) {
			player.message("You can't do that whilst you are fighting");
			return;
		}
		if (player.isBusy()) {
			player.resetPath();
			return;
		}
		player.resetAll();
		int npcIndex = packet.readShort();
		final Npc affectedNpc = player.getWorld().getNpc(npcIndex);
		int slotIndex = packet.readShort();
		if (player.getConfig().WANT_EQUIPMENT_TAB && slotIndex > Inventory.MAX_SIZE) {
			player.message("Please unequip your item and try again.");
			return;
		}
		final Item item = player.getCarriedItems().getInventory().get(slotIndex);
		if (affectedNpc == null || item == null) {
			return;
		}
		player.setFollowing(affectedNpc, 0, false);
		player.setWalkToAction(new WalkToMobAction(player, affectedNpc, 1) {
			public void executeInternal() {
				getPlayer().resetPath();
				getPlayer().resetFollowing();
				if ((!getPlayer().getCarriedItems().getInventory().contains(item) || getPlayer().isBusy()
					|| getPlayer().isRanging() || !getPlayer().canReach(affectedNpc)
					|| affectedNpc.isBusy()) && item.getCatalogId() != ItemId.RESETCRYSTAL.id()) {
					return;
				}
				getPlayer().resetAll();
				getPlayer().face(affectedNpc);

				// Lazy bugfix for "notes shouldn't be able to be used on NPCs... except for the bankers!"
				int[] BANKERS = {NpcId.BANKER_GEN1.id(), NpcId.FAIRY_BANKER.id(), NpcId.BANKER_GEN2.id(),
					NpcId.GNOME_BANKER.id(), NpcId.JUNGLE_BANKER.id()};
				if (item.getNoted() && !inArray(affectedNpc.getID(), BANKERS)) {
					getPlayer().message("Nothing interesting happens");
					return;
				}

				if (item.getDef(getPlayer().getWorld()).isMembersOnly()
					&& !getPlayer().getConfig().MEMBER_WORLD) {
					getPlayer().message(getPlayer().MEMBER_MESSAGE);
					return;
				}
				if (getPlayer().getWorld().getServer().getPluginHandler().handlePlugin(
					getPlayer(),
					"UseNpc",
					new Object[]{getPlayer(), affectedNpc, item}, this))
					return;
			}
		});
	}

}
