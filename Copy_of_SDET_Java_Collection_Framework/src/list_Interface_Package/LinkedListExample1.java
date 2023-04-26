
//Implementation of Generic Methods of Collection(I), List(I) and its extended class LinkedList

package list_Interface_Package;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {

		// Declare Linked List
		LinkedList l = new LinkedList(); // This will allow us to store heterogeneous data

//		  If we want to store homogeneous data of Integer Type 
//		  LinkedList<Integer> l = new LinkedList<Integer>(); 
//		  If we want to store homogeneous data of String
//		  Type LinkedList<String> l = new LinkedList<String>();
		
		// Add elements to Linked List
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l); // [100, Welcome, 15.5, A, true, null]
		
		System.out.println(l.size());   // 6
		// This will give us how many objects / nodes are present inside Linked List
		
		// Remove the elements from Linked List by Object itself
		l.remove(15.5);
		System.out.println("After removing 15.5:- " + l); // [100, Welcome, A, true, null]
		
		// Remove the elements from Linked List by Index
		l.remove(2);
		System.out.println("After removing 2nd index element:- " + l); // [100, Welcome, true, null]
		
		// At Run time Insert / Add element in the middle of Linked List
		l.add(2, "Java");
		System.out.println("After inserting Java:- " + l);  // [100, Welcome, Java, true, null]

		// Retrieve the value from Linked List 
		System.out.println("After retrieving index 2 element:- " + l.get(2));
		
		// Replace / change the element by set()
		l.set(4, "Hello");
		System.out.println("After Replacing 'null':- " + l);
		
		// Check the presence of any element inside Linked List using contains() method
		// Returns true if the element is present
		// Return false if the element is not present
		System.out.println(l.contains("Java"));   // true
		System.out.println(l.contains("Python"));  // false
		
		// Check if Linked List is empty or not
		// Returns true if the Linked List is Empty
		// Return false if theLinked List is not Empty
		System.out.println("Is Linked List empty?:- " + l.isEmpty());
		
		
		// 1st WAY to read all the elements from Linked List
				// Using for loop
				System.out.println("Reading elements by using for loop");
				for(int i=0;i<l.size();i++) 
				{
					System.out.println(l.get(i));
				}
				
		// 2nd WAY to read all the elements from Linked List
				// Using for-each loop
				System.out.println("Reading elements by using for-each loop");
				for(Object e:l) 
				{
					System.out.println(e);
				}
		
		// 3rd WAY to read all the elements from Linked List
				// Using Iterator() method and while loop
				System.out.println("Reading elements by using Iterator method");
				Iterator it = l.iterator();		
				while (it.hasNext()) 
				{
					System.out.println(it.next());
				}
	}

}
