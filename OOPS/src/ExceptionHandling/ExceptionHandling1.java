package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" prog start from here");

		Scanner scn = new Scanner(System.in);
		// 1. abnormal statements
		int i, j, res;
		System.out.println("enter number 1:");
		i = scn.nextInt();
		System.out.println("enter number 2:");
		j = scn.nextInt();
		try {
			res = i / j; // ArithmeticException
			System.out.println(" Print value j:" + res);
		} catch (Throwable e) {  //Exception e =new ArithmeticException();
			System.out.println("exception type:" + e);
			
		}
		System.out.println(" prog start from here");

	}

}

