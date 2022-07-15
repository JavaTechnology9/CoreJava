package com.core07.lambda;

public class MyStringOps {
	public  String strReverse(String str) {
		String result="";
		int i;
		for(i=str.length()-1;i>=0;i--)
			result+=str.charAt(i);
		return result;
	}

}
