package com.core07.Interface;

public interface IntStack {
	void push(int param);
	int pop();
	default void clear() {
		System.out.println("clear() is not implemented.");
	}

}
