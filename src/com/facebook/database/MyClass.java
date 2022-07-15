package com.facebook.database;

import java.util.List;

public class MyClass implements InterfaceB{

	@Override
	public void meth1() {
		System.out.println("Implement meth1()");
		
	}

	@Override
	public void meth2() {
		System.out.println("Implement meth2()");
		
	}

	@Override
	public void meth3() {
		System.out.println("Implement meth3()");
		
	}
	public static void main(String[] args) {
		MyClass mc=new MyClass();
		mc.meth1();
		mc.meth2();
		mc.meth3();
	
	}

}
