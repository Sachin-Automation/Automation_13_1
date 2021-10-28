package Casting;

public class Primitivecasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mydouble = 9.66d;
		int myint = (int) mydouble; /// Manual casting= double to int

		System.out.println(mydouble); // 9.66

		System.out.println(myint); // 9

		double salary = 30000.30; // manual explicit
		int sal = (int) salary; // explicit
		long f = (long) salary; // explicit
		System.out.println(salary); /// 300000.30
		System.out.println(sal); //30000
		System.out.println(f); //30000

	}

}
