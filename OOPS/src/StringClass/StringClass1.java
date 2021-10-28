package StringClass;

public class StringClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClass1 D1 = new StringClass1();
		System.out.println("Address:" + D1);

		String S1 = "Shrirampur";
		String S2 = "Shrirampur";
		String S3 = "Aurangabad";
		String S4 = "Vaijapur";
		// Access Address of above String object
		System.out.println("S1:" + S1);// Shrirampur
		System.out.println("S1:" + S2);// Shrirampur
		System.out.println("S1:" + S3);// Aurangabad
		System.out.println("S1:" + S4);// Vaijapur
		// Lenght of character
		System.out.println("Fined Length of charatore:" + S1.length());// 10
		System.out.println("Fined Length of charatore:" + S2.length());// 10
		System.out.println("Fined Length of charatore:" + S3.length());// 10
		System.out.println("Fined Length of charatore:" + S4.length());// 8

		// use equals method
		System.out.println(" S1 & S2  use +S1.equals(S2);:" + S1.equals(S2));// compare s1 and s2 values//true
		System.out.println(" S1 & S2 use+(S1==S2);:" + (S1 == S2));// compare s1 & s2 based on address //true

		System.out.println(" S1 & S3  use +S1.equals(S3);:" + S1.equals(S3));// compare s1 and s3 values//
		System.out.println(" S1 & S2 use+(S1==S3);:" + (S1 == S3));// compare s1 & s3 based on address

		// new object create
		String S5 = new String("Shrirampur"); // 1. in constant pool 2. in non-constant pool
		System.out.println("S5:" + S5);

		System.out.println(" S1 & S5  use +S1.equals(S5);:" + S1.equals(S5));// compare s1 and s35values//true
		System.out.println(" S1 & S5 use+(S1==S5);:" + (S1 == S5));// compare s1 & s5 based on address

		// new object create
		String S6 = new String("Shrirampur"); // 1. in constant pool 2. in non-constant pool
		System.out.println("S6:" + S6);

		System.out.println(" S1 & S5  use +S1.equals(S5);:" + S5.equals(S6));// compare s1 and s35values//true
		System.out.println(" S1 & S5 use+(S1==S5);:" + (S5 == S6));// compare s1 & s5 based on address

	}

}
