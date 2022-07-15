
public class ColorBox extends Box{
	int color;// color of box
	public ColorBox(double w, double h, double d, int c) {
		/*width=w;
		height=h;
		depth=d;*/
		super(w,h,d);
		color=c;
	}
	double volume() {
		/*System.out.print("Volume is ");
		System.out.println(width*height*depth);*/
		System.out.println("volume method inside ColorBox class");
		return super.volume()*color;
	}

}
