package com.core07.exception;
public class NestedTry{
	public static void main(String[] a){
		try{
			int len=a.length;
			System.out.println("len :" +len);
			int b=42/len;
			System.out.println("b value: "+b);
			try{
				if(len==1) len=len/(len-len);
				if(len==2){
					int c[]={10};
					c[3]=99;
				}
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Array Inxed OOB: "+ ex);
			}
		}catch(ArithmeticException ex){
			System.out.println("Division by zero: "+ ex);
		}
	}
}