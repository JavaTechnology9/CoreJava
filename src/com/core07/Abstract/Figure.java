package com.core07.Abstract;

public abstract class Figure {
	private final double dim1;
	private final double dim2;
	
	public Figure(double a, double b) {
		dim1=a;
		dim2=b;
	}
	abstract  double area();
	public double getDim1() {
		return dim1;
	}
	public double getDim2() {
		return dim2;
	}
/*	
	public void setDim1(double d) {
		this.dim1=d;
	}*/
	
	

}
