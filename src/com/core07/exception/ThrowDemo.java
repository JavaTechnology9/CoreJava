package com.core07.exception;

public class ThrowDemo {
	static void demoproc() throws NullPointerException {

		NullPointerException cfe= new NullPointerException("demo");
		cfe.initCause(new ArithmeticException("cause"));
		throw cfe;
	}

	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException ex) {
			System.out.println(" Caught inside main() method."+ ex);
			System.out.println(" Caught inside main() method."+ ex.getCause());
		}
	}

}
