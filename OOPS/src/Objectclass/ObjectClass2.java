package Objectclass;

class Demo3 {
	void disply() {
		System.out.println("show disply method in Demo class  ");

	}
}

public class ObjectClass2 extends Demo3 {
	int value1 = 100;
	int value = value1;

	ObjectClass2() {

	}

	void disply() {
		System.out.println("show disply method in Object class ");

	}

	public int hashcode() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClass2 O2 = new ObjectClass2();
		System.out.println(O2);
		System.out.println(O2.toString());

		O2.hashCode();

		O2.disply();
		System.out.println(O2.hashcode());

	}

}