package com.corejava07;

public class Client implements Callback{

	@Override
	public void callback(int param) {
		System.out.println("callback called with "+ param);
		
	}
	void nonIfaceMeth() {
		System.out.println("other method in Client class");
	}

}
