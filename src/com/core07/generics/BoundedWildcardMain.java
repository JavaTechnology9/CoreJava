package com.core07.generics;

public class BoundedWildcardMain {

	public static void main(String[] args) {
		TwoD tarr[]=new TwoD[3];
		tarr[0]=new TwoD(12, 24);
		tarr[1]=new TwoD(32,42);
		tarr[2]=new TwoD(45,65);
		Coords<TwoD> tcoords=new Coords<>(tarr);
		Coords.showXY(tcoords);
		ThreeD tharr[]=new ThreeD[3];
		tharr[0]=new ThreeD(12, 24,78);
		tharr[1]=new ThreeD(32,42,45);
		tharr[2]=new ThreeD(45,65,96);
		Coords<ThreeD> thcoords=new Coords<>(tharr);
		Coords.showXYZ(thcoords);
		
		FourD farr[]=new FourD[3];
		farr[0]=new FourD(12, 24,78,36);
		farr[1]=new FourD(32,42,45,87);
		farr[2]=new FourD(45,65,96,35);
		Coords<FourD> fcoords=new Coords<>(farr);
		Coords.showAll(fcoords);

	}

}
