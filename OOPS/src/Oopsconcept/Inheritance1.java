package Oopsconcept;

class X{
	static int a=10;
	int b=220;
	double c=30.20;
}// child class Y inheritance class X non-static variable
class Y extends X {
	static int x=10;
	int y=20;
	double z=30.30;
}

//c1 inheritance class Y non-static member 
class Z extends Y{
	static int e=10;
	int f=20;
	double g=30.00;
}
public class Inheritance1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" print static globle variable="+X.a);
		System.out.println("*************************************");
		System.out.println(" print static globle variable="+Y.x);
		System.out.println("*************************************");
		System.out.println(" print static globle variable="+Z.e);
		System.out.println("*************************************");
		
		Z Z1=new Z();
		System.out.println(" print static globle variable="+Z1.b);
		System.out.println(" print static globle variable="+Z1.c);
		System.out.println(" print static globle variable="+Z1.y);
		System.out.println(" print static globle variable="+Z1.z);
		System.out.println(" print static globle variable="+Z1.f);
		System.out.println(" print static globle variable="+Z1.g);
		System.out.println("*******************************************");
		
		Z Y1=new Z();
		System.out.println(" print static globle variable="+Y1.b);
		System.out.println(" print static globle variable="+Y1.c);
		System.out.println(" print static globle variable="+Y1.y);
		System.out.println(" print static globle variable="+Y1.z);
		
	}

}
