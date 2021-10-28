package Array101;

public class Arrayclass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		
		System.out.println("first elements:"+a[0]);
		System.out.println("first elements:"+a[1]);
		System.out.println("first elements:"+a[2]);
		System.out.println("first elements:"+a[3]);
		System.out.println("first elements:"+a[4]);
		
		System.out.println(" use for-loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] );
			
		}
		System.out.println(" use each-loop");
		
		for(int b:a){
			System.out.println(b);
			if(b==30) {
			//System.out.println(b);
			break;
			}
			
		}
			
			
			
			

	}

}
