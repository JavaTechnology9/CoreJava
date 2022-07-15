package com.facebook.Enum;

public class EnumDemo {

	public static void main(String[] args) {
		Level le;
		le=Level.HIGH;
		System.out.println("value of Level: " +le);
		if(le==Level.HIGH)
			System.out.println("Value of Level inside IF condition: "+ le);
		switch(le) {
		case LOW:
			System.out.println("case LOW constants");
			break;
		case HIGH:
			System.out.println("case HIGH constants");
			break;
		case MEDIUM:
			System.out.println("case MEDIUM constants");
			break;
			default:
				System.out.println("another case");
		
		}
		for(Level l:Level.values()) {
			System.out.println(l.name()+ " "+ l.ordinal());
			if(l.compareTo(le)<0) {
				System.out.println("inside comprateTO method: "+ l);
			}
			if(l.compareTo(le)==0) {
				System.out.println("inside comprateTO == method: "+ l);
			}
		}

		Level level = Level.valueOf("LOW");
		System.out.println(level.ordinal());

	}

}
