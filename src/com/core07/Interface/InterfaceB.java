package com.core07.Interface;

public interface InterfaceB extends InterfaceA{
	void meth3();
	default String getString() {
		return "Default String";
	}
	static int getNumber() {
		return 10*10;
	}

}
