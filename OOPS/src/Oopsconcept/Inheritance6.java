package Oopsconcept;

 class Grandfather{
	  Grandfather(){
		  System.out.println(" zero parameterize constructor");
	  }
	  void jagannath() {
		  System.out.println(" Jagannath");
	  }
 }
 class Father extends Grandfather{
	  Father( int a){
		 
		  System.out.println(" parameterize constructor="+a);
	  }
	  void Narayan() {
		  System.out.println(" Narayan");
	  }
}
 class Sachin extends Father{
	  Sachin( double b){
		  super(10);
		  System.out.println(" parameterize constructor");
	  }
	  void Shiv() {
		  System.out.println("sachin");
	  }
}
public class Inheritance6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sachin S1=new Sachin(10.10);
		S1.Narayan();
		S1.jagannath();
		S1.Shiv();
		System.out.println("///////////////////////////////////////////////////");
		Father F1=new Father(10);
		F1.Narayan();
		F1.jagannath();
		System.out.println("///////////////////////////////////////////////////");
		Grandfather J1=new Grandfather();
		J1.jagannath();
		
		

	}

}
