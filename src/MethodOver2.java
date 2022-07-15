
public class MethodOver2 extends MethodOver1{
	int k;
	public MethodOver2(int a, int b,int c) {
		super(a, b);
		k=c;
	}
	void show1() {
		super.show();
		System.out.println("k : "+k);
	}

}
