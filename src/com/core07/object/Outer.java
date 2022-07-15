package com.core07.object;

public class Outer {
	static int outer_x=100;
	int outer_y=200;
	private static int outer_private=300;
	void outerMethod() {
		/*Inner in=new Inner();
		in.display();
		System.out.println("display inner_x value: "+ in.inner_x);*/
	}
	 static class Inner{
	
		void display() {
			System.out.println("display outer_x value: "+ outer_x);
			//System.out.println("display outer_y value: "+ outer_y);
			System.out.println("display outer_private value: "+ outer_private);
		}
	}

}
