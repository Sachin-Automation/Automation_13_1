package Objectclass;

public class ObjectClass1 extends Demo {
	static double salary = 1000;
	long num = 125;

	void A4() {
		System.out.println("print A4 method");
	}

	ObjectClass1() {
		int A = 2;
		System.out.println(" value of A is :" + A);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClass1 O1 = new ObjectClass1();
		System.out.println(O1);              //s.toString() -->string representation of an object
		System.out.println(O1.toString());//string representation of an object
		System.out.println(O1.hashCode());

		Demo D1 = new Demo();
		System.out.println(D1);
		System.out.println(D1.toString());
		System.out.println(O1.hashCode());

	}

}
