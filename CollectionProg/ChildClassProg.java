package CollectionProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ChildClassProg {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(12, "Dhoni");
		hm.put(4, "Surya");
		hm.put(5, "Washington");
		hm.put(10, "Kuldeep");
		hm.put(1, "Rohit");
		hm.put(2, "Kishan");
		System.out.println(hm);
		
		hm.put(3, "Virat");
		hm.remove(12);
		System.out.println(hm);
		System.out.println("----------------------------------");
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("Rohit"));
		System.out.println(hm.get(5));
		
		
		
		
		
		System.out.println("----------------------------------");
		Set value = hm.entrySet();
		System.out.println(value);
		
//		Iterator itr = value.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
	}

}
