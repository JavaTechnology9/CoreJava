package com.core07.object;

public class ReturningObjects {
	private int a;
	public ReturningObjects(int i) {
		a=i;
	}
	ReturningObjects incrByTen() { 
		ReturningObjects objects=new ReturningObjects(a+10);
		return objects;
	}
	public static void main(String[] args) {
		ReturningObjects obj=new ReturningObjects(10);
		System.out.println(obj.a);
		ReturningObjects byTen = obj.incrByTen();
		System.out.println(byTen.a);
	}

}
