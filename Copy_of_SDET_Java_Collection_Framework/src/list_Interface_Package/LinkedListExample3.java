
//Implementation of Special Methods of LinkedList class 

package list_Interface_Package;

import java.util.LinkedList;

public class LinkedListExample3 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		

		list.add("Dog");
		list.add("Dog");
		list.add("Cat");
		list.add("Horse");
		
		System.out.println(list);
		
		// Special Methods to add objects at First and Last position
		list.addFirst("Tiger");
		list.addLast("Elephant");		
		System.out.println("Linked List after adding first and last element:- " + list);
		
		// Special Methods to retrieve the elements / objects from First and Last position
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		// Special Methods to remove the elements / objects from First and Last position
		list.removeFirst();
		list.removeLast();
		System.out.println("Linked List after removing first and last element:- " + list);
		

	}

}
