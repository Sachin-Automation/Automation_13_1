package ExceptionHandling;

public class ExceptionHandling7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int A=25/2;
			System.out.println("print value of A:"+A);
		}// catch won't be executed
		catch(ArithmeticException e) {
			System.out.println("Exception handle:");
		
			
		}// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block always execute");
		}
		System.out.println("prog end here");
		
 
	}

}
