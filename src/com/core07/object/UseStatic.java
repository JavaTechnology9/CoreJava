package com.core07.object;

public class UseStatic {
	final static int a=10;
	static int b; // static variables
	int c=45;
	public UseStatic() {
		System.out.println("Default constructor");
	}
	static void meth(int x) {
		System.out.println("x value= "+x); //static method
		System.out.println("a value= "+a);
		System.out.println("b value= "+b);
		//System.out.println("c value= "+c);// non-static variable
	}
	void nonStatic(int x) {
		System.out.println("================");
		System.out.println("local x value= "+x); //static method
		System.out.println("static a value= "+a);
		System.out.println("static b value= "+b);
		System.out.println("non-static c value= "+c);
		System.out.println("================");
	}
	static {
		// static block
		System.out.println("static block");
		b= a*4;
		//System.out.println("c value= "+c);
	}{
		// instance block 
		System.out.println("instance block");
		b= a*4;
	}
	

}
