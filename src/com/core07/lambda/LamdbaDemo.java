package com.core07.lambda;

public class LamdbaDemo {

	public static void main(String[] args) {
		MyNumber num=()->123.45;
		System.out.println(num.getValue());
		MyNumber num1=()->Math.random()*10;
		System.out.println(num1.getValue());
	}

}
