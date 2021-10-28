package Interface;
interface Sachin1{
	void Print();
	
	
}
interface vipul2{
	void Print();
	
	
}


public class Interface4 implements Sachin1 ,vipul2{
	public void Print() {
		System.out.println("hello");   // at that time same method present in 2 different class so that time only one body provide in child class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface4 I1 = new Interface4();
		I1.Print();
		
		Sachin1 S1 = new Interface4();
		S1.Print();
		
		vipul2 V1 = new Interface4();
		V1.Print();
		

	}

}
