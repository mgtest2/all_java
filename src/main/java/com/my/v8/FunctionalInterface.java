package com.my.v8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {

	
	public static void main(String[] args) {
		
		
		FunctionalInterface fi = new FunctionalInterface();
		
		List<String> list = Arrays.asList("T");
		
		list.forEach(FunctionalInterface::print);
	
		list.forEach(fi.new FInterface());
		
	}
	
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	class FInterface implements Consumer<String>{

		@Override
		public void accept(String t) {
			System.out.println(this);
			System.out.println(t);
			
		}
		
		
		
	}
		
		
		
	}
	
	
