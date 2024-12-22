package Basics;

import OOPs.inter;

public class twoDArray {

	public static void main(String[] args) {
		
		// we can store same type of "date type" in one line
		int a=5, b=6,c=7, d=8; 
		

		
		//array this form
		//int  p[row][column] = new int [lenght(row)][lenght(column);
		int p [][] = new int[3][4];
		p[0][0] = 5;  					
		p[0][1] = 6;
		
		System.out.println(p[0][0]); // output 5
		
		// or in arrays in one line --> all three is 1D arrays
		int x[] = {5,6,7,8};
		int y[] = {6,7,8,9};
		int z[] = {9,8,7,6};
		
		// lets print only 1D array
		for(int i=0; i<4;i++) {
			
			//printing 1D array x[]
			System.out.println(x[i]);  // output 5,6,7,8
		}

		
		//static assigment 
		// we will create array for arrays ( which will be 2D array controled with 2 for loops)
		// this array wil not hold value only arrays
		
		int pp[][] = { {5,6,7,8},
					   {6,7,8,9},
				       {9,8,7,6} };
		
		
		// since we can't print 2D array with on loop --> we will use 2 for loops
		
		for(int i=0; i<3; i++) { //loop for Row
			
			for(int j=0; j<4; j++) { //loop for column
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
