package com.core07.lambda;

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		SomeFunc<String> reverse=(String str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println("Lambda Reverse: "+ reverse.func("Lambda"));
		System.out.println("Expression Reverse: "+ reverse.func("Expression"));

	}

}
