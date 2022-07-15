package com.core07.Abstract;

public class RecTriMain {

	public static void main(String[] args) {
		//Figure f1=new Figure(12.5,78.3); //Cannot instantiate the type Figure
		Rectangle rec1=new Rectangle(12.5, 78.6);
		Triangle tr1=new Triangle(12.5, 78.6);
		//Rectangle rec1=new Rectangle("St1","St2");
		System.out.println(rec1.area());
		System.out.println(tr1.area());
		

	}

}
