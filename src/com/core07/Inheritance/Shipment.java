package com.core07.Inheritance;

public class Shipment extends BoxWeight{
	private double cost;
	public Shipment(Shipment ob) {
		super(ob);
		this.cost=ob.cost;
	}
	public Shipment(double width, double height, double depth, double weight, double cost) {
		super(width, height, depth, weight);
		this.cost=cost;
	}
	public Shipment() {
		super();
		cost=-2;
	}

}
