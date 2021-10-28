package Collection103;

import java.util.ArrayList;

public class ArraylistExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList A1 = new ArrayList();
		A1.add("Mango");
		A1.add("Apple");
		A1.add("Banana");
		A1.add("Grapes");
		System.out.println("Arraylist element size:" + A1.size());
		System.out.println("print array list:" + A1);
		System.out.println("print the elements present in position 1:" + A1.get(1));

		for (Object obj : A1) {
			System.out.println("print element:" + obj);
		}
		System.out.println("///////////////////////////////////");
		for (int i = 0; i < A1.size(); i++) {
			System.out.println("print element:" + A1.get(i));

			/*A1.set(1, "ladyfinger");
			System.out.println("print array list:" + A1);
*/
		}
		A1.set(1, "ladyfinger");
		System.out.println("print array list:" + A1);

	}

}
