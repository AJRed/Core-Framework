package com.openrsc.server.net.rsc.struct;

import com.openrsc.server.model.Point;
import com.openrsc.server.net.rsc.enums.OpcodeIn;

public class TargetObjectStruct extends AbstractStruct<OpcodeIn> {

	public Point coordObject;
	public int direction = 0;
}
