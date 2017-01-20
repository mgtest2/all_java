package com.my.v8;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	
	public static void main(String[] args) {
		collection();
		collectionSorting();
		Lambda l =  new Lambda();
		System.out.println(l);
		l.thread();
	
	}
	
	private void thread(){
		
		int i = 10;
		Thread t = new Thread(() -> {System.out.println("test");
		
			System.out.println(this);
			System.out.println(i);
		} );
		t.start();
	}
	
	private static void collection(){
		
		List list = Arrays.asList("T1","T2");
		
		System.out.println("Method ref");
		list.forEach(System.out::println);
		
		System.out.println("Lambda");
		list.forEach(s -> System.out.println(s));
		
	}
	
	private static void collectionSorting(){
		
		System.out.println("Sorting");
		List<String> list = Arrays.asList("T2","T1");
		
		list.sort((a,b) -> a.compareTo(b));
		
		list.forEach(System.out::println);
		
	}
	
	
}
