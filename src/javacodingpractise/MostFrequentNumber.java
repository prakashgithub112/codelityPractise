package javacodingpractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MostFrequentNumber {

public static void main(String args[]) {
		
		System.out.println("enter length of an array");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		int [] myArray = new int[g];

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		System.out.println("enter an array");
		
		for(int i=0; i<g; i++ ) {
	         myArray[i] = in.nextInt();
	      }
		
		System.out.println(Arrays.toString(myArray));
		
		
		for (int i = 0; i < g; i++) 
        { 
            if(map.containsKey(myArray[i])) {
            	int b = Integer.parseInt(map.get(myArray[i]).toString());
            	b++;
            	map.put(myArray[i], b);
            } else {
            	map.put(myArray[i], 1);
            }
        }
        int element = 0;
        
        int frequency = 1;
        
		 Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		 System.out.println("entryset is===="+entrySet);
		 
		for (Entry<Integer, Integer> entry : entrySet) 
        {
            if(entry.getValue() > frequency)
            {
                element = entry.getKey();
                 
                frequency = entry.getValue();
            }
        }
		
		System.out.println("The highest frequest numbe ris=="+element+"and the element is ==="+frequency);
        
	}
}
