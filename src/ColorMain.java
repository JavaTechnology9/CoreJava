
public class ColorMain {

	public static void main(String[] args) {
		ColorBox box=new ColorBox(45.0, 78.0, 96.3, 45); // sub class
		Box b1=new Box();//super class
		double vol;
		vol=box.volume();
		System.out.println("vol of ColorBox is: "+vol);
		System.out.println("color of the ColorBox:"+box.color);
		
		b1=box;
		vol=b1.volume();
		System.out.println("vol of ColorBox is: "+vol);
		//System.out.println("color of the ColorBox:"+b1.color);

	}

}
