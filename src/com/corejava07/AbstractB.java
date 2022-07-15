package com.corejava07;

public class AbstractB extends AbstractA{
	public AbstractB() {
		System.out.println("default constructor in AbstractB class");
	}

	@Override
	void callme() {
		System.out.println("B's implementation of callme method");
		
	}
	void bTest() {
		System.out.println("AbstractB class method");
	}
	void callmetoo() {
		System.out.println("This is concrete method in AbstractB class");
	}

}
