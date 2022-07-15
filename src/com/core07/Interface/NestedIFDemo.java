package com.core07.Interface;

public class NestedIFDemo {

	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		NestedIFImpl imp=new NestedIFImpl();
		if(imp.isNotNegative(45))
			System.out.println("45 is not negative");
		if(!imp.isNotNegative(-12))
			System.out.println("-12 is Negative value");
		 

	}

}
