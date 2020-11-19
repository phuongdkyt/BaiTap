package test2;

public class ThrowException {

	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			System.out.println(e);
			System.err.println("Exception of throwException method is handled in main!");
		}
	}



public static void throwException() throws Exception{
	try {
		System.out.println("in try block of method throwException");
		throw new Exception("t3h");
	} catch (Exception e) {
		System.out.println("Exception handled in method throwExcepton");
		throw e;
	}
	finally {
		System.out.println("in finally block of method throwException");
		throw new Exception("t3hdd");
		
	}
//	System.out.println("in finally block of method throwException");
}
}
