package com.facebook.exception;

public class ThrowsDemo {

	public static void main(String[] args)  {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			/*// TODO Auto-generated catch block
			e.printStackTrace();*/
		}

	}

	private static void throwOne() throws IllegalAccessException  {
		System.out.println("Inside throwOne method");
		throw new IllegalAccessException("AccessException");
		
	}

}
