package com.corejava07;

public class BoxWeight extends Box{
	private double weight;
	public BoxWeight(double w, double h, double d,double we) {
		super(w,h,d);
		weight=we;
		
	}

	BoxWeight(double len,double we) {
		super(len);
		weight=we;
	}
	BoxWeight(double len,double d,double we) {
		super(len,d);
		weight=we;
	}
	BoxWeight(BoxWeight box){
		super(box);
		weight=box.weight;
	}

	BoxWeight() {
		super();
		weight=-12.14;
	}
	double volume() {
		System.out.print("Volume from BoxWeight class ");
		return getWidth() * getHeight() * getDepth()*weight;
	}

	public double getWeight() {
		return weight;
	}
	

}
