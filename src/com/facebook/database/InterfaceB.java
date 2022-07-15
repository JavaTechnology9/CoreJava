package com.facebook.database;

public interface InterfaceB extends InterfaceA{
	default void meth3() {
		System.out.println("default meth3 method");
	}

}
