package Polymorphism;
class Animal{
	void eat() {
		System.out.println(" Print eat method");
	}
}
class herbivores  extends Animal{
	void eat() {
	System.out.println(" Print eat method  herbivores");
	} 
}
class omnivores  extends Animal{
	void eat() {
		System.out.println(" Print eat method  omnivores");
	} 
}
class carnivores  extends Animal{
	void eat() {
		System.out.println(" Print eat method carnivores");
	} 
}

public class RuntimePly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A1=new Animal();
		A1.eat();
		System.out.println("////////////////////////////////////////");
		Animal A2=new herbivores();
		A2.eat();
		System.out.println("////////////////////////////////////////");
		Animal A3=new omnivores();
		A3.eat();
		System.out.println("////////////////////////////////////////");
		Animal A4=new carnivores(); //auto up casting implicit
		A4.eat();
		System.out.println("////////////////////////////////////////");
		

	}

}
