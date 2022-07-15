package com.corejava07;

public class StringSwitch {

	public static void main(String[] args) {
		String str="one";
		char target='D';
		switch (str) {
		case "one":
			switch(target) {
			case 'A':
				System.out.println("A value");
				break;
			case 'B':
				System.out.println("B value");
				break;
			case 'D':
				System.out.println("D value");
				break;
			}
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		case "four":
			System.out.println("four");
			break;

		default:
			System.out.println("no match");
		}

	}

}
