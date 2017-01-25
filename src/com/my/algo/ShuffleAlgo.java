package com.my.algo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShuffleAlgo {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("test1","test2","test3","test4");
		
		Random r = new Random();
		for(int i=0; i< list.size() ; i++){
			
			swap(list, i, r.nextInt(list.size()));
			
		}
		
		System.out.println(list);
		
		
	}
	
	private static void swap(List<String> list, int i, int j){
		
		String s = list.get(i);
		
		list.set(i, list.get(j));
		
		list.set(j, s);
		
		
	}
	
	
	
}
