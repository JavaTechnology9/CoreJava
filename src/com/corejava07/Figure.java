package com.corejava07;

public abstract class Figure {
	private double dim1;
	private double dim2;
	public Figure(double a, double b) {
		dim1=a;
		dim2=b;
	}
	
	public double getDim1() {
		return dim1;
	}

	public double getDim2() {
		return dim2;
	}

	abstract double area();
	public final void finalTest() {
		System.out.println("finalTest method in Figure class");
	}
	

}
