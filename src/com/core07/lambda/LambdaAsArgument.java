package com.core07.lambda;

public class LambdaAsArgument {
	static String parameter(StringFunc sf,String str) {
		return sf.func(str);
	}
	public static void main(String[] args) {
		String inStr="Lambda add power to Java";
		String ouStr;
		System.out.println("Here is input Str: "+ inStr);
		
		System.out.println(parameter((str)->str.toUpperCase(), inStr));
		ouStr=parameter((String str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		},inStr);
		System.out.println(ouStr);
		MyStringOps ops=new MyStringOps();
		ouStr=parameter(ops::strReverse, inStr);
		System.out.println(ouStr);
	}

}
