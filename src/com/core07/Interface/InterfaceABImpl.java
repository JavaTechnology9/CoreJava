package com.core07.Interface;

public class InterfaceABImpl implements InterfaceB{

	@Override
	public void meth1() {
		System.out.println("Implemented meth1() method");
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Implemented meth2() method");
		
	}

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		System.out.println("Implemented meth3() method");
		
	}
	/*@Override
	public String getString() {
		// TODO Auto-generated method stub
		return "Implemented in Sub class ";
	}*/
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return InterfaceB.super.getString();
	}
	static int getNumber() {
		return 12*12;
	}

}
