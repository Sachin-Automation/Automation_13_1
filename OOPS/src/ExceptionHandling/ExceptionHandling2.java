package ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prog start from here");
		int [] err= {10,20,30};
		
		try {
		System.out.println(err[3]);
		} catch(Throwable e) {
			System.out.println("Exception handled.." + e);

		}
		System.out.println("prog end from here");
		

	}

}
