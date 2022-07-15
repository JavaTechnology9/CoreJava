package com.core07.annotation;

public class Coords<T extends TwoD> {
	T[] coords;
	public Coords(T[] o) {
		coords=o;
	}
	static void showXY(Coords<? extends FourD> co) {
		for(int i=0; i<co.coords.length;i++)
			System.out.println(co.coords[i].x+ " "+ co.coords[i].y);
	}
	public static void main(String[] args) {
		TwoD[] tarr=new TwoD[2];
		tarr[0]=new TwoD(10,20);
		tarr[1]=new TwoD(45,55);
		Coords<TwoD> co=new Coords<>(tarr);
		//showXY(co);
		
		ThreeD[] tar=new ThreeD[2];
		tar[0]=new ThreeD(10,20,30);
		tar[1]=new ThreeD(45,55,65);
		Coords<ThreeD> co1=new Coords<>(tar);
		//howXY(co1);
	}

}
