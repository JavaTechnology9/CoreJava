package com.corejava07;

public class AnotherClient implements Callback{

	@Override
	public void callback(int param) {
		
		System.out.println("p squared is: " + (param*param));
	}

}
