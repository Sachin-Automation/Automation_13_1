package Collection103;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList A1 = new ArrayList();

		A1.add("Shrirampur");
		A1.add("Vaijpur");
		A1.add("Nadi");
		A1.add("Virgaon");

		System.out.println("Arraylist Element size:" + A1.size());
		System.out.println("Arraylist Elements are:" + A1);

		A1.add(1, "Nagpur"); // Auto indexed
		System.out.println("Arraylist Element size:" + A1.size());
		System.out.println("Arraylist Elements are:" + A1);

		A1.add("Shrirampur");// Duplicate Allowed
		System.out.println("Arraylist Element size:" + A1.size());
		System.out.println("Arraylist Elements are:" + A1);

		A1.add(null); // Allows null value
		System.out.println("Arraylist Element size:" + A1.size());
		System.out.println("Arraylist Elements are:" + A1);

		/**
		 * int will be converted into Integer class object, dn it will upcasted in to
		 * Object class object //or first boxing operation --->Integer Class Object --->
		 * Auto-upcasting to convert it to object class object
		 */

		A1.add(12335);
		System.out.println("Arraylist Element size:" + A1.size());
		System.out.println("Arraylist Elements are:" + A1);

		A1.add(true); //Boxing dn upcasting

		System.out.println("Arraylist Element size:" + A1.size());
		System.out.println("Arraylist Elements are:" + A1);

	}

}
