package com.corejava07;

public class CallByValue {
	void meth(int i, int j) {
		i*=2;// i=i*2
		j/=2; // j=j/2
	}

	public static void main(String[] args) {
		CallByValue value1=new CallByValue();
		int a=15, b=20;
		System.out.println("a and b before call to meth method: " + a + " " +b);
		value1.meth(a, b);
		System.out.println("a and b after call to meth method: " + a + " " +b);

	}

}
