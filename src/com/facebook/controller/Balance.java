package com.facebook.controller;

public class Balance {
	String name;
	double bal;
	public Balance(String n, double b) {
		name=n;
		bal=b;
	}
	void show() {
		if(bal<0) {
			System.out.print("->");
		}
		System.out.println(name + " $" + bal);
	}
	@Override
	public String toString() {
		return "Balance [name=" + name + ", bal=" + bal + "]";
	}
	

}
