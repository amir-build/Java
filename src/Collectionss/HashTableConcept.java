package Collectionss;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableConcept {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// HashTable is an implementation of Map it stores of keys on the basisi of hash code of the object
		//Hashtable dont count duplicate value two time, it will be stores as one object
		
		//it is similar to HashMap, but its is sync
		//it stores the value onthe basis of "key" and "value"
		//each and every "key"--> stored as of Object and every Object has Hash code  (unique identifier)
		
	//what is Hash code
		// when you create an object java provides a particular has codr fro that particular object
		//Java object is difined by a some number that is point hash code number it is 32-bit integer number
		
		
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//creating a clone copy/shallow copy
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>(); // could clone to another hashtable
		
//cloning
	    Object object = h1.clone();
		 
		System.out.println("The value from h1 " + h1);
		System.out.println("The value from object " + object);
		
		h1.clear();
		System.out.println("The value from h1 " + h1);
		System.out.println("The value from object " + object);
		
//contains value
		Hashtable st = new Hashtable();
		
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		// no null key and null value --> if you give it will throw exception"NullPointerexception"
		
	//Conditions check
		
		if(st.contains("Naveen")) {
			System.out.println("value is found");
		}
//Printing all values --> Iterating with -- Enameration  -- elements
		
		Enumeration e = st.elements();  // all the values will be store here
		
		System.out.println("print values from 'st' uing enumeration ");
			
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
//get all the values from Hashtable using -- entrySet() -- set of Hashtable values:
		 
		System.out.println("Print values from st using entry set");
		
		Set s = st.entrySet();
		System.out.println(s);
		
//equal method  --> this method simple checked are both methods are equal or not
		
       Hashtable st1 = new Hashtable();
		
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		
		st1.put(null, "value");  //--> this will give en exception-- in HashMap you can have 1 null key and multiple null value
	
		
		//compare
		
		if(st.equals(st1)) {
		
		System.out.println("both are equal");
		
		}
// how to get an value from specific key
		System.out.println(st1.get("A"));
	
//get the HashCode of Hashtable Object
		System.out.println("the hash code value of st1 :  " + st1.hashCode());
		
// dublicate value will be as one object
		
		
		
	
		
		
		
		
	}

}
