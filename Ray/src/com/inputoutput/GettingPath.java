package com.inputoutput;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class GettingPath {

	public static void main(String[] args) {
		
		Path path = FileSystems.getDefault().getPath("E:\\Java\\Ascending.java");
		System.out.println(path.toString());
		
		Path pave = FileSystems.getDefault().getPath("E:\\", "Files","Marvel","Disney","Sony");
		System.out.println(pave);
		
	}
}
