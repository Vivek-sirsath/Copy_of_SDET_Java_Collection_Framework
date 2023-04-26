
// Implementation of methods like addAll(), removeAll(), sort(), shuffle()
// If we wish to add, remove Or manipulate multiple objects in Linked List

package list_Interface_Package;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		
		// Create Linked List (At first it ill be empty)
		LinkedList list = new LinkedList();
		
		System.out.println("Is Linked List empty?:- " + list.isEmpty());
		
		
		list.add('X');
		list.add('Y');
		list.add('Z');
		list.add('A');
		list.add('B');
		list.add('C');
		
		// Create another Linked List and Add all elements from previous Linked List
		LinkedList list_dup = new LinkedList();
		list_dup.addAll(list);
		System.out.println("Duplicate Linked List:-" + list_dup); // [X, Y, Z, A, B, C]
		
		// Remove all the elements from duplicate Linked List
		list_dup.removeAll(list);
		System.out.println("After removing all elements:- " + list_dup); // [] - Empty List
				
		System.out.println("Elements before sorting:- " + list); // [X, Y, Z, A, B, C]
		
		// Sort the elements using Collections.sort()
		Collections.sort(list);
		System.out.println("Elements after sorting:- " + list);  // [A, B, C, X, Y, Z]
		
		// Sort the elements in reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Elements after sorting in reverse order:- " + list);  // [Z, Y, X, C, B, A]
		
		// Shuffle the elements using Collections.shuffle()
		Collections.shuffle(list);
		System.out.println("Elements after shuffle:- " + list); //  [A, B, Y, C, X, Z]

	}

}
