package com.facebook.exception;

public class ThrowDemo {

	public static void main(String[] args) {
		try{
			dempNPE();
		
		}catch(NullPointerException ex) {
			System.out.println("from main method :" +ex );
		}finally {
			System.out.println("finally in main method");
		}
		

	}

	private static void dempNPE() {
		try {
			throw new MyException("custom exception");
		}catch(NullPointerException ex) {
			System.out.println("from dempNPE method: "+ ex);
			//throw ex;
		}catch(MyException ex) {
			System.out.println("from MyException method: "+ ex);
			//throw ex;
		}finally {
			System.out.println("finally in dempNPE method");
		}
		
	}

}
