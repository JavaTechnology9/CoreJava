
public class FinallyDemo {
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("inside procA method");
		} finally {
			System.out.println("procA's finally block");
		}
	}

	static void procB() {
		try {
			System.out.println("inside procB");
			//throw new RuntimeException("inside procB method");
		} finally {
			System.out.println("procB's finally block");
		}
	}

	static void procC() {
		try {
			System.out.println("inside procC");
			//throw new RuntimeException("inside procC method");
		} finally {
			System.out.println("procC's finally block");
		}
	}

	public static void main(String[] args) {
		try {
			procA();
		} catch (RuntimeException ex) {
			System.out.println("Exception caught");
		}
		procB();
		procC();

	}

}
