
public class Hierarchical_Main {

	public static void main(String[] args) {
		Sub1 s1=new Sub1();
		s1.print_sub1();
		s1.print_super();
		//s1.print_sub2();
		Sub2 s2=new Sub2();
		s2.print_sub2();
		s2.print_super();
		
		Sub3 s3=new Sub3();
		s3.print_sub3();
		s3.print_super();

	}

}
