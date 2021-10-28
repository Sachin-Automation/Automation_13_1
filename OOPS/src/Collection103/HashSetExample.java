package Collection103;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating HashSet and adding elements
		Set<String> set = new HashSet<String>();
		set.add("sachin");
		set.add("vipul");
		set.add("sachin");// it don't get added in set
		set.add("gaurav");
		// in set if you try to add duplicate element dn it will neglect that element
		// instead of throwing an error or exception
		System.out.println("Elements of set is:"+set);
		
		// it don't get added in set
		Iterator<String> I1=set.iterator();
		while(I1.hasNext()) {
			System.out.println(I1.next());
		}
		System.out.println(" Elements of set:"+set);
		System.out.println("remove sachin form using remove method:"+set.remove("sachin"));
		System.out.println(" Elements of set:"+set);
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ganesh");
		set1.add("gaurav");
		System.out.println(" Elements of set1 : "+set1);
		set.addAll(set1);
		System.out.println(" Elements of set1 : "+set);
		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println(" Elements of set : "+set);
		// Removing elements on the basis of specified condition 
		set.removeIf(str -> str.contains("vijay"));
		System.out.println(" Elements of set : "+set);
		set.clear();
		System.out.println(" Elements of set : "+set);
		
		

		/*List<String> l1=new ArrayList<String>();
		l1.add("Pune");
		l1.add("Bangalore");
		l1.add("Pune");
		l1.add("Mumbai");
		System.out.println("****************l1: "+l1);
		Set s1=new HashSet();
		s1.addAll(l1);
		System.out.println("****************s1: "+s1);
		Set s2=new HashSet(l1);
		System.out.println("****************s2: "+s2);
		
		String str="I am from pune and pune is IT HUB, I am staying in Dhanori";
		String[] sr1=str.split(" ");
		
		List<String> list=Arrays.asList(sr1);
		Set<String> st=new HashSet(list);
		Iterator<String> it=st.iterator();
		for(int i=0;i<st.size();i++) {
			String name= it.next();
			System.out.println(name+":  "+Collections.frequency(list, name));
		
		
		*/


	}

}
