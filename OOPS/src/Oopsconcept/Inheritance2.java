package Oopsconcept;
 

 class Demo{
	 Demo(){
		 System.out.println("print Demo class");
	 }
	 public void test() {
		 System.out.println( "access non static methad");
 }
 }
 class Apple extends Demo{
	 Apple(){
		 System.out.println("Apple is sweet");
	 }
	 public void Shape() {
		 System.out.println("print method");
	 }
	 
 }
	
 
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple A1=new Apple();
		A1.test();
		A1.Shape();
		
		

	}

}
	