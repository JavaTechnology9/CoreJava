package com.core07.annotation;

import com.core07.Inheritance.Box;

public class Generics<T, V> {
	T obj; // int obj String obj
	V obj2;
	Generics(T obj, V obj2){
		this.obj=obj;
		this.obj2=obj2;
	}
	T getObj() {
		return obj;
	}
	V getObj2() {
		return obj2;
	}
	void showType() {
		obj.getClass();
		System.out.println("Type of T is: "+ obj.getClass().getName());
		System.out.println("Type of V is: "+ obj2.getClass().getName());
	}
	public static void main(String[] args) {
		Generics<Integer, String> gen=new Generics<>(200,"Test");
		gen.showType();
		System.out.println(gen.getObj());
		System.out.println(gen.getObj2());
		Generics<String, Character> gen1=new Generics<>("Generics Example",'G');
		gen1.showType();
		System.out.println(gen1.getObj());
		System.out.println(gen1.getObj2());
		Generics<Box,Double> gen12=new Generics<Box, Double>(new Box(),123.45);
		gen12.showType();
		System.out.println(gen12.getObj());
		System.out.println(gen12.getObj2());
	}

}
