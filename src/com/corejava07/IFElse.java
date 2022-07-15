package com.corejava07;

public class IFElse {

	public static void main(String[] args) {
		int month=1;
		int days=20;
		String season;
		if(month==12|| month==1 || month==2)
			season="Winter";
		if(days==3|| days==4 || days==20)
			season="Spring";
		else if(month==6 || month==7|| month==8)
			season="Summer";
		else if(month==9 || month==10|| month==11)
			season="Autumn";
		else 
			season="Bogus month";
		System.out.println(season);

	}

}
