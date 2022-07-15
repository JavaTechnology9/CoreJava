package com.corejava07;

public class CallByReference {
	int a,b;
	public CallByReference(int i, int j) {
		a=i;
		b=j;
	}
	CallByReference meth() {
		CallByReference cbr1 =new CallByReference(45,78);
		System.out.println(cbr1);
		return cbr1;
	}

	public static void main(String[] args) {
		CallByReference cbr=new CallByReference(15,20);
		System.out.println("a and b before call to meth method: " + cbr.a + " " +cbr.b);
		CallByReference cbr1 = cbr.meth();
		System.out.println("a and b after call to meth method: " + cbr1.a + " " +cbr1.b);
		System.out.println(cbr1);

	}

}
