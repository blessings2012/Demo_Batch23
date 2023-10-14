package ABC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Ex {
public static void main(String args[]) {
	TreeMap<String,String> h = new TreeMap();
	
	h.put("harshita", "testng");
	h.put("adarsh", "java");
	h.put("nitish", "sel");
	h.put("nitish", null);
	h.put("null", null);
	h.put("null", "ad");
	
	Set s = h .entrySet();
	Iterator it = s.iterator();
	while(it.hasNext())
	
		System.out.println(it.next());
	
	
	
}
}
