package com.core07.generics;

public class Coords<T extends TwoD> {
	T[] coords;
	public Coords(T[] o) {
		coords=o;
	}
	static void showXY(Coords<? extends TwoD> c) {
		System.out.println("X and Y Values:");
		for(int i=0; i<c.coords.length;i++)
			System.out.println(c.coords[i].x + ", "+c.coords[i].y);
		System.out.println();
	}
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X, Y,and Z Values:");
		for(int i=0; i<c.coords.length;i++)
			System.out.println(c.coords[i].x + ", "+c.coords[i].y+", "+ c.coords[i].z);
		System.out.println();
	}
	static void showAll(Coords<? extends FourD> c) {
		System.out.println("X, Y,Z and T Values:");
		for(int i=0; i<c.coords.length;i++)
			System.out.println(c.coords[i].x + ", "+c.coords[i].y+", "+ c.coords[i].z+ ", "+c.coords[i].t);
		System.out.println();
	}
}
