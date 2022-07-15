
public class AbstractClass2 extends AbstractClass1{
	

	@Override
	void callme() {
		System.out.println(this.getClass());
		System.out.println("AbstractClass2 is implemented callme method");
		
	}
	 void callmetoo1() {
		System.out.println("this is concrete method AbstractClass2 class");
	}

}
