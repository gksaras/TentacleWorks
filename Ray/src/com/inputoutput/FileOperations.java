package com.inputoutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileOperations {

	private static void io(File file) {
		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isDirectory());
			System.out.println(file.getParent());
			
			if (file.isFile()) {
				System.out.println(file.length());
				System.out.println(file.lastModified());
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println(subfile.getName());
				}
			}
		}
	}
	
	public static void nio(Path path) throws IOException {
		if (Files.exists(path)) {
			System.out.println(path.toAbsolutePath());
			System.out.println(Files.isDirectory(path));
			System.out.println(path.getParent());
			
			if (Files.isRegularFile(path)) {
				System.out.println(Files.size(path));
				System.out.println(Files.getLastModifiedTime(path));
			} else {
				try(Stream<Path> stream = Files.list(path)){
					stream.forEach(p->System.out.println(p.getNameCount()));
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		var f1 = new File("E:\\Life Skill\\JAVA_PRESENT.txt");
		var f2 = new File("E:\\Life Skill");
		
		Path p1 = Path.of("E:\\Life Skill\\JAVA_PRESENT.txt");
		Path p2 = Path.of("E:\\Life Skill");
		
		io(f1);
		io(f2);
		
		nio(p1);
		nio(p2);
		
		
	}
}
