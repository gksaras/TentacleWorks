package com.bankanalyzer.BankStatementAnalyzer_Gokulnath_K;

import java.io.IOException;


// Execution Class => Starts The Program

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	String csvFile = "E:\\bank.csv";
    	
    	
        System.out.println( "Bank Statement Analyzer....." );
        
        
        BankUser bank = new BankUser();
        bank.check_And_Print(csvFile);      
        
    }
}