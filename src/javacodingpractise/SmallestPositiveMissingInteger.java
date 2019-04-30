package javacodingpractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestPositiveMissingInteger {

	public static void main(String args[]) {
		
		System.out.println("enter length of an array");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("enter an array");
		
		
		
		for(int i=0; i<g; i++ ) {
			list.add(in.nextInt());
	      }
		int i=0;

		 /**
		  * Find the smallest missing number in the array
		  */
		 for(i=1;i<=list.size();) {
			 if(list.contains(i)) {
				 i++;
				 continue;
			 } else {
				 //System.out.println("The smallest number which does not exist in list is"+i);
				 break;
			 }
		 }
		 
		 System.out.println("The smallest number which does not exist in list is"+i);
		 

		 
	}
}
