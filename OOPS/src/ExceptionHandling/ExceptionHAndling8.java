package ExceptionHandling;

public class ExceptionHAndling8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside the try block ");
			int age=25/0;
			System.out.println(age);
			
		}
		catch(NullPointerException e) {
			
			System.out.println("printn exception:"+e);
			
		}
		finally {
			
			System.out.println("finally block is always execute");
		}

	}

}
