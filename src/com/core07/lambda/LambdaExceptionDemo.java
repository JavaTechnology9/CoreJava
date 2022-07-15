package com.core07.lambda;

public class LambdaExceptionDemo {

	public static void main(String[] args) {
		double[] values= {10.1,20.2,30.3,40.4,50.5,60.6};
		NumaricArrayFunc arrayFunc=(double[] n)->{
			double sum=0.0;
			if(n.length==0)
				throw new EmptyArrayException();
			for(int i=0;i<n.length;i++)
				sum+=n[i];
			return sum;
		};
		try {
			System.out.println("sum of double values: " + arrayFunc.func(values));
			System.out.println("sum of double values: " + arrayFunc.func(new double[0]));
		} catch (EmptyArrayException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Array Exception is handled: "+ e);
		}
		

	}

}
