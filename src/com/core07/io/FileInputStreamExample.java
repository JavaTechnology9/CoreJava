package com.core07.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		int i; 
		FileInputStream inputStream = null;
		FileOutputStream outputStream=null;
		try {
			inputStream=new FileInputStream("Test.txt");
			outputStream=new FileOutputStream("second1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open the file");
			e.printStackTrace();
			return;
		}
		try {
			do {
				i=inputStream.read();
				if(i!=-1) {
					outputStream.write(i);
					System.out.print((char)i+ " ");
				}
			}while(i!=-1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			System.out.println("error while closing the file");
			e.printStackTrace();
		}

	}

}
