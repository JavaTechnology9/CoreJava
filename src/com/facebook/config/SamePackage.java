package com.facebook.config;

public class SamePackage {
	public SamePackage() {
		Protection p=new Protection();
		System.out.println("n value: " +p.n);
		//System.out.println("n_pri value: " +p.n_pri);
		System.out.println("n_pro value: " +p.n_pro);
		System.out.println("n_pub value: " +p.n_pub);
	}

}
