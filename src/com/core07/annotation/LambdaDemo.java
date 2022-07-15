package com.core07.annotation;

public class LambdaDemo {
	static double getValue() {
		return 123.45;
	}

	public static void main(String[] args) {
		/*MyNumber num=()->123.45;
		System.out.println("Fixed Number "+num.getValue());
		num.fmethod();
		MyNumber num1=()->Math.random();
		System.out.println(num1.getValue());*/
		
		/*NumaricTest nt=(n)->(n%2)==0;
		if(nt.test(10)) System.out.println("10 is even");
		else System.out.println("10 is not even number");
		
		if(nt.test(9)) System.out.println("9 is even");
		else System.out.println("9 is not even number");
		
		NumaricTest nt1=(int n)->n>=0;
		if(nt1.test(100)) System.out.println("100 is not negative value");
		
		if(!nt1.test(-100)) System.out.println("-100 is negative value");*/
		
		/*NumaricTest nt=(int n, int a)->(n%a)==0;
		if(nt.test(10, 2)) System.out.println("10 is even");
		if(!nt.test(10, 3)) System.out.println("10 is not even");*/
		
		StringFunc<Integer> nt=(n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				System.out.print(i +" X "+result);
				result=i*result;
				System.out.println();
			}
			return result;
		};
		System.out.println("factorial of 3: " + nt.func(6));
		
		StringFunc<String> f1=(str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println("Lambda  reverse: " +f1.func("Lambda"));
	}

}
