package com.core07.Interface;

import com.core07.Interface.OuterClass.NestedIf;

public class NestedIFImpl implements NestedIf{

	@Override
	public boolean isNotNegative(int x) {
		return x<0?false:true;
	}

}
