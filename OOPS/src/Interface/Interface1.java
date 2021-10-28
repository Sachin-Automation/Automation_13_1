package Interface;

interface D1{

    //variable ---> by default ----> public static final
    //method ---> by default ----> public abstract
    //no constructor
    //no complete method	                                            
}

interface Drowable{
	void Speed();                                             //by default---->public abstract
}
class Rectangle1 implements Drowable{
	
	public void Speed() {
		System.out.println("Speed method in Rectangle");
	}
	
}
class Circle implements Drowable{
	
	public void Speed() {
		System.out.println("Speed method in Circle");
	}
	
	
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 R1 = new Rectangle1();
		R1.Speed();
		Circle C1 = new Circle();
		R1.Speed();
		Drowable D2=new Rectangle1();
		
		
		

	}

}
