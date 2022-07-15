
public class Three extends Two {
	public void print3() {
		//super.print();
		System.out.println("Multiple Inheritance");
	}

	public static void main(String[] args) {
		Three t1=new Three();
		t1.print1();
		t1.print2();
		t1.print3();
	}
}
