package javacodingpractise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.contains(5));
		System.out.println(list.contains(4));
	}

}
