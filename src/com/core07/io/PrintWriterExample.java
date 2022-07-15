package com.core07.io;

import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		PrintWriter writer=new PrintWriter(System.out, true);
		int i=7;
		writer.println(i);
		char ch='D';
		writer.println(ch);

	}

}
