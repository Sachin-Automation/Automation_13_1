package Casting;

public class Primitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myint=9;
		double mydouble=myint;    //auto-widening or implicit widening
		double d=(double)myint;   // explicit widening
		System.out.println(myint);  //9
		System.out.println(mydouble); //9.0
		System.out.println(d); //9.0

	}

}
