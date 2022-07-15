package com.core07.Inheritance;

public class InB extends InA{
	int k;
	void showK() {
		System.out.println("k value: " +k);
	}
	
	void sum() {
		System.out.println(getI()+getJ()+k);
	}
	public static void main(String[] args) {
		// Outer ou=new Outer();
		// Outer.Inner in=ou.new Inner();
		InA ia=new InA();
		InB ib=new InB();
		System.out.println("============");
		ia.setI(15);
		ia.setJ(25);
		ia.showIJ();
		ia.sum();// super sum method
		System.out.println("============");
		ib.setI(10);
		ib.setJ(20);
		ib.showIJ();
		System.out.println("============");
		ib.k=30;
		ib.sum(); // sub sum method
		System.out.println("============");
		System.out.println(ia);
		System.out.println(ib);
		
		
	}

}
