package com.openrsc.server.net.rsc.struct;

import com.openrsc.server.net.rsc.enums.OpcodeIn;

public class PlayerTradeStruct extends AbstractStruct<OpcodeIn> {

	public int targetPlayerID;
	public int tradeCount;
	public int[] tradeCatalogIDs;
	public int[] tradeAmounts;
	public boolean[] tradeNoted;
	public int tradeAccepted; // old rsc before trade confirmation

}
