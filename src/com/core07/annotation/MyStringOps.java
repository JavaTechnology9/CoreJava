package com.core07.annotation;

public class MyStringOps {
	 String strReverse(String str, int count) {
		String result="";
		for(int i=str.length()-1;i>=0;i--)
			result+=str.charAt(i);
		return result;
	}
	static String reference(StringFunc fc, String str, int count) {
		return fc.func(str, count);
	}
	public static void main(String[] args) {
		String inStr="Lambda added into Java";
		MyStringOps ops=new MyStringOps();
		System.out.println(reference(ops::strReverse,inStr,10));

	}

}
