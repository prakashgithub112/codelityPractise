package javacodingpractise;

public class HashcodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("prakash");
		String str2 = new String("prakash");
		System.out.println(str.equals(str2));
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		Employee emp1 = new Employee(21,"prakash");
		Employee emp2 = new Employee(21,"prakash");
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		

	}

}
