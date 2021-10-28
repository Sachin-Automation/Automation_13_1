package Oopsconcept;

class fourWheeler {
	// default constructor present here
	public void Test() {
		System.out.println("print Test");
	}

}
class Car extends fourWheeler {
	
	public void Type(){
	System.out.println("print Type");
}
}   
class Maruti extends Car {
	
	public void Company(){
	System.out.println("print Company");
}
}   
public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti M1=new Maruti();
		M1.Test();
		M1.Type();
		M1.Company();
	}

}
