package com.my.algo;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		
		Path log = Paths.get("c:\\temp");
		
		log.forEach(c->{
			System.out.println(c.getFileName());
		});
		
		Files.list(log).forEach(c->{
			
			System.out.println(c.getFileName());
			System.out.println(Files.isDirectory(c));
			
			try {
				Files.readAllLines(c).forEach(s -> System.out.println(s));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Files.newBufferedReader(c).lines().forEach(s -> System.out.println(s));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Files.
		});
		
		//FileReader fr = new FileReader("");
		
	}
}
