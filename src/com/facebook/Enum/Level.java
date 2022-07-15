package com.facebook.Enum;

public enum Level {
	LOW(45),MEDIUM(65),HIGH(95);
	private int price;
	Level(int price){
		this.price=price;
	}
	int getPrice() {
		return price;
	}
	

}
