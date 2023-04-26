
// Implementation of Generic Methods of Collection(I), List(I) and its extended class ArrayList

package list_Interface_Package;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {

		// Declaration of ArrayList
		ArrayList al = new ArrayList();
		// This allows us to store heterogeneous data type elements/objects, also
		// duplicate objects

		/*
		 * To store the homogeneous data type elements we will use wrapper class
		 * ArrayList<Integer> al1 = new ArrayList<Integer>(); // Store numbers only OR integer type elements
		 * ArrayList<String> al2 = new ArrayList<String>(); // Store string type
		 * elements 
		 * List al3 = new ArrayList(); // List is a parent interface of
		 * ArrayList Class
		 */

		// Add new elements/objects to the ArrayList
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		al.add(null);
		

		// Print all added elements
		System.out.println("All elements:- " + al); // [100, Welcome, 15.5, A, true, null]
		// Print total no. of elements
		System.out.println("Total no of elements before removing:- " + al.size()); // 6

		// Remove element from ArrayList by index
		al.remove(2);
		// Remove element from ArrayList by object/element itself
		al.remove("Welcome");
		System.out.println("All elements after removing:- " + al); // [100, A, true, null]

		// Insert new element in ArrayList
		al.add(2, "Python");
		System.out.println("All elements after insertion:- " + al); // [100, A, Python, true, null]

		// To retrieve specific element/object from ArrayList
		System.out.println("The retrieved Element:- " + al.get(2)); // Python - here 2 is the index of that element

		// To change/replace the existing value
		// replace 'Python' by 'Ruby'
		al.set(2, "Ruby");
		System.out.println("All elements after replacing:- " + al); // [100, A, Ruby, true, null]

		// Search OR Verify the existence of any element by contains() method
		// Returns true if the element is present
		// Return false if the element is not present
		System.out.println("Is Ruby element present in ArrayList?:- " + al.contains("Ruby"));
		System.out.println("Is C# element present in ArrayList?:- " + al.contains("C#"));

		// Check if ArrayList is empty or not
		// Returns true if the ArrayList is Empty
		// Return false if the ArrayList is not Empty
		System.out.println("Is ArrayList empty?:- " + al.isEmpty());
		
		// Using for loop
		// 1st WAY to read all the elements from ArrayList
		System.out.println("Reading elements by using for loop");
		for(int i=0;i<al.size();i++) 
		{
			System.out.println(al.get(i));
		}
		
		// 2nd WAY to read all the elements from ArrayList
		// Using for-each loop
		System.out.println("Reading elements by using for-each loop");
		for(Object e:al) 
		{
			System.out.println(e);
		}
		
		// 3rd WAY to read all the elements from ArrayList
		// Using Iterator() method and while loop
		System.out.println("Reading elements by using iterator() method");
		Iterator it = al.iterator();		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
	}

}
