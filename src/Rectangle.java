
public class Rectangle extends Figure {
	public Rectangle(double a, double b) {
		super(a, b);
	}
	double area() {
		System.out.println("Inside Area for Rectangle");
		return dim1*dim2;
	}

}
