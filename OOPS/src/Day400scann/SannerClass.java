package Day400scann;

import java.util.Scanner;

public class SannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		int age;
		double salary;
		String Place;
		boolean value;
		System.out.println(" get age value from int");
		age=S1.nextInt();
		System.out.println(" get Salary value from double");
		salary=S1.nextDouble();
		System.out.println(" get Place value from String");
		Place=S1.next();
		System.out.println(" get boolean value from boolen");
		value=S1.hasNext();
		S1.close();
		
		
		System.out.println("Age is:"+age);
		System.out.println("salary is:"+salary);
		System.out.println("Place is:"+Place);
		System.out.println("value is:"+value);
		

	}

}
