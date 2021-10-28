package SingletonClass101;

class singleton2 {
	private singleton2() {
		s = "i am singleton2 constructor";

	}

	private static singleton2 S1 = new singleton2();
	String s;
	
	public static singleton2 callme() {
		return S1;
	}
}

public class SingletonClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton2 p1=singleton2.callme();
		System.out.println("print s:"+p1.s);
		singleton2 p2=singleton2.callme();
		System.out.println("print s:"+p2.s);
		singleton2 p3=singleton2.callme();
		System.out.println("print s:"+p3.s);
		
		System.out.println("///////////////////////////");
		p1.s=(p1.s).toUpperCase();
		System.out.println("print s:"+p1.s);
		System.out.println("print s:"+p2.s);
		System.out.println("print s:"+p3.s);

		System.out.println("///////////////////////////");
		p1.s=(p1.s).toLowerCase();
		System.out.println("print s:"+p1.s);
		System.out.println("print s:"+p2.s);
		System.out.println("print s:"+p3.s);
	}

}
