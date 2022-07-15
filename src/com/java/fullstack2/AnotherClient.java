package com.java.fullstack2;

public class AnotherClient implements Callback{

	@Override
	public void callback(int param) {
		System.out.println("Another version of callback");
		System.out.println("param squared is: " +(param*param));
		
	}
	public static void main(String[] args) {
		Callback cb=new AnotherClient();
		cb.callback(5);
	}

}
