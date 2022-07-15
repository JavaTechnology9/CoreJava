package com.corejava07;

public class Box {
	private double width;
	private double height;
	private double depth;

	double volume() {
		System.out.print("Volume is ");
		return width * height * depth;
	}

	void setValues(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;

	}


	Box(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	Box(double len) {
		width=height=depth=len;
	}
	Box(double len,double d) {
		width=height=len;
		depth=d;
	}
	Box(Box box){
		width=box.width; //15
		height=box.height; //20
		depth=box.depth; //10
	}

	Box() {
		System.out.println("default constructor");
		width=-10;
		height=-20;
		depth=-15;
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
	
	// box1.square(5);
	// box1.square(7);

	/*
	 * @Override public String toString() { return "Box [width=" + width +
	 * ", height=" + height + ", depth=" + depth + "]"; }
	 */

}
