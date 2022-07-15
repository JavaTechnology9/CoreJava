package com.core07.object;

public class OverloadDemoMain {

	public static void main(String[] args) {
		OverloadDemo demo=new OverloadDemo();
		OverloadDemo demo1=new OverloadDemo();
		demo1.overload(45,96);
		//demo.overload(45);
		demo.overload(78,96);
		System.out.println(demo.equalsTo(demo1));

	}

}
