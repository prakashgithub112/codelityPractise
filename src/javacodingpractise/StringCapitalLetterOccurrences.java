package javacodingpractise;

import java.util.Scanner;

public class StringCapitalLetterOccurrences {

	
	public static void main(String[] args) {
		System.out.println("enter string");
		int f=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.next();
		for(int b=0;b<str.length();b++) {
			if(Character.isUpperCase(str.charAt(b))) {
				f++;
			}
		}
		System.out.println("capital letter occurrences are==="+f);
	}

}
