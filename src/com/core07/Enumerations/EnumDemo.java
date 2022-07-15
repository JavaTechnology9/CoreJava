package com.core07.Enumerations;

public class EnumDemo {

	public static void main(String[] args) {
		Level le;
		le=Level.MEDIUM;
		System.out.println(le);
		if(le==Level.HIGH)
			System.out.println("LOW enum constaints");
		switch(le) {
		case HIGH:
			System.out.println("case HIGH");
			break;
		case LOW:
			System.out.println("case LOW");
			break;
		case MEDIUM:
			System.out.println("case MEDIUM");
			break;
		}
		for(Level les:Level.values())
			System.out.println(les);
		Level level = Level.valueOf("HIGH");
		level.setPrice(45);
		System.out.println(level.getPrice());
		
		Integer in=Integer.valueOf(41); // int long  Long, Byte byte, short Short (int)double
		System.out.println(in);
	}

}
