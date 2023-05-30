package com.inputoutput;

import java.io.File;
import java.nio.file.Path;

public class SwitchingBetweenFileAndPath {

	public static void main(String[] args) {
		
		File file = new File("rabbit");
        Path nowPath = file.toPath();
        System.out.println(nowPath.toString());
        File backToFile = nowPath.toFile();
	}
}
