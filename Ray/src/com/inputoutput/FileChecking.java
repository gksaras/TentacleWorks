package com.inputoutput;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileChecking {

	public static void main(String[] args) {
		
		File f;
		f = new File("E:\\Java");
		
		if (f.exists()) {
			System.out.println("File Exists");
		}
		
		Path of;
		
		of = Path.of("E:\\Life Skill\\JAVA_PRESENT.txt");
		System.out.println(Files.exists(of));
		
	    of = Path.of("E:\\Java","Ascending.java");
	    System.out.println(Files.exists(of));
	     
	    
	    of = Paths.get("E:\\", "Java", "stripes.txt");   
	    System.out.println(Files.exists(of));
	    
	    of = Paths.get("E:\\", "Java", "Ascending.java");   
	    System.out.println(Files.exists(of));
	     
	}
}
