
public class Box {
	private double width;
	private double height;
	private double depth;
	
	double volume() {
		//System.out.print("Volume is ");
		//System.out.println(width*height*depth);
		System.out.println("volume method inside Box class");
		return width*height*depth;
	}
	void setDim(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	public Box(){
		System.out.println("default constructor");
		width=-45;
		height=-78;
		depth=-63;
	}
	public Box(double w, double h, double d) {
		System.out.println("Three parameter constructor");
		width=w;
		height=h;
		depth=d;
	}
	public Box(double len) {
		width=height=depth=len;
	}
	/*int square() {
		return 10*10;
	}
	int square(int i) {
		return i*i;
	}*/

	

}
