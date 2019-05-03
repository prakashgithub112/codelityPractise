package javacodingpractise;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAndHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer,Integer> sm = new TreeMap<Integer,Integer>();
		sm.put(1, 1);
		sm.put(3, 5);
		sm.put(2, 2);
		sm.put(3, 3);
		sm.put(3, 4);
		//sm.put(null, 4);
		System.out.println(sm);
		
		Map<Integer,Integer> sm2 = new HashMap<Integer,Integer>();
		sm2.put(1, 1);
		sm2.put(3, 5);
		sm2.put(2, 2);
		sm2.put(3, 3);
		sm2.put(3, 4);
		sm2.put(null, 4);
		System.out.println(sm2);
		

	}

}
