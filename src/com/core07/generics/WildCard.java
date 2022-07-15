package com.core07.generics;

public class WildCard<T> {
	T obj;
	public WildCard(T obj) {
		this.obj=obj;
	}
	
	public boolean wildCardArgument(WildCard<?> ob) {
		if(this==ob) return true;
		else return false;
	}

}
