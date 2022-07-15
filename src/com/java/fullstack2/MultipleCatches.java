package com.java.fullstack2;

public class MultipleCatches {

	public static void main(String[] args) {
		try {
			int a=2;//args.length;
			System.out.println("a value: "+a);
			int b=42/a;
			int c[]= {1};
			c[42]=99;
		}catch(ArithmeticException ex) {
			System.out.println("Divide by 0: "+ex);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Runtime Exception: "+ex);
		}

	}

}
