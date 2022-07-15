package com.corejava07;

public abstract class AbstractA {
	public int value=25;
	public AbstractA() {
		System.out.println("default constructor in AbstractA class");
	}
	 abstract void callme(); 
	void callmetoo() {
		System.out.println("This is concrete method");
	}

}
