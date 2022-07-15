package com.core07.object;

public class Box {
	private double width;
	private double height;
	private double depth; // instance variables

	public Box(double width, double height, double depth) {
		System.out.println("parameter constructor");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Box() {
		System.out.println("default constructor");
		width = -1;
		height = -2;
		depth = -3;
	}

	public Box(double len) {
		width = height = depth = len;
	}

	public Box(double width, double len) {
		this.width = width;
		height = depth = len;
	}

	public double volume() {// called
		System.out.print("Volume is: ");
		return width * height * depth;
	}

	int square(int i) {
		return i * i;
	}

	void setValues(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}

}
