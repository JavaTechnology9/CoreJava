package com.core07.annotation;

import com.core07.Inheritance.Box;

public class NonGeneric {
	Object obj;

	public NonGeneric(Object obj) {
		this.obj = obj;
	}

	Object getObj() {
		return obj;
	}
	void showType() {
		System.out.println(obj.getClass().getName());
	}
	public static void main(String[] args) {
		NonGeneric iob=new NonGeneric(100);
		iob.showType();
		Integer value=(Integer) iob.getObj();
		System.out.println(iob.getObj());
		NonGeneric ios=new NonGeneric("String example");
		ios.showType();
		
		NonGeneric io=new NonGeneric(new Box());
		io.showType();
	}

}
