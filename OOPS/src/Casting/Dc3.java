package Casting;

class JD{
	public void printme() {
		System.out.print("print printme");
		
	}
	 void disp() {
		System.out.print("disp");
		
	}
}
class java extends JD{
	public void printMe2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}

class Android extends java {
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class Dc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JD J1= new Android(); //implicit auto up casting
		J1.disp();
		System.out.println("/////////////////////////////////////");
		Android A1=(Android)J1; //emplicit down casting
	    A1.disp();
		
		

	}

}
