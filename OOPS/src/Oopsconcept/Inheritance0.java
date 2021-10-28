package Oopsconcept;


	
	 class A {
		static int a=10;
		int b=20;
		double c =30.10;
		
	}
	class B{
		static int x=40;
		int y=50;
		double z =30.10;
		
	}
	class C{
		static int d=40;
		int e=50;
		double f =30.10;
	}
	 public class Inheritance0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for access static global variable
		
		System.out.println("print class A a="+ A.a);
		System.out.println("*********************");
		System.out.println("print class B x="+B.x);
		System.out.println("*********************");
		System.out.println("print class c d="+C.d);
		System.out.println("*********************");
		
		// object create for access non-static variable
		
		A A1 =new A();
		System.out.println("print class A b="+ A1.b);
		System.out.println("print class A a="+ A1.c);
		System.out.println("*********************");
		B B1 =new B();
		System.out.println("print class B y="+ B1.y);
		System.out.println("print class B z="+ B1.z);
		System.out.println("*********************");
		C C1 =new C();
		System.out.println("print class B y="+ C1.e);
		System.out.println("print class B z="+ C1.f);
		System.out.println("*********************");
		
		
		
		
		
	}

}
