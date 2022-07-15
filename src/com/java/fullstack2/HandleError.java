package com.java.fullstack2;

import java.util.Random;



public class HandleError {
	public void test() {
		System.out.println(this.getClass().getName());
	}

	public static void main(String[] args) {
		int a=0, b=0, c=0;
		Random r=new Random();
		HandleError hr=new HandleError();
		hr.test();
		for(int i=0;i<32;i++) {
			try {
				System.out.println("i value: "+i);
				System.out.println("r value: "+r);
				System.out.println("hr value: "+hr);
				b=r.nextInt();
				c=r.nextInt();
				System.out.println("b value: "+b);
				System.out.println("c value: "+c);
				a=12345/(b/c);
			}catch(ArithmeticException ex) {
				System.out.println("Division by zero.");
				a=0;
			}catch(RuntimeException ex) {
				System.out.println("Division by zero.");
				a=0;
			}
			System.out.println("a value: " +a);
		}

	}

}
