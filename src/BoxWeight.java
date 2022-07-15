
public class BoxWeight extends Box{
	double weight;
	public BoxWeight(double w, double h, double d, double m) {
		super(w,h,d);
		weight=m;
	}
	double volume() {
		//System.out.print("Volume is ");
		//System.out.println(width*height*depth);
		double vol = super.volume();
		return vol*weight;
	}
	public static void main(String[] args) {
		BoxWeight bw=new BoxWeight(10, 20, 30, 40);
		System.out.println(bw.volume());//336960.0
	}
}
