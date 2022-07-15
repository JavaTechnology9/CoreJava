package com.core07.generics;

public class GenCons {
	private double val;
	public <T extends Number, A>GenCons(T org,A a) {
		val=org.doubleValue();
	}
	void showVal() {
		System.out.println("val: "+ val);
	}
	public static void main(String[] args) {
		GenCons gci=new GenCons(100,"String");
		GenCons gcd=new GenCons(85.47, true);
		gci.showVal();
		gcd.showVal();
	}

}
