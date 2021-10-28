package Polymorphism;

public class CompileTime {
	static void sum(int a , int b) {
		int c=a+b;
		System.out.println(" print value of C="+c);
		
	}
	static void sum(int a , int b ,int e) {
		int c=a+b+e;
		System.out.println(" print value of 2nd method C="+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTime.sum(10,20);
		CompileTime.sum(10,20,20);

	}

}
