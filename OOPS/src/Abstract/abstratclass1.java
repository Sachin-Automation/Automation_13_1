package Abstract;
  
abstract class Bike{
	
	abstract  void run();
	 void Speed (int abs) {
		System.out.println("bike speed ="+abs);
	}
}
class Honda4 extends Bike{
	void run() {
		System.out.println(" run bike from Nagamthan");
		
	}
	 void Speed (int abs) {
		System.out.println("Honda Speed ="+abs);
		super.Speed(120);
	}
	 void colour() {
		 System.out.println("Honda colour is blue");
	 }
	
}
public class abstratclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda4 H1=new Honda4();
		H1.run();
		H1.Speed(10);
		H1.colour();
		System.out.println("////////////////////////////////////////////////////////////////////////////////");
		Bike B1=new Honda4();  // this  type of ojt  only access of only methods of present in bike methods
		B1.Speed(20);

	}

}
