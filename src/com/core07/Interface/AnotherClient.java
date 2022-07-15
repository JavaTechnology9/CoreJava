package com.core07.Interface;

public class AnotherClient implements Callback{

	@Override
	public void call(int param) {
		System.out.println("Another version of call method");
		System.out.println("param squared is: "+ (param*param));
	
	}
	public static void main(String[] args) {
		AnotherClient client=new AnotherClient();
		client.call(3);
		System.out.println(client.value);
	}

}
