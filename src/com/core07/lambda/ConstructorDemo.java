package com.core07.lambda;

public class ConstructorDemo {
	static <R,T> R myClassFactory(MyFunc<R, T> cons, T v) {
		return cons.func(v);
	}
	public static void main(String[] args) {
		MyFunc<MyClass,Integer> myCon=MyClass::new;
		System.out.println(myClassFactory(myCon, 100).getVal());
		MyClass<Integer> func = myCon.func(100);
		System.out.println(func.getVal());
		
		MyFunc<MyClass,String> myCon1=MyClass::new;
		MyClass<String> func1 = myCon1.func("String");
		System.out.println(func1.getVal());
	}

}
