package com.core07.object;

public class CallByReference {
	private int a,b;
	public CallByReference(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void meth(CallByReference call) {
		System.out.println(call);
		call.a*=2;
		call.b/=2;
		System.out.println("a and b values: "+ call.a + " " +call.b);
	}

	public static void main(String[] args) {
		CallByReference cbr=new CallByReference(15, 20);
		System.out.println(cbr);
		System.out.println("before calling the meth method a and b values: "+ cbr.a + " "+cbr.b);
		cbr.meth(cbr);
		System.out.println("after calling the meth method a and b values: "+ cbr.a + " "+cbr.b);

	}

}
