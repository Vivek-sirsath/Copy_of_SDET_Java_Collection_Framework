
// Implementation of methods like addAll(), removeAll()
// sort(), shuffle() are not applicable in HashSet because, order is not preserved
// Sequence is not maintained / followed
// If we wish to add, remove collection of objects

package set_Interface_Package;

import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		// Create the Hash Set of Integer data type
		HashSet<Integer> evenNumber = new HashSet<Integer>();
		// evenNumber HashSet is also nothing but a collection
		
		
		// Add elements to Hash set
		evenNumber.add(6);
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		
		System.out.println("Hashset:- " + evenNumber);  // [2, 4, 6, 8]
		
		// Create one more Hash set
		HashSet<Integer> dup_hashSet = new HashSet<Integer>();
		
		
		// To add all the elements from previous HashSet to duplicate HashSet
		dup_hashSet.addAll(evenNumber);
		dup_hashSet.add(10);
		System.out.println("New Hashset:- " + dup_hashSet);  // [2, 4, 6, 8, 10]
		
		// To remove all the elements from duplicate Hash Set except 10
		dup_hashSet.removeAll(evenNumber);
		System.out.println("After removing:- " + dup_hashSet);  // [10]		
			

	}

}
