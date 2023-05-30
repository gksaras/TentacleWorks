package com.inputoutput;

import java.io.File;
import java.io.IOException;

public class CreatingFileUsingIO {

	public static void main(String[] args) throws IOException {
	
	File f;
	f = new File("E:\\Python");
	
	if (f.exists()) {
		System.out.println("File Exists");
	}
	
	f.mkdir();
	
	f = new File("E:\\Python\\variable.txt");
	f.createNewFile();
	
	f = new File("E:\\Python\\data.jpg");
	f.createNewFile();
	
	f = new File("E:\\Python\\file.md");
	f.createNewFile();
	
	}
}
