package com.core07.Inheritance;

public class Figure {
	private double dim1;
	private double dim2;
	public Figure(double a, double b) {
		dim1=a;
		dim2=b;
	}
	double area() {
		System.out.println("Area for Figure is undefined");
		return 0.0;
	}
	public double getDim1() {
		return dim1;
	}
	/*public void setDim1(double dim1) {
		this.dim1 = dim1;
	}*/
	public double getDim2() {
		return dim2;
	}
	/*public void setDim2(double dim2) {
		this.dim2 = dim2;
	}*/
	
	

}
