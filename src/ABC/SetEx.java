package ABC;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetEx {
	public static void main(String args[]) {
		/*
		 * LinkedHashSet ll = new LinkedHashSet(); ll.add("harshita"); ll.add("tiwari");
		 * ll.add(true); ll.add('c'); ll.add(1); ll.add(1);
		 * 
		 * 
		 * Iterator it = ll.iterator(); while(it.hasNext()) { Object obj = it.next();
		 * System.out.println(obj); }
		 */
	
	
	TreeSet ll = new TreeSet();
	ll.add("harshita");
	ll.add("yellow");
	ll.add("tiwari");
	ll.add("yellow");
	
//	System.out.println(ll.contains("tiwari"));
	
	
	
	
	Iterator it = ll.iterator();
	while(it.hasNext())
	{
		Object obj = it.next();
		System.out.println(obj);
	}
}}
	//set do not allow duplicate values 
//order is not maintained hashset
//order is maintained linkedhashset
	
