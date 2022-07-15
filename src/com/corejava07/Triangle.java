package com.corejava07;

public class Triangle extends Figure{

	public Triangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return getDim1()* getDim2()/2;
	}

}
