package com.core07.Abstract;

public class Rectangle extends Figure{

	public Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	 double area() {
		System.out.println("Inside Area for Rectangle");
		return getDim1()* getDim2();
	}

}
