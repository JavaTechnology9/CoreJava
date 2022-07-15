package com.facebook.database;

public class GrandParent implements MultipleInA, MultipleInB{
	void fun() {
		System.out.println("fun method from Grandparent class");
	}

	
	public void show() {
		// TODO Auto-generated method stub
		MultipleInA.show();
	}
	public static void main(String[] args) {
		GrandParent gp=new GrandParent();
		gp.show();
	}

}
