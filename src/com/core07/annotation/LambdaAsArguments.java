package com.core07.annotation;

public class LambdaAsArguments {
	static <T> T genericOps(StringFunc<T> x, T v) {
		return x.func(v);
	}
	static int fact(NumaricTest te, int value) {
		return te.test(value);
	}

	public static void main(String[] args) {
		String inStr="Lambda add power to Java";
		String ouStr;
		StringFunc<String> ucase=(str)->str.toUpperCase();
		ouStr=genericOps(ucase, inStr);
		System.out.println(ouStr);
		/*StringFunc<Integer> nt=(n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				System.out.print(i +" X "+result);
				result=i*result;
				System.out.println();
			}
			return result;
		};
		Integer ou=genericOps(nt, 8);
		System.out.println(ou);*/
		System.out.println(fact((n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				System.out.print(i +" X "+result);
				result=i*result;
				System.out.println();
			}
			return result;
		}, 3));

	}

}
