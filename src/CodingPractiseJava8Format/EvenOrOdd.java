package CodingPractiseJava8Format;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("enter choice, 1 for add , 2 for Prime and 3 for palindrome");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		
		System.out.println("enter number");
		
		@SuppressWarnings("resource")
		Scanner in1 = new Scanner(System.in);
		int number = in1.nextInt();
		
		
		switch(choice) {
		case 1:
			AdditionJava8 addition = (int a, int b) -> a + b;
			System.out.println("Addtion is==="+addition.operation(10, 5));
			break;
		
		case 2:
			System.out.println("is Prime or not==="+java.math.BigInteger.valueOf(number).isProbablePrime(1));
			break;
		case 3:
			System.out.println("Palindrome or not==="+Integer.toString(number).equals( new StringBuilder(Integer.toString(number)).reverse().toString() ));
			break;
		}
		

	
		
		/*EvenOrAddInterface evod = (int a) -> {
			if(a%2==0) {
				System.out.println("Number "+a+" is even.");
			} else {
				System.out.println("Number "+a+" is odd.");
			}
		};
		evod.even(2);*/
		
	}

	

}
