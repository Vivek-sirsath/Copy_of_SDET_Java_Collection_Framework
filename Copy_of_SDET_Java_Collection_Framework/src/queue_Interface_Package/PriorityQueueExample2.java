package queue_Interface_Package;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		
		// Create PriorityQueue and its Object
		PriorityQueue pq = new PriorityQueue();
		
//      We can use the queue methods in LinkedList also
//      Create LinkedList
//		LinkedList pq1 = new LinkedList();  // In this, insertion order will be preserved
		
		
		// Only homogeneous data type is allowed
		// Insertion order will not preserve
		// Duplicates are allowed
		
		//add()
		pq.add("Vivek"); // Throws Exception if unsuccessful insertion // java.lang.ClassCastException
		pq.add("Ishita");
		pq.add("Deepika");
		pq.add("Mayur");
		pq.add("Vandana"); // Duplicate element
		pq.add("Rajendra");
		pq.add("Ishita");
		
		// Only homogeneous data type is allowed
		// Insertion order will not preserve
		// Duplicates are allowed
		System.out.println(pq); // [Deepika, Mayur, Ishita, Vivek, Vandana, Rajendra, Ishita]
		

		// At Run Time add one more element to the queue		
		// offer()
		pq.offer("Sanju"); 
		// Returns java.lang.ClassCastException if unsuccessful insertion in case of other data type
		System.out.println(pq);  // [Deepika, Mayur, Ishita, Sanju, Vandana, Rajendra, Ishita, Vivek]
		// Header element is Deepika
	    // Addition happens from Tail side only i.e. Vivek
		
// ******************************************************************************************************8		
		// Access/return element - using element() and peek() method
		// Access happens from Head side only
				
//		pq.clear();
//		System.out.println(pq);             // [] - Empty Queue
				
		// element()
		// Will return header element
		System.out.println("Header element of the queue using element():- " + pq.element());   // Deepika
		// java.util.NoSuchElementException - Returns Exception if queue is empty
		
		// peek()
		// Will return header element
		System.out.println("Header element of the queue using peek():- " + pq.peek());      // Deepika
		// null - Returns null if queue is empty

		//*****************************************************************************************//	
		
		// Remove()	- Will remove header element	
		System.out.println("Header element using remove():- " + pq.remove()); // Deepika
		// java.util.NoSuchElementException - Returns Exception if queue is empty
		System.out.println("Queue elements after remove method:- " + pq);	// [Ishita, Mayur, Ishita, Sanju, Vandana, Rajendra, Vivek]
		
		// poll()		
		System.out.println("Header element using poll():- " + pq.poll());   // Ishita
		// After retuening the header element will remove header element
		// null - Returns null if queue is empty
		System.out.println("Queue elements after poll method:- " + pq);    // [Ishita, Mayur, Rajendra, Sanju, Vandana, Vivek]
		
		
		// 1st WAY to read the priority queue elements
				// using iterator() and while loop
				System.out.println("Reading elements by using Iterator method");
				Iterator it = pq.iterator();
				while(it.hasNext()) 
				{
					System.out.println(it.next());
				}
				
				// 2nd WAY to read the priority queue elements
				// using for each loop
				System.out.println("Reading elements by using for-each loop");
				for(Object e:pq) 
				{
					System.out.println(e);
				}
				
	}

}
