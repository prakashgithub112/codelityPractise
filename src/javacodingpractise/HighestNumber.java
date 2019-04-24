package javacodingpractise;

import java.util.Arrays;
import java.util.Scanner;

public class HighestNumber {

	public static void main(String args[]) {
		
		System.out.println("enter length of an array");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		int [] myArray = new int[g];
		System.out.println("enter an array");
		
		for(int i=0; i<g; i++ ) {
	         myArray[i] = in.nextInt();
	      }
		
		 System.out.println(Arrays.toString(myArray));
		
		 
		 /**
		  * Find the biggest in the array
		  */
		 for(int b=1;b<g;b++) {
			 if (myArray[b] > myArray[0]) 
				 myArray[0] = myArray[b];
		 }
		 System.out.println("The highest in array is="+myArray[0]);
	}
}
