package Abstract;

abstract class shape {
	abstract void Drow();

}

class Rectangle extends shape {
	void Drow() {
		System.out.println("Drow Rectangle ");
	}
}

	
class Circle extends shape {
	void Drow() {
		System.out.println("Drow Circle");
	}
	
}

public class abstractclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape S1=new Rectangle();
		S1.Drow();
		shape S2=new Circle();
		S2.Drow();
		

	}

}
