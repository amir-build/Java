
public class VowelAndConstant {

	public static void main(String[] args) {
		
		//Vowel letter = a , i , e ,o , u
		
		char ch ='u';
		
		if(ch == 'a'|| ch == 'i' || ch =='e' || ch=='o' || ch == 'u') {
			System.out.println(ch +" is vowel");
		}else {
			System.out.println( ch + " is constant");
		}

		
		
		switch (ch) {
		
		case 'a':
		case 'i':
		case 'e':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;

		default:
			System.out.println(ch + " is constant");
			break;
		}
	}

}
