package Array101;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrayclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {12,50,83,14,10};
		int sum=0;
		double avrage;
		System.out.println("use for loop");
		for(int number:numbers) {
			//System.out.println(number);
			sum=sum+number;
			System.out.println(sum);
		}
		System.out.println("*******************************************");
		System.out.println(sum);
		int arrayLength = numbers.length;
		System.out.println(arrayLength);
		
		avrage=sum/arrayLength;
		System.out.println(sum);
		System.out.println( avrage);
		
		//array class
		int b[]=numbers.clone();
		System.out.println("*******************************************************************");
		System.out.println("use methods");
		System.out.println(Array.get(numbers, 0));
		
		Array.set(numbers, 0, 101);
		System.out.println(Array.get(numbers, 0));
		System.out.println(Array.getLength(numbers));
		System.out.println(Array.getInt(numbers, 1));
		System.out.println(Array.getLong(numbers, 2));
		
		//arrays class
		int crr[]= {11,22,33,40};
		
		System.out.println(Arrays.equals(numbers, crr));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 50));
	   //     int c=Arrays.copyOfRange(numbers, 1, 3);
//		System.out.println(Arrays.copyOfRange(original, from, to));
		
	}

}
