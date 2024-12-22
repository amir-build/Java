package Collectionss;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {
	public static void main(String[] args) 
	  { 
	    Queue<Integer> q = new LinkedList<>(); 
	  
	    // Adds elements {0, 1, 2, 3, 4} to queue 
	    for (int i=0; i<5; i++) 
	     q.add(i); 
	  
	    // Display contents of the queue. 
	    System.out.println("Elements of queue-"+q); 
	  
	    // To remove the head of queue. 
	    int removedele = q.remove(); 
	    System.out.println("removed element-" + removedele); 
	  
	    System.out.println(q); 
	  
	    // To view the head of queue 
	    int head = q.peek(); 
	    System.out.println("head of queue-" + head); 
	  
	    // Rest all methods of collection interface, 
	    // Like size and contains can be used with this 
	    // implementation. 
	    int size = q.size(); 
	    System.out.println("Size of queue-" + size); 
	  } 
	} 
	
// add()- This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
// peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
// element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
// remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.
// poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
// size()- This method return the no. of elements in the queue.
	



	

