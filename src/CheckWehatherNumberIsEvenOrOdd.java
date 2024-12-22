import java.util.Scanner;

public class CheckWehatherNumberIsEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter your number");
		int num = reader.nextInt();
		
	
		
		if(num % 2 == 0) {
			System.out.println(num + " is even Number");
		}
		
			
		
		else {
			System.out.println(num + " is odd Number");
		}
		
		
	}

}
