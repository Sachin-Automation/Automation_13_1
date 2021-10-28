package ExceptionHandling;

public class ExceptionHandling0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts from here...");
//		1.abnormal statement
//		int i=10;
//		int j=i/0;   //ArithmeticException 
//		System.out.println(" Print value j:"+j);
//		
//		1.abnormal statement
//		
//		int[] arr=new int[3];
//		arr[3]=101;     //ArrayIndexOutOfBoundsException
//		
//		1.abnormal statement
//		
//		String src=null;
//		System.out.println("...:"+src.length());   //NullPointerException 
//		
//		1.abnormal statement
//		
		String s="abc";
		int a=Integer.parseInt(s);
		System.out.println("Print src:"+a);//NumberFormatExceptio
		System.out.println("program end from here...");

	}

}
