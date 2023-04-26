
// Implementation of HashTable methods which are same as hashMap

package map_Interface_Package;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample1 {

	public static void main(String[] args) {

//		Hashtable t = new Hashtble();  // default Capacity 11, Load factor 0.75
//	    We can configure with specification with some initial capacity
//		Hashtable t = new (initial capacity)
// 		We can configure with specification with some initial capacity and load factor
// 		Hashtable t = new Hashtable(initial capacity, fill ratio / load factor)

		Hashtable<Integer, String> t = new Hashtable<Integer, String>();

		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
//		t.put(102, "Mary"); // duplicate key not allowed
//		t.put(104, "John"); // duplicate values allowed
		
        //Insertion Order Not Preserved
		System.out.println(t); // {103=Smith, 102=David, 101=John}

		System.out.println(t.get(103)); // Smith

		t.remove(103);
		System.out.println("After remove:- " + t); // {102=David, 101=John}

		System.out.println(t.containsKey(102)); // true
		System.out.println(t.containsKey(105)); // false

		System.out.println(t.containsValue("John")); // true
		System.out.println(t.containsValue("Mary")); // false

		System.out.println(t.isEmpty()); // false

		// Key and Value as Set
		System.out.println(t.keySet()); // [102, 101]
		System.out.println(t.values()); // [David, John]

		// to print the Key-Value set (pair) using for loop
		for (Object kv : t.keySet()) {
			System.out.println(kv + "  " + t.get(kv)); // 102 David
		} // 101 john

		// To print the entries as Set
		System.out.println("entrySet() method returns the Set of each entry");
		System.out.println(t.entrySet());

		// To print each entry individually using entrySet() method of Map Interface
		System.out.println("Entries by using entrySet() method of Map Interface");
		for (Map.Entry entry : t.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		// To print the entries using hasNext() method and Iterator, Set Interfaces
		System.out.println("Iterator Interface and hasNext()");
		Set s = t.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
