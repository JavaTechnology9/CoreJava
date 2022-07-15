package com.core07.mypack;

public class Balance {
	private String name;
	private double bal;
	public Balance(String name, double bal) {
		this.name=name;
		this.bal=bal;
	}
	void show() {
		if(bal<0)
			System.out.print("-->");
		System.out.println(name +": $ "+ bal);
	}

}
