package Oopsconcept;

class fruitA{
	int fruitage;
	fruitA(){
		System.out.println("fruitA class constructor");
		fruitage=5;
		
	}
	public void Type() {
		System.out.println(" Sweet");
		
	}
	
	
}
class fruitB extends fruitA{
	int fruitage;
	fruitB(){
		System.out.println("fruitB class constructor="+fruitage);
		fruitage=10;
		
	}
	public void Test() {
		System.out.println(" good ");
		
	}
	public void Past() {
		System.out.println(" Better");
		
	}
	
	
}

public class Inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Program run from main method ");
         fruitB F1=new  fruitB();
	}

}
