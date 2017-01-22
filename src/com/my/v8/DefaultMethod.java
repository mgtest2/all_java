package com.my.v8;

public class DefaultMethod {

	public static void main(String[] args) {
		
		DefaultInterface in = new DefaultInterface(){};
		
		in.test();
		
		DefaultInterface.staticDefaultMethod();
		
	}
	
}
