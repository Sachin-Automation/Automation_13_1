package Array101;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//declaration
		int a[];
		//size initialization
		a = new int[5];
		*/
		
		int a[]=new int[5];//declaration and instantiation
		System.out.println(a[0]);//0
		System.out.println(a[1]);//0
		System.out.println(a[2]);//0
		System.out.println(a[3]);//0
		System.out.println(a[4]);//0
		
		a[0]=10; //initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("*************After initialization*************");
		System.out.println(a[0]);//10
		System.out.println(a[1]);//20
		System.out.println(a[2]);//30
		System.out.println(a[3]);//40
		System.out.println(a[4]);//50
		
		//find length 
		System.out.println("length of Array is:"+a.length);
		//use for-loop
		for(int i=0;i<a.length;i++) {
	    System.out.println(a[i]);
		
		//}
		for(int num : a) {
	    System.out.println(num);
		}
		
		}

	}
}
