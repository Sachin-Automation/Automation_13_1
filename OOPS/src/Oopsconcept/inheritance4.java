package Oopsconcept;

class vehicle{
	
	public void vipul() {
		System.out.println(" Pooja");
	}
}

class Bike extends vehicle{
	
	public void Pooja() {
		System.out.println(" Vipul");
	}
}
class Carr extends vehicle{
	
	public void Gaurav() {
		System.out.println(" Gaurav");
	}
}

class Scooter extends vehicle{
	
	public void Dipika() {
		System.out.println(" Dipika");
	}
}
public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter S1=new Scooter();
		S1.Dipika();
		S1.vipul();
		Carr C1=new Carr();
		C1.Gaurav();
		Bike B1=new Bike();
		B1.Pooja();

	}

}
