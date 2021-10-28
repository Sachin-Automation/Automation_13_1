package Collection103;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> H1=new HashMap<Integer,String>();
		
		H1.put(1,"Mango");
		H1.put(2, "apple");
		H1.put(3, "banana");
		H1.put(4, "grapes");
		System.out.println("size:"+H1.size());
		System.out.println("Elements of Map:"+H1);
//		Set<Entry<Integer,String>>S1=H1.entrySet();
//		for (Entry<Integer,String> S:S1) {
//			
//		}
		Map m1=new HashMap();
		m1.put(1, "Rahul");
		m1.put(2, "Rahul");
		m1.put(null, "1234");
		Set<Entry> S=m1.entrySet();
//		for(<Entry> S2:S) {
//		System.out.println(S2. );
//		
	  //
		   
	   }
//		}
//		

	}



