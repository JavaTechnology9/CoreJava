package com.java.fullstack2;

public interface IntStack {
	
	default void push(int item) {
		System.out.println("default push method");
	}
	int pop();

}
