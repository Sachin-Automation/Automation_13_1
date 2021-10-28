package Polymorphism;
class Overriding1{
	void sum() {
		System.out.println("Print sum method 1st");
	}
}
class Overriding2 extends Overriding1{
	void sum() {
		System.out.println("Print sum method 2dst");
	}
}


public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 O1=new Overriding2();
		O1.sum();
		Overriding1 O2=new Overriding2();
		O2.sum();
		Overriding2 O3= (Overriding2)O2;
		O3.sum();
		
		

	}

}
