
public class DynamicMethodMain {

	public static void main(String[] args) {
		DynamicMethod1 me1=new DynamicMethod1();
		DynamicMethod2 me2=new DynamicMethod2();
		DynamicMethod3 me3=new DynamicMethod3();
		DynamicMethod1 ref;
		ref=me1;
		ref.callme();
		
		ref=me2;
		ref.callme();
		
		ref=me3;
		ref.callme();

	}

}
