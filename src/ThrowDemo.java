
public class ThrowDemo {
	static void demoProc() throws IllegalAccessException {
		throw new IllegalAccessException("Index " + 42 + " out of bounds for length " + 1);
	}

	public static void main(String[] args) {

		try {
			demoProc();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
