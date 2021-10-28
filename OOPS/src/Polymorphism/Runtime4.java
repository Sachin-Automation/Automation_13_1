package Polymorphism;
class Bank{
	float getofintrest() {
		return 0;
		
	}
}
class SBI extends Bank{
	float getofintrest() {
		return 8.10f;
		
	}
}
class PNG extends Bank{
	float getofintrest() {
		return 7.10f;
		
	}
}
class ICICI extends Bank{
	float getofintrest() {
		return 12.10f;
		
	}
}
public class Runtime4 {
	
	public static void main(String args[]) {
		Bank B1=new SBI();
	    System.out.println("SBI bank intrest="+B1.getofintrest());//8.1
		Bank B2=new PNG();
	    System.out.println("SBI bank intrest="+B2.getofintrest());//7.1
	    Bank B3=new ICICI();
	    System.out.println("SBI bank intrest="+B3.getofintrest());//12.1
		
	}

}
