package com.core07.Inheritance;

public class MethodOverideA {
	private int i, j;
	public MethodOverideA(int a, int b) {
		i=a;
		j=b;
	}
	public MethodOverideA() {
		
	}
	void show() {
		System.out.println("i and j values: " +i+ ", "+j);
	}
	void sum() {
		System.out.println(i+j);
	}

}
