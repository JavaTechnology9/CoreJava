package com.core07.annotation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.charset.Charset;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		/*BufferedReader reader=new BufferedReader(new FileReader("Test.txt"));
		try {
			String ch;
			System.out.println(reader.readLine());
			do {
				ch=reader.readLine();
				System.out.print(ch +" ");
			}while(ch!='q');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*FileReader reader=new FileReader("Test.txt");
		System.out.write((char)reader.read());
		System.out.write('\n');*/
		/*PrintWriter pw=new PrintWriter("Second1.txt");
		pw.println("This is a String and this message is pussed into second1.txt file");
		pw.close();*/
		FileInputStream fis=new FileInputStream("Test.txt");
		FileOutputStream fos=new FileOutputStream("D:\\Eclipse_Workspaces\\Core07\\Core07\\src\\com\\core07\\annotation\\output.txt");
		int ch;
		do{
			ch = fis.read();
			if(ch!=-1)fos.write(ch);
			//System.out.print((char)ch+" ");
		}while(ch!=-1);
		fis.close();
		fos.close();

	}

}
