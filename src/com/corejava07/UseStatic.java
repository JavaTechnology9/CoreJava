package com.corejava07;

public class UseStatic {
	public static int a=3;
	static int b;
	public int c;
	
	static void meth(int x) {
		System.out.println("x= " + x);
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
	}
	void instanceMethod(int x) {
		System.out.println("x= " + x);
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		meth(x);
	}
	static {
		// static block
		System.out.println("static block is initialized");
		b=a*4;
		
	}
	{
		System.out.println("instance block");
		c=a*b;
	}

	public static void main(String[] args) {
		UseStatic us=new UseStatic();
		UseStatic.meth(12);
		System.out.println(UseStatic.a);
		System.out.println(b);
		System.out.println(us.c);
		us.instanceMethod(20);
	}

}
