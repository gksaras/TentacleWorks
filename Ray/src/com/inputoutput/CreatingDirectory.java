package com.inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatingDirectory {

	public static void main(String[] args) throws IOException {
		
	//	Files.createDirectory(Path.of("E:\\Files"));
		
	//	Files.createDirectories(Path.of("E:\\Files\\Marvel\\Disney\\Sony\\SpiderMan-4 No Home\\Casting.txt"));
		
    //	Files.deleteIfExists(Path.of("E:\\Files\\Marvel\\Disney\\Sony\\SpiderMan-4 No Home\\Casting.txt"));
		
	//    Files.createFile(Path.of("E:\\Files\\Marvel\\Disney\\Sony\\SpiderMan-4 No Home\\Casting.txt"));
		
	    Files.createFile(Path.of("E:\\record.csv"));
	}
}
