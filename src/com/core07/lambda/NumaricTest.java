package com.core07.lambda;

public interface NumaricTest {
	boolean test(int n, int m);
	//String stringTest(String a, int b);
	default void  defaultMethod() {
		System.out.println("this is the default method");
	}

}
