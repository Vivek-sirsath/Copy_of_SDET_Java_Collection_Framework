
// //Implementation of Generic Methods of Collection(I), Set(I) and its extended class HashSet

package set_Interface_Package;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {

		// Declare or Create HashSet array object
		HashSet hs = new HashSet(); // Default Capacity 16 and Load Factor 0.75
		// This will allow us to store heterogeneous data
//		If we wish to store 100 elements
//		HashSet hs1 = new HashSet(100);  // default capacity 100
//		We can specify with load factor 
//		HashSet hs2 = new HashSet(100, (float)0.90);     // Here is a type casting of float and 0.90

//		  If we want to store homogeneous data of Integer Type 
//		  HashSet<Integer> hs1 = new HashSet<Integer>(); 
//		  If we want to store homogeneous data of String Type
//		  HashSet<String> hs2 = new HashSet<String>();

		// Add elements to HashSet
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		

		// Insertion order is not preserved
		// Duplicates not allowed
		System.out.println(hs); // [16.5, null, A, 100, Welcome, true] 
		

		System.out.println(hs.size()); // 6
		// This will give us how many objects are present inside HashSet

		// Remove the elements from HashSet by Object itself
		hs.remove(16.5);
		System.out.println("After removing 16.5:- " + hs); // [null, A, 100, Welcome, true]

		// At Run time Insert / Add element in the middle of HashSet
		hs.add("Selenium");
		System.out.println("After inserting Selenium:- " + hs); // [null, A, 100, Welcome, Selenium, true]
		

		// Check the presence of any element inside HashSet array using contains()
		// method
		// Returns true if the element is present
		// Return false if the element is not present
		System.out.println("Is Selenium present in HashSet:- " + hs.contains("Selenium")); // true
		System.out.println("Is Python present in HashSet:- " + hs.contains("Python")); // false

		// Check if HashSet is empty or not
		// Returns true if the HashSet is Empty
		// Return false if the HashSet is not Empty
		System.out.println("Is HashSet empty?:- " + hs.isEmpty());

		// 1st WAY to read all the elements from HashSet
		// Using for-each loop
		       System.out.println("Reading elements by using for-each loop");
		       for (Object e : hs) 
		       {
			      System.out.println(e);
		       }

		// 2nd WAY to read all the elements from HashSet
		// Using Iterator() method and while loop
		      System.out.println("Reading elements by using Iterator method");
		      Iterator it = hs.iterator();
		      while (it.hasNext()) 
		      {
		         System.out.println(it.next());
		      }
	}

}
