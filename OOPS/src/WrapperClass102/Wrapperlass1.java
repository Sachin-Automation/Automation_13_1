package WrapperClass102;

public class Wrapperlass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		//convert int to integer 
		
		Integer k =new Integer(a);//converting int into Integer explicitly	
		Integer l =new Integer(30);//converting int into Integer explicitly
		Integer j=a; //autoboxing
		System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);
		System.out.println("///////////////");
		
		System.out.println("***Unboxing of boxed object*****");
		//Converting Integer to int
		Integer a1=new Integer(3);
		int i1=a1.intValue();//converting Integer to int explicitly
		System.out.println("a1:"+a1+"\ni1:"+i1);
		System.out.println((a1==i1));
		

	}

}
