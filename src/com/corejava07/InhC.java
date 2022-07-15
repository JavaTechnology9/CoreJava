package com.corejava07;

public class InhC extends InhB{
	public int m;
	InhC(int a, int b){
		super(a,b);
		System.out.println("Inside InhC Constructor");
		//m=d;
	}
	void show() {
		System.out.println("i, j, k and m values: " + i+ " " +j);
	}

}
