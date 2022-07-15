package com.core07.exception;

public class MultipleException {

	public static void main(String[] args) {
		try {
			int len=args.length;
			System.out.println("length: "+ len);
			int b=42/len;
			System.out.println("b value: "+ b);
			int c[]= {1,2,3,4,5,6};
			System.out.println("c length: "+ c.length);
			c[5]=99;
			System.out.println("c value: "+c[0]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Divide by zero:/ Array Index oob: "+ex);
		}catch(Exception ex) {
			System.out.println("Exception: "+ex);
		}finally{
			System.out.println("finally block");
		}
		System.out.println("after try/catch blocks.");

	}

}
