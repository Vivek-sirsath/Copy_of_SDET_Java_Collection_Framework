
// This program will show how the insertion order will be preserved in LinkedHashSet
// Sequence of inserting elements will be maintained
// Duplicates not allowed

package set_Interface_Package;

import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {
		
		//Create Linked Hash Set object
		LinkedHashSet lset = new LinkedHashSet(); // This will store all the data types
		
		// to store homogeneous data types
		// LinkedHashSet<Integer> lset1 = new LinkedHashSet<Integer>();
		
		lset.add(100);
		lset.add("Java");
		lset.add(300);
		lset.add(400);
		lset.add(null);
		lset.add(true);
		
		
		// Insertion order will be preserved
		// Duplicates not allowed
		System.out.println(lset);    // [100, Java, 300, 400, null, true]

	}

}
