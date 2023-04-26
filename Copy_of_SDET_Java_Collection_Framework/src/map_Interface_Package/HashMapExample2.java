
// Use of Map interface methods like put(), get(), remove(), containsKey(), containsValue()
// isEmpty(), keySet(), values(), entrySet(), getKey(), getValue(), putAll()
// Hash Map array 'hm' in console is shown in {curly braces}
// While Set of Keys and set of Values shown in [square braces]

package map_Interface_Package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		// Create map specific Hash Map
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "JavaScript");
		hm.put(4, "C#");
		System.out.println(hm);   // {1=Java, 2=Python, 3=JavaScript, 4=C#}
		
		System.out.println(hm.get(2));  //Python
		
		// To print the set of keys using keySet() method
		System.out.println(hm.keySet());  //[1, 2, 3, 4]
		
		// To print individual keys
		for(int ks : hm.keySet()) 
		{
			System.out.println(ks);  // 1,2,3,4
		}
		
		// Set of values
		System.out.println(hm.values());  //[Java, Python, JavaScript, C#]
		
		// For individual values
		for(String v : hm.values()) 
		{
			System.out.println(v);
		}
		
		String st = hm.remove(3);
		System.out.println("After Removing:- " + hm); // JavaScript has removed
		System.out.println("This is what which is getting remove:- " + st);
		
//		hm.clear();
//		System.out.println(hm);   // {}
//		System.out.println(hm.isEmpty());  // true
		System.out.println(hm.isEmpty());  // false
		
		// For entry set
		System.out.println("Entry Set:- " + hm.entrySet()); // [1=Java, 2=Python, 4=C#]
		// For printing each set individually		
		for(Object eset : hm.keySet()) 
		{
			System.out.println(eset + "  " + hm.get(eset));
		}
		
		// To check the presence of key
		System.out.println(hm.containsKey(2));  //true
		System.out.println(hm.containsKey(5));  //false
		
		//To check the presence of value
		System.out.println(hm.containsValue("C#")); //true
		System.out.println(hm.containsValue("Ruby")); //false
		
		// Replace()
		hm.replace(4, "HTML");
		System.out.println("After replacing C#:- " + hm);  // {1=Java, 2=Python, 4=HTML}
		
		// Create new Hash Map
		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		System.out.println(hm2);  // {} - an empty array
		
		hm2.put(5, "Ruby");
		hm2.put(6, "SQL");
		hm2.put(7, "ReactJS");
		hm2.put(3, "JavaScript");
		
		// putAll()
		hm2.putAll(hm);
		System.out.println("hm2 after adding all elements from hm:- " + hm2);
		
		
		// Print the key-values of hm2
		Set s = hm2.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) 
		{
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
