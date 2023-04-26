
// How to convert an Array into ArrayList?

package list_Interface_Package;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		String arr[] = {"Dog", "Cat", "Elephant"};
		
		// print elements present in an array using for-each loop
		for(String values : arr) 
		{
			System.out.println(values);
		}
		
		// To convert the array into ArrayList
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al); // [Dog, Cat, Elephant]

	}

}
