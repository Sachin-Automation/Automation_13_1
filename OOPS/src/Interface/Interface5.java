package Interface;
interface Printable{
	void Print ();
}
interface Showable extends  Printable {
	void Show();
 	
}
public class Interface5 implements  Showable {
	public void Print() {
		System.out.println(" Hello");
	}
	public void Show() {
		System.out.println("welcom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface5 I5 = new Interface5();
		I5.Show();
		I5.Print();
		Printable P1=new Interface5();
		P1.Print();
       
	}

}
