package Casting;
class parent1{
	void Myhome1(){
		System.out.println("My Home is very sweet");
		}
}
class child1 extends parent1{
	void show1(){
		System.out.println("child show method is calling here");
		}
	void callme1(){
		System.out.println("child callme method is calling here");
		}
}
public class DerivedCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 p1=new parent1();
		p1.Myhome1(); 
		
		child1 c1=new child1();
		c1.callme1();
		c1.Myhome1();
		c1.show1();
		 
		parent1 p2=new child1();//auto-up/implicit up casting
		p2.Myhome1();
		child1 c2=new child1();
		parent1 p3=(parent1)c2;//explicit up casting
		p3.Myhome1();
		

	}

}
