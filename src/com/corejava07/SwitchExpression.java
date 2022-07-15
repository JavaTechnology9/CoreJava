package com.corejava07;

public class SwitchExpression {

	public static void main(String[] args) {
		int month=12;
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2:
			season="Winter";
			break;
		case 3:
		case 4:
		case 5:
			season="Spring";
			break;
		case 6:
		case 7:
		case 8:
			season="Summer";
			break;
		case 9:
		case 10:
		case 11:
			season="Autumn";
			break;
		default:
			season="Bogus month";
		}
		System.out.println(season);
		/*for(int i=0;i<12;i++)
			switch (i) {
			case 0: //insert
			case 1: //update
			case 2: // delete
			case 3:// load
			case 4://delete based id
				System.out.println("i is less than 5");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is less than 10");
				break;
			default:
				System.out.println("i is 10 or more");
			}*/

	}

}
