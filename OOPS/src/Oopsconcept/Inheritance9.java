package Oopsconcept;

class Company {
	int A = 10;
	double B = 20;

	public void Sachin() {
		System.out.println(" method Scachin without arguments");
	}

	public void Sachin(int B) {
		System.out.println(" local variable B=" + B);
		System.out.println(" globle variable B=" + this.B);

	}

	Company() {
		this(30.30d);
		System.out.println("zero parameterize constructor");
	}

	Company(double D) {

		System.out.println("parameterize constructor company=" + D);
	}

}

class Employee extends Company {
	static double W = 110.10;
	int A = 101;
	double B = 202;

	Employee() {
		this(50.50d);
		System.out.println("zero parameterize constructor" );

	}

	Employee(double D) {
		super(60.60);

		System.out.println("parameterize constructor Employee=" + D);
	}

	public void Sachin() {

		System.out.println(" method Employee without arguments");
	
	}

	public void Sachin(int B) {
		System.out.println(" method Employee with argument=" + B);
		System.out.println(" method Employee with argument=" + super.B);

	}

}

public class Inheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM start from Main method");
		
		Company C1 = new Company();
		C1.Sachin();
		C1.Sachin(30);
		
		// Company C2=new Company(40.40d); // for  parameterize constructor call
		System.out.println("//////////////////////////////////////////////");
		
		
		
		Employee E1=new Employee();
		E1.Sachin(5);

	}

}
