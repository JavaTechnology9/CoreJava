package com.facebook.exception;

public class MultipleCatches {

	public static void main(String[] args) {
		try {
			int a = 10;
			// System.out.println();
			int b = 42 / a;
			int c[] = { 1 };
			c[99] = 46;
		}catch (ArithmeticException ex) {
			System.out.println("division by zero: " + ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}catch(Exception ex){
			System.out.println(ex);
		}
		System.out.println("after try/catch block");

	}

}
