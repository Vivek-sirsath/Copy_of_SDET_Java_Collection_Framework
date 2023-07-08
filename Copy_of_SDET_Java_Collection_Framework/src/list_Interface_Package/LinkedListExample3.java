
// Implementation of Special Methods of LinkedList class 
// The methods which are  implemented from List(I) and Deque(I)
// Those methods are addFirst(), addLast(), getFirst(0, getLast(), removeFirst(), removeLast() etc.

package list_Interface_Package;

import java.util.LinkedList;

public class LinkedListExample3 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// Duplicates are allowed

		list.add("Dog");
		list.add("Dog");
		list.add("Cat");
		list.add("Horse");

		System.out.println(list); // [Dog, Dog, Cat, Horse]

		// Special Methods to add objects at First and Last position
		list.addFirst("Tiger");
		list.addLast("Elephant");
		System.out.println("Linked List after adding first and last element:- " + list);
		// [Tiger, Dog, Dog, Cat, Horse, Elephant]

		// Special Methods to retrieve the elements / objects from First and Last
		// position
		System.out.println(list.getFirst()); // Tiger
		System.out.println(list.getLast()); // Elephant

		// Special Methods to remove the elements / objects from First and Last position
		list.removeFirst();
		list.removeLast();
		System.out.println("Linked List after removing first and last element:- " + list);
		// [Dog, Dog, Cat, Horse]

	}

}
