package com.core07.generics;

import com.core07.Inheritance.Box;

public class WildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildCard<Integer> wi1=new WildCard<Integer>(78);
		WildCard<Integer> wi2=wi1;
		WildCard<Double> wid=new WildCard<Double>(45.12);
		WildCard<String> wis=new WildCard<String>("ABC");
		Box box=new Box();
		WildCard<Box> wib=new WildCard<Box>(box);
		System.out.println(wi1.wildCardArgument(wib));

	}

}
