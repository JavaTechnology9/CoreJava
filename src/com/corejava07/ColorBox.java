package com.corejava07;

public class ColorBox extends Box {
	public int color;

	public ColorBox(double w, double h, double d, int c) {
		super(w, h, d);
		color = c;
	}

	double volume() {//super.setValues(10,45,78)
		//System.out.println(super.volume());
		System.out.print("Volume from ColorBox class");
		return getWidth() * getHeight() * getDepth() * color;
	}

}
