
// Implementation of methods of PriorityQueue class to perform different operations on Queue

package queue_Interface_Package;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample1 {

	public static void main(String[] args) {
		
		// Create Priority Queue and its object
		PriorityQueue pq = new PriorityQueue();	
		
//      We can use the queue methods in LinkedList also
//      Create LinkedList
//		LinkedList pq1 = new LinkedList();  // In this, insertion order will be preserved
		
		
		//add()
		pq.add(10); // Throws Exception if unsuccessful insertion // java.lang.ClassCastException
		pq.add(20);
		pq.add(5);
		pq.add(40);
		pq.add(20); // Duplicate element
		pq.add(80);
			
		// Only homogeneous data type is allowed
		// Insertion order will not preserve
		// Duplicates are allowed
		System.out.println(pq);           // [5, 20, 10, 40, 20, 80]
		
		
		
		// At Run Time add one more element to the queue		
		// offer()
		pq.offer(70); // Returns false if unsuccessful insertion in case of other data type
		System.out.println(pq);           // [5, 20, 10, 40, 20, 80, 70]
		// Header element is 5
		// Addition happens from Tail side only i.e. 20
		
		System.out.println("Total elements in queue:- " + pq.size());
		
// ****************************************************************************************//		
	
		// Access element - using element() and peek() method
		// Access happens from Head side only
		
//		pq.clear();
//		System.out.println(pq);             // [] - Empty Queue
		
		// element()
		// Will return header element
		System.out.println("Header element of the queue using element():- " + pq.element());   // 5
		// java.util.NoSuchElementException - Returns Exception if queue is empty

		
		// peek()
		// Will return header element
		System.out.println("Header element of the queue using peek():- " + pq.peek());      // 5
		// null - Returns null if queue is empty

//*****************************************************************************************//		
		
		// Remove()	- Will remove header element	
		System.out.println("Header element using remove():- " + pq.remove()); // 5
		// java.util.NoSuchElementException - Returns Exception if queue is empty
		System.out.println("Queue elements after remove method:- " + pq);	//[10, 20, 70, 40, 20, 80]	

		// poll()		
		System.out.println("Header element using poll():- " + pq.poll());   // 10
		// will remove header element
		// null - Returns null if queue is empty
		System.out.println("Queue elements after poll method:- " + pq);    // [20, 20, 70, 40, 80]
		
		
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
