package com.corejava07;

public class OverLoadDemo {
	public void test() {
		System.out.println("No parameters");
	}
	/*void test(int a) {
		System.out.println("a value: "+a);
	}*/
	void test(int a,int b) {
		System.out.println("a and b values: " + a +" "+b );
	}
	double test(double d) {
		System.out.println("d value: "+d);
		return d*d;
	}
	public static void main(String[] args) {
		OverLoadDemo demo=new OverLoadDemo();
		demo.test();
		demo.test(10);
		demo.test(20,30);
		demo.test(40.0);
	}
}
