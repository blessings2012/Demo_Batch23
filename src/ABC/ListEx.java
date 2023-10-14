package ABC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListEx {
	public static void main(String args[]) {
		
		
		
		ArrayList ll = new ArrayList();
		ll.add("harshita");
		ll.add("tiwari");
		ll.add(true);
		ll.add('c');
		ll.add(1);
		ll.add(1);
		//System.out.println(ll);
		
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}

}

//Collection

//List ArrayList LinkedList 
//insertion /deletion faster 
//double linkedlist 
//not contigous

//Arraylist : Duplicate 
//Acess the element 
//Dynamic array
////contigous

//Set HashSet LinkedHashSet Tree Set

//Map HashMap LinkedhashMap Tree Map

//Iterator // Iterator it = new iterator();


//non homogenous data
//dynamic
//data structure 