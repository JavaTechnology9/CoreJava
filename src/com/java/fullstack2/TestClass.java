package com.java.fullstack2;

public class TestClass implements TestInterface{
	private int a;
	public TestClass(int value) {
		a=value;
	}

	@Override
	public void square(int a) {
		System.out.println(a*a);
		
	}
	public void show() {
		System.out.println("a value: "+a);
	}
	public static void main(String[] args) {
		TestClass ti=new TestClass(25);
		ti.square(4);
		ti.show();
		TestInterface.show();
	}

}
