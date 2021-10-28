package Collection103;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put(1, "Rahul");
		m1.put(2, "Rahul");
		m1.put(null, "1234");
		System.out.println("Elements of Map is:"+m1);
		System.out.println("size of map:"+m1.size());
		m1.put(1, "Ganesh");
		m1.put(null, "4321");
		System.out.println("Elements of Map is:"+m1);
		System.out.println("size of map:"+m1.size());
		
		System.out.println("only show keys:"+m1.keySet()); // show key 
		System.out.println("only show keys:"+m1.values());// show values
	

	}

}
