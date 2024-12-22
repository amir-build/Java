package Collectionss;

import OOPs.inter;

public class Employee {
	
	String name;
	int age;
	String dept;
	
	int a;
    int b;
	
	
	Employee(String name, int age, String dept){
		
		this.name = name;
		this.age = age;
		this.dept = dept;
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
//Static
	public static void setDataStatic(int a , int b) {
		
		
	}
//no static
	
	public void setDataNoneStatic(int b, int a) {
		
	}
	
	
	

	
	
	
	
	
	public static void main (String[] args) {
		
// Static
		
	// when we write static we can call an object in main method, without creating  its object 
			
		setDataStatic(1, 2);    //static  method called
		
		
//without Static 
		
	// if we call a method which is not static __> it will give an error

		//in order to use non-static method, we have create an object of class first
		
		Employee s = new Employee("alex", 20, "dev");
		
		s.setDataNoneStatic(4, 5);
		
		
		
	}
	

}
