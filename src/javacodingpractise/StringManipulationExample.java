package javacodingpractise;

public class StringManipulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= new String("Prakash");
		String str2= new String("Prakash");
		String str3 = str1;
		String str4 = str2;
		String str32 = str1.intern();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str3==str1);
		System.out.println(str3==str2);
		System.out.println(str32==str1);
		System.out.println(str32==str2);
		System.out.println(str32==str3);
		System.out.println(str32==str4);
	}

}
