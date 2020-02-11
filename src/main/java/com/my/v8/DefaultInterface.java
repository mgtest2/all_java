package com.my.v8;

public interface DefaultInterface {

	public default void test(){
		
		System.out.println("test");
	}
	
	public static void staticDefaultMethod(){
		
		System.out.println("default test");
	}
}
