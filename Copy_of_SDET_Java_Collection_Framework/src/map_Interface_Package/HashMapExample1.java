
// Use of methods like put(), get(), remove(), containsKey(), containsValue()
// isEmpty(), keySet(), values(), entrySet(), getKey(), getValue()
// Hashmap array 'm' in console is shown in {curly braces}
// While Set of Keys and set of Values shown in [square braces]

package map_Interface_Package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {

		// Create Hash Map
//		HashMap m = new HashMap(); // Heterogeneous data can be store

//		To store Key-Value pair specific data
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(105, "Henry");
		m.put(104, "Mary");
		m.put(103, "Scott");        
		m.put(101, "John");  // Duplicate Keys Not allowed
		m.put(102, "David"); // Duplicate values allowed		
		m.put(106, "X");
		m.put(107, "David");
		m.put(null, null);
//		m.put(null, null); // Only One null key allowed // Multiple null values allowed
//		m.put(true, true); // Boolean not allowed
		
		// Inser
		System.out.println("HashMap:- " + m); // {101=John, 102=David, 103=Scott, 104=Mary, 105=Henry, 106=X, 107=David}
		
		// To get single element value
		System.out.println(m.get(105)); // Henry

		// To remove a pair from Hash Map
		m.remove(106);
		System.out.println(m); // {101=John, 102=David, 103=Scott, 104=Mary, 105=Henry, 107=David}

		// To check the presence of element using containsKey()
		System.out.println(m.containsKey(101)); // true
		System.out.println(m.containsKey(106)); // false

		// To check the presence of element using containsValue()
		System.out.println(m.containsValue("Mary")); // true
		System.out.println(m.containsValue("Y")); // false

		// To check the Hash Map is empty or not
		System.out.println(m.isEmpty()); // false
//		m.clear();
//		System.out.println(m.isEmpty()); // true

		// To return all the keys as a Set
		System.out.println(m.keySet()); // [101, 102, 103, 104, 105, 107]
		
		
		// To return the keys individually
		for (Object o : m.keySet()) 
		{
			System.out.println(o);
		}

		// To return all values as Collection
		System.out.println(m.values());  //[John, David, Scott, Mary, Henry, David]
		
		// To return the values individually
		for (Object i : m.values()) 
		{
			System.out.println(i);
		}

		// To returns all entries as a Set
//		System.out.println(m.entrySet());  //[101=John, 102=David, 103=Scott, 104=Mary, 105=Henry, 107=David]

		// 1st WAY to return the entries (pairs) individually
		System.out.println("Entry Set using for each loop");
		for (Object i : m.keySet()) 
		{
			System.out.println(i + "  -   " + m.get(i));
		} 
//*********************************************************
		// Using Entry Interface Methods
		// Entry is a sub interface of Map interface
//********************************************************
		
		// 2nd WAY to return the entries (pairs) individually using Map Interface
		// Use HashMap<Integer,String> m = new HashMap<Integer,String>();
		System.out.println("Entry Set using Map interface");
		for (Map.Entry entry : m.entrySet()) 
		{
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// 3rd WAY to return the entries (pairs) individually using iterator method and Map Interface
		System.out.println("Entry Set using iterator method");
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) 
		{
			Map.Entry entry = (Entry) it.next(); // Type casting of Entry and next()			
			System.out.println(entry.getKey() + "  -  " + entry.getValue());
		}

	}

}
