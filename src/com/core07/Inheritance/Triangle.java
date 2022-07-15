package com.core07.Inheritance;

public class Triangle extends Figure{

	public Triangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	double area() {
		System.out.println("Inside Area for Triangle");
		return getDim1()*getDim2()/2;
	}

}
