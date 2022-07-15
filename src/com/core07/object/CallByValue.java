package com.core07.object;

public class CallByValue {
	static void meth(int i, int j) {
		i*=2;// i=i*2
		j/=2;// j=j/2
		System.out.println("i and j values: "+ i + " " +j);
	}
	public static void main(String[] args) {
		int a=15; int b=20;
		System.out.println("before calling the meth method a and b values: "+ a + " "+b);
		meth(a, b);
		a*=2;
		b/=2;
		System.out.println("after calling the meth method a and b values: "+ a + " "+b);
	}
	

}
