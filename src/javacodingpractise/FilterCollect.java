package javacodingpractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollect {

	public static void main(String[] args) {
		//Having only one condition
		List<String> list = Arrays.asList("Melisandre","Mglisandre","Sansa","Jon","Daenerys","Joffery","Malisandre","Mplisandre");
		List<String> list2 = list.stream().filter(str->str.length()>6).collect(Collectors.toList());
		list2.forEach(System.out::println);
		//Having multiple condition
		System.out.println("======");
		List<String> list3 = list.stream().filter(str->str.length()>6 && str.length()<8).
				collect(Collectors.toList());
		list3.forEach(System.out::println);
		List<Integer> list4 =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("======");
		List<Integer> squares = list4.stream().map(n->n*n).collect(Collectors.toList());
		squares.forEach(System.out::println);
		System.out.println("======");
		list.stream().filter(str->str.startsWith("M")).forEach(System.out::println);
		System.out.println("ordered collection");
		list.stream().filter(str->str.startsWith("M")).parallel().forEachOrdered(System.out::println);
		
	}

}
