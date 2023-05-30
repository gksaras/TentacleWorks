package com.assess;

import java.util.Arrays;
import java.util.List;

// Joining multiple strings with a delimiter
public class Exercise_9 {
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

