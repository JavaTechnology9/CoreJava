package com.core07.lambda;

public class BlockLambdaDemo {

	public static void main(String[] args) {
		SomeFunc<Integer> factorial=(n)->{
			int result=1;
			for(int i=1; i<=n;i++)
				result=i*result;
			return result;
		};
		System.out.println(factorial.func(3));
		System.out.println(factorial.func(5));

	}

}
