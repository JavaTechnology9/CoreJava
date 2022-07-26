package com.core07.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Stringbuffer");
		buffer.append(" append").append(" append").append(" final Append");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		//buffer.ensureCapacity(89);
		buffer.setLength(45);
		System.out.println(buffer.charAt(38));
		buffer.setCharAt(40, 'l');
		buffer.setCharAt(44, 'T');
		char ch[]=new char[50];
		buffer.getChars(0, 45, ch, 0);
		//buffer.insert(46, 45.23);
		buffer.insert(42, false);
		buffer.deleteCharAt(44);
		buffer.delete(40, 57);
		System.out.println(buffer.substring(20,35));
		System.out.println(buffer);
		//for(char cha:ch) System.out.print(cha+ " ");
		

	}

}
