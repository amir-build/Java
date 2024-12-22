import java.util.Scanner;



public class PrintAnIntegerEnteredByUser {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter Number: ");
		
		int num = reader.nextInt();
		
		System.out.println("Your entered number:" + num);
		
		reader.close();
		
	}
	

}
