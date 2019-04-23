package java8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Monkey");
		map.put(2, "Monkey2");
		map.put(3, "Monkey3");
		map.put(4, "Monkey4");
		map.forEach((key,value)->System.out.println("key--"+value));
		

	}

}
