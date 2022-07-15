package com.facebook.Enum;

public class AutoboxingUnboxing {
	static int method(Integer v) {
		return v;// auto-unboxing
	}
	public static void main(String[] args) {
		int val=200;
		Integer i=Integer.valueOf(val);
		int value = i.intValue();
		System.out.println(value);
		Integer iob=100;// autoboxing 
		int in=iob;
		System.out.println(iob.reverse(in));
		System.out.println(in +" "+ iob);
	
	}

}
