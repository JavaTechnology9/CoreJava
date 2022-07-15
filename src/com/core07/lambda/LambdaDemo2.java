package com.core07.lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumaricTest isEven=(int n,int m)->(n%m)==0;
		if(isEven.test(10,20))
			System.out.println("10 is even number");
		if(!isEven.test(9,20))
			System.out.println("9 is not even number ");
		isEven.defaultMethod();
		
		NumaricTest isNotNeg=(n,m)->n>=m;
		if(isNotNeg.test(1,0))
			System.out.println("1 is not negative");
		if(!isNotNeg.test(-10,0)) System.out.println("-10 is negative value");
	}

}
