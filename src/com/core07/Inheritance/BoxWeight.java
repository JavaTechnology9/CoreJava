package com.core07.Inheritance;

public class BoxWeight extends Box{
	private double weight;
	public BoxWeight() {
		System.out.println("BoxWeight default constructor");
	}
	public BoxWeight(double width, double height, double depth,double weight) {
		super(width, height, depth);
		this.weight=weight;
		
	}
	public BoxWeight(BoxWeight bw) {
		super(bw);
		this.weight=bw.weight;
		System.out.println("BoxWeight Object as parameter" + bw);
	}
	public double volume() {// called
		System.out.print("BoxWeight Volume is: ");
		return getWidth() * getHeight() * getDepth()*weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
