package com.core07.annotation;

import com.core07.lambda.EmptyArrayException;

public class LamdaExceptionDemo {

	public static void main(String[] args) {
		double values[]= {10.2,78.3,96.3,45.1,85.6};
		DoubleArrayExample ex=(n)->{
			double sum=0.0;
			if(n.length==0)
				throw new EmptyArrayException();
			for(int i=0;i<n.length;i++)
				sum+=n[i];
			return sum;
		};
		try {
			System.out.println("sum of doubles values: "+ ex.func(values));
			System.out.println("sum of doubles values: "+ ex.func(new double[0]));
		} catch (EmptyArrayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
