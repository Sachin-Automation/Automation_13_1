package Interface;
interface Sachin{
	int age=25;
	void Print(); // by default public and Abstract 
}
interface Vipul{
	void Show(); // by default public and Abstract 
}


public class Interface3 implements Vipul, Sachin {
	 public void Show() {
		 System.out.println("Hiii vipul");
	 }
		 public void Print() {
			 System.out.println("Hiii Sachin");
			 
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Interface3 I3=new  Interface3();
		 I3.Show();
		 I3.Print();
		 System.out.println("this variable default public static final:"+Sachin.age);
		
		

	}

}
