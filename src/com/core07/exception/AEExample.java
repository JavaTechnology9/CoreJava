package com.core07.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AEExample {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		int a=10;
		int d=42/a;
		System.out.println(d);
		throw new CustomException("exception is throwing");
		//String str=null;
		//str.codePoints();
		
		/*int arr[]=new int [5];
		arr[10]=100;*/
		/*try {
			FileInputStream fis=new FileInputStream("Java language");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/* Exception in thread "main" CustomException [message=exception is throwing]
	at com.core07.exception.AEExample.main(AEExample.java:13)*/

	}

}
