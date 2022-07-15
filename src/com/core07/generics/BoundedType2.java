package com.core07.generics;

import com.core07.Inheritance.Box;

public class BoundedType2<Z extends Box> {
	private Z obj;
	public BoundedType2(Z obj) {
		this.obj=obj;
	}
	double vol() {
		return obj.volume();
	}

}
