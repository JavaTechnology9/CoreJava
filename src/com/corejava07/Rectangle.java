package com.corejava07;

public class Rectangle extends Figure{
	private  int value=100;
	public Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		value=value*2;
		return getDim1()*getDim2();
	}
	

}
