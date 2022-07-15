package com.core07.Inheritance;

public class FiRecTriMain {

	public static void main(String[] args) {
		Figure f1=new Figure(78.8,98.9);
		Rectangle r1=new Rectangle(45.5,65.6);
		Triangle t1=new Triangle(12.2,32.3);
		
		Figure f2;
		f2=f1;
		f2.area();
		
		f2=r1;
		System.out.println(f2.area());
		
		f2=t1;
		System.out.println(f2.area());

	}

}
