package com.core07;

public class NestedSwitch {

	public static void main(String[] args) {
		int count=1;
		int target=3;
		switch(count) { //outer
		case 1:
			System.out.println("case 1");
			break;
		case 12:
			switch(target) { //internal
			case 0:
				System.out.println("case 0: in nestedSwitch");
				break;
			case 1:
				System.out.println("case 1: in nestedSwitch");
				break;
			case 2:
				System.out.println("case 2: in nestedSwitch");
				break;
			case 3:
				System.out.println("case 3: in nestedSwitch");
				break;
			}
			System.out.println("case 12: in outerSwitch");
			break;
		}

	}

}
