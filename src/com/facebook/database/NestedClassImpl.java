package com.facebook.database;


public class NestedClassImpl implements NestedClass.NestedIF{

	@Override
	public boolean isNotNegative(int x) {
		// TODO Auto-generated method stub
		return x<0?false:true;
	}

}
