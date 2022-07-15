package com.java.fullstack;

public class Balance {
	private String name;
	private double bal;
	public Balance(String name, double b) {
		this.name=name;
		bal=b;
	}
	public void show() {
		if(bal<0)
			System.out.print("--->");
		System.out.println(name + ": $" +bal);
	}

}
