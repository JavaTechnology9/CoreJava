package com.java.fullstack2;

import com.java.fullstack2.NestA.NestedIf;

public class NestB implements NestedIf{

	@Override
	public boolean isNotNegative(int x) {
		// TODO Auto-generated method stub
		return x<0?false:true;
	}

}
