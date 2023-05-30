package com.tentacle.SampleMavenProject;

import java.io.IOException;

import com.tentacle.SampleMavenProject.analyzer.BankTransactionAnalyzer;
import com.tentacle.SampleMavenProject.parser.BankStatementCSVParser;
import com.tentacle.SampleMavenProject.parser.BankStatementParser;

public class App 
{
    public static void main( String[] args ) throws IOException
    
    {
        System.out.println( "Hello World!" );
        
        BankTransactionAnalyzer transcatAnalyzer = new BankTransactionAnalyzer();
        
        BankStatementParser parser = new BankStatementCSVParser();
        
        transcatAnalyzer.analyze(parser);
        
    }
} 

