package com.facebook.exception;

public class NestedTry {

	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 42 / a;
			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex);
			}

		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
