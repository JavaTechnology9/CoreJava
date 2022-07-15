package com.facebook.exception;

public class Exce1 {
	static void excep() {
		try {
			int d = 0;
			int a = 42 / d;
			System.out.println("this line will not execute");
		} catch (ArithmeticException ex) {
			System.out.println("Division by zero"+ex);
		}
		System.out.println("After catch statement");
	}

	public static void main(String[] args) {
		excep();

	}

}
