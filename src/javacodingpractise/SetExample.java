package javacodingpractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> sm = new HashSet<Integer>();
		sm.add(1);
		sm.add(2);
		sm.add(3);
		sm.add(4);
		sm.add(3);
		sm.add(5);
		sm.add(null);
		sm.add(4);
		//sm.put(null, 4);
		System.out.println(sm);
		
		Set<Integer> sm2 = new LinkedHashSet<Integer>();
		sm2.add(1);
		
		sm2.add(2);
		sm2.add(3);
		sm2.add(4);
		sm2.add(3);
		sm2.add(5);
		sm2.add(4);
		sm2.add(null);
		//sm.put(null, 4);
		System.out.println(sm2);
		
		Set<Integer> sm3 = new TreeSet<Integer>();
		sm3.add(1);
		
		sm3.add(2);
		sm3.add(3);
		sm3.add(4);
		sm3.add(3);
		sm3.add(5);
		sm3.add(4);

		//sm.put(null, 4);
		System.out.println(sm3);

		
	}

}
