package com.core07.annotation;

public interface MyNumber {
	double getValue();
	//int abMethod();

	default void fmethod() {
		System.out.println("default method");
	}
}
