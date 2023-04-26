
// How to perform mathematical operations like Union, Intersection, Difference, Subset

package set_Interface_Package;

import java.util.HashSet;

public class HashSetExample3 {

	public static void main(String[] args) {
		
		// We perform Union of sets , Intersection, Difference of sets
		
		// Create 1st hash Set
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		// Add elements / values 
		set1.add(5);
		set1.add(4);
		set1.add(3);
		set1.add(2);
		set1.add(1);
		set1.add(6);
		set1.add(7);	
		
		// Duplicates are not allowed
	    // Insertion order not preserved
		System.out.println("Hashset1:- " + set1);   // [1, 2, 3, 4, 5, 6, 7]
		
		// Create one more 2nd hash set
		HashSet<Integer> set2 = new HashSet<Integer>();
		// add values
		set2.add(2);
		set2.add(5);
		set2.add(7);		
		System.out.println("Hashset2:- " + set2);  // [2, 5, 7]
		
		// To perform the Union
		set1.addAll(set2);
		System.out.println("Union:- " + set1);  // [1, 2, 3, 4, 5, 6, 7]
		
		// To perform Intersection 
		// This will return common elements from both sets
		set1.retainAll(set2);
		System.out.println("Intersection:- " + set1);  // [2, 5, 7]
		
		// To perform Difference
		set1.removeAll(set2);
		System.out.println("Difference:-" + set1);   // [1, 3, 4, 6]
		
		// To perform Subset
		// Returns 'true' if all the elements of set2 are present in set1
		// Returns 'false' if all the elements of set2 are not present in set1
		set1.containsAll(set2);
		System.out.println(set1.containsAll(set2));  // true
	    System.out.println("Subset:-" + set1);   // [1, 2, 3, 4, 5, 6, 7]
				
	}

}
