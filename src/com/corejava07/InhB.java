package com.corejava07;

public class InhB extends InhA{
	//public int k;
	InhB(int a, int b){
		super(a,b);
		System.out.println("Inside InhB Constructor");
		//k=c;
	}
	/*InhB(int a, int b){
		super.i=a;
		i=b;
	}*/
	/*void showK() {
		System.out.println("K value: "+ k);
	}*/
	void sum() {
		System.out.println("super.i"+ super.i);
		System.out.println("i value: "+ i);
	}
	void show() {
		System.out.println("i, j and k values: " + i+ " " +j);
	}
}
