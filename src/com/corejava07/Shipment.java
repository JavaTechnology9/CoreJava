package com.corejava07;

public class Shipment extends BoxWeight{
	private double cost;
	public Shipment(double w, double h, double d,double we, double co) {
		super(w,h,d,we);
		cost=co;
	}

	Shipment(double len,double we, double co) {
		super(len,we);
		cost=co;
	}
	Shipment(double len,double d,double we, double co) {
		super(len,d, we);
		cost=co;
	}
	Shipment(Shipment box){
		super(box);
		cost=box.cost;
	}

	Shipment() {
		super();
		cost=-45.12;
	}
	double volume() {
		System.out.print("Volume from Shipment class ");
		return getWidth() * getHeight() * getDepth()*getWeight()*cost;
	}

}
