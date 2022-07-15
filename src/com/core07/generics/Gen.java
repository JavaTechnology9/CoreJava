package com.core07.generics;

import com.core07.Inheritance.Box;

public class Gen<T> {
	T obj;
	public Gen(T obj) {
		this.obj=obj;
	}
	T getObj() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T is: "+ obj.getClass().getName());
	}
	public static void main(String[] args) {
		Gen<Integer> obj;
		obj=new Gen<>(88);
		int value=obj.getObj();
		System.out.println(value);
		obj.showType();
		
		Gen<String> str=new Gen<>("Gneric String");
		str.showType();
		Box box=new Box(45.3,78.2,96.1);
		Gen<Box> gBox=new Gen<>(box);
		gBox.showType();
		Box box2 = gBox.getObj();
		System.out.println(box2.getWidth()+ ", " + box2.getHeight()+ ", "+ box2.getDepth());
		//Gen<int> in=new Gen<>(45);
	}

}
