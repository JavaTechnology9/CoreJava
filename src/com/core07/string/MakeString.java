package com.core07.string;

public class MakeString {

	public static void main(String[] args) {
		/*char ch[]= {'J','A','V','A'};
		byte[] barr= {96,85,74,65,68,101,115,124};
		String s1=new String(ch);
		String s2=new String(barr,1,barr.length-1);
		System.out.println(s1.length());
		String s3="abcdefg";// String literal
		System.out.println(s3.length());
		System.out.println(s3);*/
		
		//String age="9";
		//int age=19;
		//boolean age=false;
		/*double age=45.12;
		String s="He is " + age + " Years old."; // Concatenation
		System.out.println(s.charAt(s.length()-10));
		char ch="abc".charAt(2);
		int len="abc".length();
		System.out.println(len);
		System.out.println(ch);
		String s1=new String("abc");
		String s3=new String("abc");
		System.out.println(s1.length());
		String s2="abc";*/
		//System.out.println(s+ " Testing");
		//System.out.println(45+ " Test");
		/*String s1="abcdefg";
		char ch[]=new char[s1.length()];
		System.out.println(ch);
		s1.getChars(3, s1.length(), ch, 0); 
		System.out.println(ch);
		for(byte bytes :s1.getBytes())
			System.out.print(bytes+ " ");*/
		/*String s="four:" +( 2+2);// four: 4 or four: 22
		System.out.println(s);
		String valueOf = String.valueOf(false);
		System.out.println(valueOf.length());
		char ch[]= {'J','A','V','A'};
		System.out.println(String.copyValueOf(ch));
		String s1="String";
		String s2=String.copyValueOf(ch);
		System.out.println(String.format("Java Provides %s concepts", s1));
		System.out.println(String.format("double value: %.2f", 47.45872));
		System.out.println(String.format("Company info is: %1$s, %2$s", s2,s1));
		//System.out.println(String.format("Java Provides %s concepts", ch));
		String message = String.join("%", "Java", "is", "cool");
		System.out.println(message);*/
	     // message returned is: "Java-is-cool"
		/*char ch[]= {'J','A','V','A'};
		String s1=new String (ch);*/
		//char[] charArray = s1.toCharArray();
		/*for(char charArray:s1.toCharArray())
			System.out.print(charArray+" ");*/
		/*String s2="Hello";
		String s3="Hello";
		String s4="Good-bye";
		String s5="HELLO";
		String s1=new String (s2);
		String s6=s1;*/
		/*System.out.println(s2+ " equals: "+ s3+ "->"+s2.equals(s3));
		System.out.println(s3+ " equals: "+ s4+ "->"+s3.equals(s4));
		System.out.println(s4+ " equals: "+ s5+ "->"+s4.equals(s5));
		System.out.println(s2+ " equals: "+ s5+ "->"+s2.equals(s5));
		System.out.println(s2+ " equalsIgnoreCase: "+ s5+ "->"+s2.equalsIgnoreCase(s5));
		if(s2.startsWith("He",1)) System.out.println("it is started with He");
		if("Foobar".startsWith("Foo")) System.out.println("Given String started with Foo");
		if("Foobar".endsWith("bar")) System.out.println("it is ended with bar");*/
		
		/*System.out.println(s1+ " equals "+s2+ "->"+s1.equals(s2));
		System.out.println(s1+ " == " + s2+ "->"+ (s1==s6));*/
		//System.out.println(s2.lastIndexOf('l'));
		
		String org=" This is a test. This is too. ";
		String substring = org.substring(6,21);
		System.out.println(substring);
		System.out.println(org.concat(" concat").concat(" contact"));
		System.out.println(org.replace("This", "replace"));
		System.out.println(org.trim());
		System.out.println(org.toLowerCase());
		System.out.println(org.toUpperCase());
 
	}

}
