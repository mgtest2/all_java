package com.my.v8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("T1","T2");
		
		//Predicat
		//boolean test(Object)
		List<String> filteredList = list.stream().filter(a -> a.equals("T2")).collect(Collectors.toList());
		
		//Function
		//R apply(T)
		List<String> mapList = list.stream().map(a -> a+"1").collect(Collectors.toList());
		
		System.out.println(filteredList);
		System.out.println(mapList);
	}
	
	
}
