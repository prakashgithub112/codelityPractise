package javacodingpractise;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter string");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String str=in.next();
		String str3="";
		
		System.out.println(str.length());
		for(int b=str.length()-1;b>=0;b--) {
			str3+=str.charAt(b);
		}
		
		System.out.println("Reversed string==="+str3);
		
		System.out.println(str3.equals(str)?"palindrome":"not paindrome");
	}

}
