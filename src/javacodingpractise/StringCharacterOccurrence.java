package javacodingpractise;

import java.util.Scanner;

public class StringCharacterOccurrence {

	
	public static void main(String[] args) {
		System.out.println("enter string");
		int f=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println("enter character to find the occurences");
		
		@SuppressWarnings("resource")
		Scanner in1 = new Scanner(System.in);
		String c = in1.next();
		
		for(int b=0;b<str.length();b++) {
			if(c.equals(Character.toString(str.charAt(b)))) {
				f++;
			}
		}
		System.out.println("String occurrences are==="+f);
	}

}
