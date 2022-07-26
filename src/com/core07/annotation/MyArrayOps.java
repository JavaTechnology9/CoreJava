package com.core07.annotation;

public class MyArrayOps {
	static <T> int countMatching(T[] vals, T v) {
		int count=0;
		for(int i=0;i<vals.length;i++)
			if(vals[i]==v)count++;
		return count;
	}
	static <T> int genOperation(MyFunc<T> fc, T[] vals, T v){
		return fc.generics(vals, v);
	}

	public static void main(String[] args) {
		Integer[] iVals= {10,20,10,65,78,65,89};
		String[] sVals= {"ABC","123","456","789","123","963","123"};
		System.out.println(genOperation(MyArrayOps::countMatching, sVals, "123"));

	}

}
