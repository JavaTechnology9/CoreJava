package com.java.fullstack;

public class Protection {
	int n=1;
	private int n_pri=2;
	protected int n_pro=3;
	public int n_pub=4;
	public Protection() {
		System.out.println("base constructor");
		System.out.println("n value: " +n);
		System.out.println("n_pri value: " +n_pri);
		System.out.println("n_pro value: " +n_pro);
		System.out.println("n_pub value: " +n_pub);
	}

}
