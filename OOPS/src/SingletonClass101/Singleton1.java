package SingletonClass101;

class Demo102 {
	// 1] create private constructor
	private Demo102() {
		System.out.println("i am Demo102 constructor");
	}

	// 2]create static instance
	static Demo102 D1 = new Demo102();
	String place = "Pune";

	static Demo102 getinstance() {
		return D1;

	}

	void disply() {
		System.out.println("i am disply method");
	}

}

    public class Singleton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo102 d1=Demo102.getinstance();
		//d1.place;
		System.out.println(d1.place);
		d1.disply();
		d1.place="newsa";
		Demo102 d2=Demo102.getinstance();
		System.out.println(d1.place);
		
		
			
	}

}
