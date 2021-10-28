package Polymorphism;
class Shape{
	public void area() {
		System.out.println(" find area");
		
	}
	public void area(int r) {
		System.out.println(" circle area="+3.14*r*r);
		
	}
	public void area(int b,int h) {
		System.out.println("Rectangle area="+0.5*b*h);
		
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape S1=new Shape();
		S1.area();
		S1.area(10);
		S1.area(5,5);

	}

}
