package Collectionss;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import OOPs.inter;

public class HashMapConcept {
	
	
	public static void main (String[] args) {
		
		//HashMap is a class implements Map Interface
		//we use HashMap for multi-threading application
		//extends AbstractMap
		//it contains inly unique elements
		//stores the (key,value) pairs
		//it may have one null "key" and multiple null "value"
		// it main no order.
		// it is not sync but you can make it sync  means--> if it is used in multi -treading environment ore than 1 threat can access and process the HashMap simultaneously
		   // there are multiple threads are running on and then HashMap web object can accessed by all the threads
			//so performance of the HashMap will be increased automatically
				//if we want to use fast performance K,V
				//multiple users can access at the same time
		  //onePrblem with HashMap fail-fast condition. --> when multiple threads  happening, second threat get what first thread update, so it means that when thread 2 except something but if it was updated by thread 1 , thread 2 will get different value
	
		//Concurrent modification exception - failed-fast condition - it will come into picture when one thread is adding or removing the value and at the same time conrurently thread 2,3 trying to access that particular value
		
		//HashTable is sync(treat safe) at one time --> only one thread can access (
		 //one user can access at one time
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplite");
		hm.put(4, "RFT");
		
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));  // printout will be "null" it doesn't have  out of boundary exception
		
//Iterating HashMap
		
		for(Entry m : hm.entrySet()) {   // entry.set --> will store  HashMap  
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
// remove
		
		hm.remove(3);
		System.out.println(hm); // after removing(3), 4th will not become 3th, so no specific location for each position
	
// saving a reference in HashMap		
		
		//creating an hashMap to store # of employee(int) as "key", employee(method) as "value"
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		
		//creating employee
		Employee e1 = new Employee("Alex", 25, "admin");
		Employee e2 = new Employee("Tom", 26, "QA");
		Employee e3 = new Employee("Tim", 27, "DEV");
		
		//adding our objects(employees) as "value" into HashMap, "key" will be number of employee
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the HashMap -iterate by using for inhance loop
		for(Entry<Integer, Employee> m : emp.entrySet()) {  //all "emp" info is saved in "m" for iteration
			
			int key = m.getKey();        // asking from "m" to save all key in "key"
			Employee e = m.getValue();   // asking from "m" to save all value in "e"
			
			System.out.println("Employee " + key + " Info:");
			System.out.println(e.name + " " + e.age + " " + e.dept );
			
			
			
			
			//if we want to print only  name(e,name) only
			System.out.println(e.name);
			
			//if we want to print only  name(e,age) only
			System.out.println(e.age);
			
			//if we want to print only  name(e,dept) only
			System.out.println(e.dept);
			
		}
		

		
		
		
		
		
	}
	
	
	
	

}
