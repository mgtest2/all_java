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
	
	
	public void fisherYate() {
		
			List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
			Random random = new Random();
			for(int i=list.size()-1; i >= 0; i-- ) {
				//System.out.println(i);
				int randomIndex = random.nextInt(i+1);
				String valudAtRandomIndex = list.get(randomIndex);
				
				String valueAtCurrentIndex = list.get(i);
				
				list.set(randomIndex, valueAtCurrentIndex); 
				list.set(i, valudAtRandomIndex); 
				
				System.out.println("i = "+i+" - random -"+randomIndex+" - "+list);
			}
			
	}
	
	
}
