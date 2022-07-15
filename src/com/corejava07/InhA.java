package com.corejava07;

public  class InhA{
	public int i, j;
	InhA(int a, int b){
		System.out.println("Inside InhA constructor");
		i=a;
		j=b;
	}
	// display i and j values
	 void show() {
		System.out.println("i and j values: " + i+ " " +j);
	}
}
