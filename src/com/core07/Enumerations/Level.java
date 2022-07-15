package com.core07.Enumerations;

public enum Level {
	LOW, MEDIUM,HIGH;
	private int price;
	
	 Level(int p) {
		price=p;
	}
	 int getPrice() {
		 return price;
	 }
	 private Level() {
		// TODO Auto-generated constructor stub
	}
	 public void setPrice(int price) {
		 this.price=price;
	 }
	 
}
