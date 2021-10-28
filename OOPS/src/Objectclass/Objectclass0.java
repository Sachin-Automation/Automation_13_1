package Objectclass;

class Demo {

	void dispy() {
		System.out.println("Print dispy method");
	}
}

public class Objectclass0 extends Demo {
	static double a = 40;
	long age;

	Objectclass0() {
		System.out.println(" print counstructor body");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Below two statements are equivalent
		Objectclass0 S = new Objectclass0();
		System.out.println(S);
		System.out.println(S.toString());

		Demo D1 = new Demo();
		System.out.println(D1);
		System.out.println(D1.toString());
		D1.dispy();
		Demo D2 = new Demo();
		System.out.println(D2);
		System.out.println(D2.toString());
		D1.dispy();
		D1.dispy();

	}

}
