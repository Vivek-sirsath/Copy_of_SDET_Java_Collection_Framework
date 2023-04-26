
// Implementation of methods like addAll(), removeAll(), sort(), shuffle() 

package list_Interface_Package;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add('X');
		al.add('Y');
		al.add('Z');
		al.add('A');
		al.add('B');
		al.add('C');
		
		// Print the ArrayList
		System.out.println("Objects inside the ArrayList:- " + al); // Insertion Order is Preserved
		
		// Create another ArrayList and Add all elements from previous ArrayList
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println("Duplicate ArrayList:-" + al_dup);
		
		// Remove all the elements from duplicate ArrayList
		al_dup.removeAll(al);
		System.out.println("After removing all elements:- " + al_dup);
				
		System.out.println("Elements before sorting:- " + al);
		
		// Sort the elements using Collections.sort()
		Collections.sort(al);
		System.out.println("Elements after sorting:- " + al	);
		
		// Sort the elements in reverse order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements after sorting in reverse order:- " + al);
		
		// Shuffle the elements using Collections.shuffle()
		Collections.shuffle(al);
		System.out.println("Elements after shuffle:- " + al);

	}

}
