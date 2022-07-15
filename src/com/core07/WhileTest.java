package com.core07;

public class WhileTest {

	public static void main(String[] args) {
		int n=10;
		int a=10, b=20;
		while(n>0) {
			System.out.println(" tick: "+n);
			n--;
		}
		while(++a<--b) {
			System.out.println("midpoint: "+ a+ ": "+b);
		}
		System.out.println("midpoint: "+ a+ ": "+b);

	}

}
