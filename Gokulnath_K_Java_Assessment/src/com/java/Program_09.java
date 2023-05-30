package com.java;

import java.util.Arrays;
import java.util.List;

// Joining multiple Strings using delimiter
public class Program_09 {

    public static void main(String[] args)
    {
        List<String> alphabets = Arrays.asList("Alpha", "Beta", "Cedric", "Dean");
        System.out.println(alphabets);
        
        String delimiter = "|";
 
        String result = "";
        String prefix = "";
       
        for (String s: alphabets)
        {
            result = result + prefix + s;
            prefix = delimiter;
        }
 
        System.out.println(result);
    }
}
