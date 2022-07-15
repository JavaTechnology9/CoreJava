package com.java.fullstack2;

public class Client implements Callback{

	@Override
	public void callback(int param) {
		System.out.println("callback method called with param: " +var);
	}
	void nonInterfaceMethod() {
		System.out.println("specific method in Client class");
	}
	public static void main(String[] args) {
		Client cb=new Client();
		cb.callback(10);
		cb.nonInterfaceMethod();
	}

}
