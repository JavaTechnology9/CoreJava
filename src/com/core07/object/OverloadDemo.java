package com.core07.object;

public class OverloadDemo {
	private int a, b;
	void overload() {
		System.out.println("No Parameter");
	}
	void overload(double a) {
		System.out.println("One Parameter: " +a);
	}
	void overload(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("two Parameters: " +a+ " "+b);
	}
	void overload(int a) {// type 
		System.out.println("One Parameter: " +a);
	}
	void overload(int b,double a) {// order of the parameter
		System.out.println("two Parameters: " +b+ " "+a);
	}
	/*void overload(char ch1, char ch2) {
		System.out.println(ch1+" " +ch2);
	}*/
	boolean equalsTo(OverloadDemo demo) {
		System.out.println(demo);
		System.out.println(this);
		if(demo.a==a || demo.b==b)return true;
		else return false;
	}

}
