package javacodingpractise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new TreeMap();
		map.put(2, 3);
		map.put(3, 5);
		map.put(1, 10);
		map.put(11, 1);
		System.out.println(map);
		
		Map map1 = new HashMap();
		map1.put(2, 3);
		map1.put(3, 5);
		map1.put(1, 10);
		map1.put(11, 1);
		System.out.println(map1);
		
		Map map2 = new LinkedHashMap();
		map2.put(2, 3);
		map2.put(3, 5);
		map2.put(1, 10);
		map2.put(11, 1);
		System.out.println(map2);
		
	}

}
