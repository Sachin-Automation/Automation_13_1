package Abstract;
abstract class Animal{
	abstract public void Animalsound();
	
	public void Sleep() {
		System.out.println("zeee zee");
	}
}
class Pig extends Animal{
	public void Animalsound() {
		System.out.println("the pig say:we weeee");
	}
	
}
class Dog extends Animal{
	public void Animalsound() {
		System.out.println("the pig say: bo boooo");
	}
	
}

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig P1=new Pig();
		P1. Animalsound();
		P1.Sleep();
		Dog D1 = new Dog();
		D1. Animalsound();
		D1.Sleep();
		
		

	}

}
