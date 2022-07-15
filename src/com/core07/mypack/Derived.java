package com.core07.mypack;

public class Derived{
	public Derived() {
		
	}
	void derived() {
		Protection pro=new Protection();
		//System.out.println("base constructor");
		System.out.println("n value: "+pro.n);
		//System.out.println("n_pri value: "+ pro.n_pri);
		System.out.println("n_pro value: "+ pro.n_pro);
		System.out.println("n_pub value: "+pro.n_pub);
	}
	public static void main(String[] args) {
		Derived dev=new Derived();
		dev.derived();
	}

}
