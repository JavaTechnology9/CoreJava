package com.core07.Inheritance;

public class Rectangle extends Figure {
	
	public Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	double area() {
		System.out.println("Inside Area for Rectangle");
		return getDim1()*getDim2();
	}

}
