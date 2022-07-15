package com.core07.object;

public class NestedClassMain {

	public static void main(String[] args) {
		Outer.Inner in=new Outer.Inner();
		//Outer.Inner in=ou.Inner();
		//ou.outerMethod();
		in.display();
		//System.out.println(in.inner_x);

	}

}
