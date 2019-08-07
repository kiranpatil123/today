package com.kiran;

class NumberNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5511225440740332822L;

	public NumberNotFoundException(String arg0) {
		super(arg0);
	}
}

class HigherNumberFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5511225440740332822L;

	public HigherNumberFoundException(String arg0) {
		super(arg0);
	}
	
}

class Home {
	public Home() {

	}

	public void getMyNumber(int a) /* throws NumberNotFoundException,HigherNumberFoundException */ {
		
		
		if (a == 6) {
			throw new NumberNotFoundException("The number " + a + " not found");
		}

		else if (a > 2) {
			throw new HigherNumberFoundException("The number " + a + " is higher than expected");
		}

		else {
			System.out.println("Number is not correct");
		}
		
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Home home = new Home();
		try {
			home.getMyNumber(3);
			int i = Integer.parseInt("a");
		} catch (Exception ex) {
			System.out.println("exception occur :: " + ex.getMessage());
		}
	}

}
