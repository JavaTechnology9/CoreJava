package com.facebook.database;

public interface IntStack {
	void push(int item);
	int pop();
	default void clear() {
		System.out.println("clear() method is not implemented");
	}

}
