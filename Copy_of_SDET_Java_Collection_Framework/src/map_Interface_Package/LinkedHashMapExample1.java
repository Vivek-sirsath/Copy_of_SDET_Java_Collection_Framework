package map_Interface_Package;

import java.util.Collections;
import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {

		LinkedHashMap lhmap = new LinkedHashMap();
		
		lhmap.put(106, "Vivek");
		lhmap.put(103, 75.5);
		lhmap.put(102, "Ishu");
		lhmap.put(101, true);
		lhmap.put(104, 30);
		lhmap.put(105, null);
		lhmap.put(true, true);
		lhmap.put(108, null);
		lhmap.put(null, null);
		lhmap.put(null, "Deepika"); // Only one null key Accepted
		lhmap.put(109, null);
		lhmap.put(110, "Deepika");
		
//		lhmap.put(102, "vandana");  // Duplicate Keys Not Allowed

		// Insertion order preserved
		// Duplicate keys not allowed, Duplicate values allowed
		// Only one null key accepted, Multiple null values accepted
		System.out.println(lhmap);
		// {106=Vivek, 103=75.5, 102=Ishu, 101=true, 104=30, 105=null, true=true, 108=null}
	
				
		
	}

}
