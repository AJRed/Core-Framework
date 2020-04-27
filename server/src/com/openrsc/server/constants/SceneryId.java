package com.openrsc.server.constants;

import java.util.HashMap;
import java.util.Map;

public enum SceneryId {
	NOTHING(-1),
	POINTY_TREE(0),
	LEAFY_TREE(1),
	WELL(2),
	TABLE(3),
	TREESTUMP(4),
	LADDER_GENERIC_UP(5),
	LADDER_GENERIC_DOWN(6),
	CHAIR(7),
	LOGS(8),
	LONGTABLE(9),
	THRONE(10),
	RANGE(11),
	GRAVESTONE(12),
	MOSSY_GRAVESTONE(13),
	BED_LARGE(14),
	BED_WHITE(15),
	BAR(16),
	CHEST_GENERIC_OPEN(17),
	CHEST_GENERIC_CLOSED(18),
	ALTAR(19),
	STONE_POST(20),
	WOODEN_SUPPORT(21),
	BARREL_EMPTY(22),
	BENCH_GENERIC(23),
	PAINTING_PORTRAIT(24),
	CANDLES(25),
	FOUNTAIN(26),
	PAINTING_LANDSCAPE(27),
	MILLSTONES(28),
	SHOP_COUNTER(29),
	MARKET_STALL(30),
	ARCHERY_TARGET(31),
	PALM_TREE_NICE(32),
	PALM_TREE_SHADY(33),
	FERN(34),
	CACTUS(35),
	BULLRUSHES(36),
	FLOWER(37),
	MUSHROOM(38),
	COFFIN_CLOSED(39),
	COFFIN_OPEN(40),
	STAIRS_WOODEN_GENERIC_UP(41),
	STAIRS_WOODEN_GENERIC_DOWN(42),
	STAIRS_STONE_GENERIC_UP(43),
	STAIRS_STONE_GENERIC_DOWN(44),
	RAILING_WOODEN(45),
	PILLAR_MARBLE(46),
	BOOKCASE(47),
	SINK(48),
	DUMMY(49),
	ANVIL(50),
	TORCH(51),
	HOPPER_LUMBRIDGE(52),
	CHUTE(53),
	CART(54),
	SACKS(55),
	CUPBOARD_GENERIC_CLOSED(56),
	GATE_METAL_GENERIC_CLOSED(57),
	GATE_METAL_GENERIC_OPEN(58),
	GATE_WOODEN_GENERIC_OPEN(59),
	GATE_WOODEN_GENERIC_CLOSED(60),
	SIGNPOST_VARROCK(61),
	SIGNPOST_WIZARDS_TOWER(62),
	DOOR_BANK_OPEN(63),
	DOOR_BANK_CLOSED(64),
	SIGNPOST_PLAYER_OWNED_HOUSES(65),
	SIGNPOST_LUMBRIDGE_CASTLE(66),
	BOOKCASE_SEARCHABLE(67),
	HENGE(68),
	DOLMEN(69),
	TREE_UNHEALTHY_GENERIC(70),
	CUPBOARD_GENERIC_OPEN(71),
	WHEAT(72),
	SIGN_BLUE_MOON_INN(73),
	WINDMILL_SAILS(74),
	SIGN_ESTATE_AGENT(75),
	SIGN_JOLLY_BOAR_INN(76),
	DRAIN(77),
	MANHOLE_CLOSED(78),
	MANHOLE_OPEN(79),
	PIPE(80),
	CHEST_OPEN_PHOENIX_GANG(81),
	CHEST_CLOSED_PHOENIX_GANG(82),
	BARREL_NEWTS_EYES(83),
	CUPBOARD_BLACK_ARM_CLOSED(84),
	CUPBOARD_BLACK_ARM_OPEN(85),
	FOUNTAIN_DRAYNOR_MANOR(86),
	SIGNPOST_DRAYNOR_MANOR(87),
	TREE_UNHEALTHY_APPROACHABLE(88),
	SIGN_GENERAL_STORE(89),
	SIGN_LOWES_ARCHERY_STORE(90),
	SIGN_VARROCK_CLOTHING_SHOP(91),
	SIGN_VARROCK_SWORDS(92),
	GATE_MEMBERS_RED_DRAGONS_CLOSED(93),
	GATE_MEMBERS_UNUSED(94),
	SIGN_BOBS_AXES(95),
	SIGN_STAFF_SHOP(96),
	FIRE(97),
	ROCK_GENERIC(98),
	ROCK_GENERIC2(99),
	ROCK_COPPER(100),
	ROCK_COPPER2(101),
	ROCK_IRON(102),
	ROCK_IRON2(103),
	ROCK_TIN(104),
	ROCK_TIN2(105),
	ROCK_MITHRIL(106),
	ROCK_MITHRIL2(107),
	ROCK_ADAMITE(108),
	ROCK_ADAMITE2(109),
	ROCK_COAL(110),
	ROCK_COAL2(111),
	ROCK_GOLD(112),
	ROCK_GOLD2(113),
	ROCK_CLAY(114),
	ROCK_CLAY2(115),
	WEB_CEILING(116),
	WEB_FLOOR(117),
	FURNACE(118),
	COOKS_RANGE(119),
	MACHINE(120),
	SPINNING_WHEEL(121),
	LEVER_UP_UNUSED(122), // TODO Needs name & location
	LEVER_DOWN_UNUSED(123), // TODO Needs name & location
	LEVER_A(124),
	LEVER_B(125),
	LEVER_C(126),
	LEVER_D(127),
	LEVER_E(128),
	LEVER_F(129),
	LADDER_DRAYNOR_MANOR_BASEMENT_UP(130),
	SIGNPOST_FORGE(131),
	SIGNPOST_BARBARIAN_VILLAGE(132),
	SIGNPOST_AL_KHARID(133),
	COMPOST_HEAP(134),
	COFFIN_DRANOR_MANOR_CLOSED(135),
	COFFIN_DRAYNO_MANOR_OPEN(136),
	GATE_MEMBERS_TAVERLY_CLOSED(137),
	GATE_MEMBERS_CRAFTING_GUILD_CLOSED(138),
	SIGN_BANK(139),
	CUPBOARD_DRAYNOR_GARLIC_CLOSED(140),
	CUPBOARD_DRAYNOR_GARLIC_OPEN(141),
	DOORS_SHUT(142),
	TORCH_SCARY(143),
	ALTAR_ZAMORAK(144),
	SHIELD(145),
	GRILL(146),
	CAULDRON(147),
	GRILL_LISTEN(148),
	MINECART(149),
	BUFFERS(150),
	TRAIN_TRACK_TURN(151),
	TRAIN_TRACK_JUNCTION(152),
	TRAIN_TRACK(153),
	HOLE_BLACK_KNIGHTS_FORTRESS(154),
	SHIP(155),
	SHIP_FRONT_ARDOUGNE_BRIMHAVEN(156),
	SHIP_BACK_ARDOUGNE_BRIMHAVEN(157),
	LADDER_EMERGENCY_ESCAPE(158),
	SIGN_WYDINS_GROCERY(159),
	SIGN_RUSTY_ANCHOR(160),
	SHIP_FRONT_KARAMJA_PORT_SARIM(161),
	SHIP_MIDDLE_KARAMJA_PORT_SARIM(162),
	SHIP_BACK_KARAMJA_PORT_SARIM(163),
	ROCKS_GENERIC3(164),
	ROCKS_COPPER3(165),
	ROCKS_IRON3(166),
	ROCKS_TIN3(167),
	ROCKS_MITHRIL3(168),
	ROCKS_ADAMITE3(169),
	ROCKS_COAL3(170),
	ROCKS_GOLD3(171),
	ROCKS_CLAY3(172),
	HOPPER_COOKING_GUILD(173),
	CUPBOARD_FALADOR_CASTLE_WHITE_KNIGHT_CLOSED(174),
	CUPBOARD_FALADOR_CASTLE_WHITE_KNIGHT_OPEN(175),
	ROCKS_BLURITE(176),
	ANVIL_DORIC(177),
	POTTERY_OVEN(178),
	POTTERY_WHEEL(179),
	GATE_AL_KHARID_CLOSED(180),
	GATE_GENERIC_OPEN(181),
	CRATE_BANANAS_KARAMJA(182),
	BANANA_TREE_FULL(183),
	BANANA_TREE_EMPTY(184),
	CRATE_BANANAS_PORT_SARIM(185),
	CHEST_PIRATES_TREASURE_VARROCK_OPEN(186),
	CHEST_PIRATES_TREASURE_VARROCK_CLOSED(187),
	FLOWER_PIRATES_TREASURE_FALADOR(188),
	SIGN_FISHING_SUPPLIES(189),
	SIGN_JEWELLERS(190),
	POTATO(191),
	FISH_LURE_BAIT(192),
	FISH_NET_BAIT(193),
	FISH_HARPOON_CAGE(194),
	ROCK_SILVER(195),
	ROCK_SILVER2(196),
	ROCKS_SILVER3(197),
	LADDER_MONASTERY_UP(198),
	LADDER_MONASTERY_DOWN(199),
	ALTAR_MONKS(200),
	LADDER_MELZAR_DOWN(201),
	COFFIN_GENERIC_CLOSED(202),
	COFFIN_GENERIC_OPEN(203),
	TABLE_SMASHED(204),
	FUNGUS(205),
	CHAIR_SMASHED(206),
	PILLAR_BROKEN(207),
	TREE_FALLEN(208),
	SIGN_DANGER(209),
	ROCK_RUNITE(210),
	ROCK_RUNITE2(211),
	ROCKS_RUNITE3(212),
	GRAVESTONE_LARGE(213),
	BONE_CURVED(214),
	BONE_LARGE(215),
	CARCASS(216),
	SKULL_ANIMAL(217),
	VINE_RED(218),
	VINE_RED_TURN(219),
	VINE_RED_JUNCTION(220),
	CHEST_MUDDY_KEY_OPEN(221),
	CHEST_MUDDY_KEY_CLOSED(222),
	LADDER_BLACK_HOLE_DOWN(223),
	SHIP_FRONT_LUMBRIDGE_LADY_PORT_SARIM(224),
	SHIP_BACK_LUMBRIDGE_LADY_PORT_SARIM(225),
	HOLE_BROKEN_WALL_SHIP(226),
	LADDER_BROKEN_SHIP_UP(227),
	CHEST_MELZAR_OPEN(228),
	CHEST_MELZAR_CLOSED(229),
	CHEST_DWARVEN_OPEN(230),
	CHEST_DWARVEN_CLOSED(231),
	HOLE_BROKEN_WALL_SHIP2(232),
	SHIP_FRONT_LUMBRIDGE_LADY_CRANDOR(233),
	SHIP_BACK_LUMBRIDGE_LADY_CRANDOR(234),
	ALTAR_OF_GUTHIX(235),
	CAULDRON_OF_THUNDER(236),
	TREE_LEAFY(237),
	SHIP_FRONT_ENTRANA(238),
	SHIP_MIDDLE_ENTRANA(239),
	SHIP_BACK_ENTRANA(240),
	SHIP_FRONT_PORT_SARIM(241),
	SHIP_MIDDLE_PORT_SARIM(242),
	SHIP_BACK_PORT_SARIM(243),
	LADDER_ENTRANA_DOWN(244),
	TREE_DRAMEN(245),
	HOPPER_ZANARIS(246),
	CHEST_TAVERLY_OPEN(247),
	CHEST_TAVERLY_CLOSED(248),
	LADDER_ZANARIS_MARKET_UP(249),
	SIGN_TWO_HANDED_SWORDS(250),
	SIGN_HERBALIST(251),
	GATE_MEMBERS_UNUSED2(252),
	GATE_MEMBERS_UNUSED3(253),
	GATE_MEMBERS_KARAMJA_CLOSED(254),
	DOOR_MAT(255),
	GATE_METAL_WITCHES_HOUSE_CLOSED(256),
	CAULDRON_WITCHES_HOUSE(257),
	CUPBOARD_WITCHES_HOUSE_CLOSED(258),
	CUPBOARD_WITCHES_HOUSE_OPEN(259),
	GATE_BANK_VAULT(260),
	FISH_NET_HARPOON(261),
	SIGN_HARRYS_FISHING_SHACK(262),
	CUPBOARD_BRIMHAVEN_HEROS_QUEST_CLOSED(263),
	CUPBOARD_BRIMHAVEN_HEROS_QUEST_OPEN(264),
	CHEST_BRIMHAVEN_HEROS_QUEST_OPEN(265),
	CHEST_BRIMHAVEN_HEROS_QUEST_CLOSED(266),
	SIGN_SHRIMP_AND_PARROT(267),
	SIGNPOST_PALM_STREET(268),
	ROCKSLIDE(269),
	LADDER_ICE_QUEEN_UP(270),
	FISH_LAVA(271),
	BARREL_ALE(272),
	TABLE_STURDY(273),
	FIREPLACE(274),
	EGG(275),
	EGGS(276),
	STALAGMITES(277),
	STOOL(278),
	BENCH_JAILCELL(279),
	TABLE_ROUND(280),
	TABLE_HANDY(281),
	FOUNTAIN_OF_HEROS(282),
	BUSH(283),
	HEDGE(284),
	FLOWER_COLOURFUL(285),
	PLANT(286),
	GIANT_CRYSTAL(287),
	SIGN_DEAD_MANS_CHEST(288),
	SIGN_RISING_SUN(289),
	CRATE_EMPTY(290),
	CRATE_BUCKET(291),
	SHIP_FRONT_MERCHANT(292),
	SHIP_BACK_MERCHANT(293),
	BEEHIVE(294),
	LADDER_JEWELLERY_SHOP_UP(295),
	ALTAR_ZAMORAK_WILDERNESS(296),
	SIGN_HICKTONS_ARCHERY_STORE(297),
	SIGNPOST_CAMELOT(298),
	ARCHWAY(299),
	OBELISK_OF_WATER(300),
	OBELISK_OF_FIRE(301),
	SAND_PIT(302),
	OBELISK_OF_AIR(303),
	OBELISK_OF_EARTH(304),
	GATE_MEMBERS_EDGEVILLE_DUNGEON(305),
	TREE_OAK(306),
	TREE_WILLOW(307),
	TREE_MAPLE(308),
	TREE_YEW(309),
	TREE_MAGIC(310),
	GATE_BARBARIAN_AGILITY(311),
	SIGN_FORESTERS_ARMS(312),
	FLAX(313),
	TREESTUMP_LARGE(314),
	ROCKS_GOLD(315),
	LEVER_FAMILY_CREST_DUNGEON_HALL_UP(316),
	LEVER_FAMILY_CREST_DUNGEON_ROOM_TWO_UP(317),
	LEVER_FAMILY_CREST_DUNGEON_ROOM_ONE_UP(318),
	GATE_MEMBERS_WILDERNESS_BLACK_DRAGON(319),
	SHIP_FRONT_ARDOUGNE(320),
	SHIP_BACK_ARDOUGNE(321),
	STALL_BAKERS(322),
	STALL_SILK(323),
	STALL_FUR(324),
	STALL_SILVER(325),
	STALL_SPICES(326),
	STALL_GEMS(327),
	CRATE_ARDOUGNE_TO_WIZARDS_TOWER(328),
	CRATE_ARDOUGNE_HANDELMORT_MANSION(329),
	SIGN_RPDT_DEPOT(330),
	STAIRS_STONE_UP_TRAPPED(331),
	CHEST_ARDOUGNE_TRIBAL_TOTEM_OPEN(332),
	CHEST_ARDOUGNE_TRIBAL_TOTEM_CLOSED(333),
	CHEST_CLOSED_10_GOLD(334),
	CHEST_CLOSED_NATURE_RUNE(335),
	CHEST_CLOSED_50_GOLD(336),
	CHEST_CLOSED_BLOOD_RUNE(337),
	CHEST_CLOSED_PALADIN(338),
	CHEST_OPEN_STEALING(339),
	CHEST_CLOSED_EMPTY(340),
	STALL_EMPTY(341),
	STAIRS_STONE_ARDOUGNE_CASTLE_UP(342),
	HOPPER(343), // TODO Needs name & location??
	SIGNPOST_ARDOUGNE_CITY_ZOO(344),
	SIGN_FLYING_HORSE(345),
	GATE_MEMBERS(346), // TODO Needs name
	GATE_MEMBERS_WILDERNESS_ICE_GIANT(347),
	LEVER_ARDOUGNE_TO_WILDERNESS_UP(348),
	LEVER_WILDERNESS_TO_ARDOUGNE_UP(349),
	PIPE_FISHING_CONTEST(350),
	FISH_BAIT_FISHING_CONTEST1(351),
	FISH_BAIT_FISHING_CONTEST2(352),
	FISH_BAIT_FISHING_CONTEST3(353),
	FISH_BAIT_FISHING_CONTEST4(354),
	VINE_RED_FISHING_CONTEST(355),
	GATE_MCGRUBORS_WOOD(356),
	GATE_WOODEN_FISHING_CONTEST_OPEN(357),
	GATE_WOODEN_FISHING_CONTEST_CLOSED(358),
	STAIRS_STONE_WHITE_WOLF_PASS_DOWN(359),
	CART_BROKEN(360),
	LEVER_UP_TRAPPED(361),
	CLOCK_POLE_BLUE(362),
	CLOCK_POLE_RED(363),
	CLOCK_POLE_PURPLE(364),
	CLOCK_POLE_BLACK(365),
	WALLCLOCKFACE(366),
	LEVER_BRACKET(367),
	LEVER_CLOCK_TOWER_UP(368),
	STAIRS_WOODEN_TEMPLE_OF_IKOV_DUNGEON_UP(369),
	STAIRS_WOODEN_TEMPLE_OF_IKOV_DUNGEON_DOWN(370),
	GATE_METAL_QUEST_CLOSED(371),
	GATE_METAL_QUEST_OPEN(372),
	LEVER_CLOCK_TOWER_DUNGEON_UP(373),
	LEVER_CLOCK_TOWER_DUNGEON_DOWN(374),
	FOODTROUGH(375),
	FISH_CAGE_HARPOON(376),
	SPEARWALL(377),
	SKULL_HORNED(378),
	CHEST_HEMENSTER_CLOSED(379),
	CHEST_CLOSED(380), // TODO Needs name
	CUPBOARD_GUARDS_CLOSED(381),
	CUPBOARD_GUARDS_OPEN(382),
	COAL_TRUCK(383),
	SHIP_FRONT_BRIMHAVEN(384),
	SHIP_MIDDLE_BRIMHAVEN(385),
	SHIP_BACK_BRIMHAVEN(386),
	TREE_HOUSE(387),
	BALLISTA(388),
	LARGE_SPEAR(389),
	SPIRIT_TREE(390),
	YOUNG_SPIRIT_TREE(391);

	private int sceneryId;

	private static final Map<Integer, SceneryId> byId = new HashMap<>();

	static {
		for (SceneryId scenery : SceneryId.values()) {
			if (byId.put(scenery.id(), scenery) != null) {
				throw new IllegalArgumentException("duplicate id: " + scenery.id());
			}
		}
	}

	public static SceneryId getById(Integer id) {
		return byId.getOrDefault(id, SceneryId.NOTHING);
	}

	/**
	 * @param sceneryId The ID of the item.
	 */
	SceneryId(int sceneryId) {
		this.sceneryId = sceneryId;
	}

	/**
	 * @return The items ID
	 */
	public int id() {
		return sceneryId;
	}
}