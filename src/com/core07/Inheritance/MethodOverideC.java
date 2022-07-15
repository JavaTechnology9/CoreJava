package com.core07.Inheritance;

public class MethodOverideC extends MethodOverideA{
	private int k;
	public MethodOverideC(int a, int b, int c) {
		super(a, b);
		k=c;
	}
	void show() {
		System.out.println("MethodOverideC k value:"+ k);
		//super.show();
	}

}
