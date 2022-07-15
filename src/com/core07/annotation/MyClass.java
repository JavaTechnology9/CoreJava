package com.core07.annotation;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	public MyClass(T[] o) {
		vals=o;
	}
	@Override
	public T min() {
		T v=vals[0];
		for(int i=1;i<vals.length;i++)
			if(vals[i].compareTo(v)<0)v=vals[i];
		return v;
	}

	@Override
	public T max() {
		T v=vals[0];
		for(int i=1;i<vals.length;i++)
			if(vals[i].compareTo(v)>0)v=vals[i];
		return v;
	}
	public static void main(String[] args) {
		Integer iarr[]= {10,45,78,96,21,41,63,36};
		Character carr[]= {'a','b','c','d','e','f','g'};
		MyClass<Integer> mc=new MyClass<>(iarr);
		System.out.println(mc.min());
		System.out.println(mc.max());
		
		MyClass<Character> mcc=new MyClass<>(carr);
		System.out.println(mcc.min());
		System.out.println(mcc.max());
	}

}
