package com.core07.annotation;

public class MyClass<T> {
	private T value;

	public MyClass() {
		value = null;
	}

	public MyClass(T val, boolean bol) {
		System.out.println("Two parameter constructor is called: " + val+", "+ bol );
		value = val;
	}

	T getValue() {
		return value;
	}
	static <R,T> R conMethod(ConFunc<R,T> fc, T value, boolean v) {
		return fc.conFun(value, v);
	}
	public static void main(String[] args) {
		/*ConFunc con=;
		MyClass myClass = con.conFun(10,true);
		System.out.println(myClass.getValue());*/
		System.out.println(conMethod(MyClass::new, 100, true).getValue());
		
	}

}
