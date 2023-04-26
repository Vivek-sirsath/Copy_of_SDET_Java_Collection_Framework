package map_Interface_Package;

import java.util.Hashtable;

public class HashTableExample2 {

	public static void main(String[] args) {
		
		Hashtable ht2 = new Hashtable();
				
		ht2.put(102, 50);
		ht2.put(103, 15.5);
		ht2.put(101, "Vivek");
		ht2.put(104, true);
//		ht2.put(null, "Ishita"); // Null not allowed as Key OR Value
		
		// Insertion Order Not Preserved
		// Heterogeneous Data Allowed
		System.out.println(ht2);

	}

}
