
public class SwapNumbers {

	public static void main(String[] args) {
		
		
		
		int a = 10;
		
		int b = 20;
		
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		
//		int temp;
//		
//		temp = a;
//		a = b;
//		b= temp;
//		
//		 
//		 System.out.println("After swapping with extra veriable");
//		 System.out.println("a = " + a);
//		 System.out.println("b = " + b);
		 
		 ///////
//Swapping without creating extra variable;
		
		 System.out.println("Before swapping");
			System.out.println("a = "+a);
			System.out.println("a = "+b);
			
			
		System.out.println("after swaping");
		
		a=a-b; //a(10)-b(20)  a=-10 (getting difference of two number)
		b=a+b; //a(-10)+b(20)  b = 20 ( adding the difference to b(2number) = result to 1 number
		a=b-a; //b(20)+(-10)  a = 10 ( subtracting from (above result (b))  the (difference (a)) (getting as a result + initial second value)
		
		System.out.println("a = " + a);
		System.out.println("b = "+ b);
	}

}
