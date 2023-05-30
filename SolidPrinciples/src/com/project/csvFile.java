package com.project;

	import java.util.*;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class csvFile {
		static String filePath =("E:\\Statement.csv");
			     static String username="anasooya";
			     static String password="Anu@123";
			     static Scanner sc =new Scanner(System.in);
			     static String name="";
			     static String pwd="";
			    public static void main(String[] args) {
			       
			        do{
			        	System.out.print("Enter Username : ");
			        	name=sc.nextLine();
			        	if (username.equals(name)) {
			        		loginvalidate();
				        }
				        else 
				        {
			        		System.out.println("Invalid username entered!!");
				        }
			        }while (!username.equals(name));

			    }
			    public static void loginvalidate() {
			    	System.out.print("Enter Password : ");
			        pwd=sc.nextLine();
		        	if(!password.equals(pwd)) 
		        	{
		        		System.out.println("Invalid Password entered!!");
		        		loginvalidate();
		        	}
		        	else
		        	{
		        		System.out.println("\n<<<<<<<Verified successfully>>>>>>>\n");
		        		
		    	        try (FileWriter file = new FileWriter(filePath)) {
		    	        	
		    	        	ArrayList <String> Data=new ArrayList<String>();
		    	        	Data.add("Date 		,  Description,   Debited,  Credited, Outstanding Balance");
		    	        	Data.add("12-05-2023,  KFC,          -888.00,    0.00,     5674.00");
		    	        	Data.add("07-05-2023,  Rent,        -5500.00,    0.00,     6562.00");
		    	        	Data.add("05-05-2023,  Smytten,      -199.00,    0.00,    12062.00");
		    	        	Data.add("03-05-2023,  Salary,          0.00,10000.00,    12621.00"); 
		    	        	Data.add("29-04-2023,  Pharmacy,     -660.00,    0.00,     2621.00"); 
		    	        	Data.add("27-04-2023,  Trends,      -5010.00,    0.00,     3281.00"); 
		    	        	Data.add("24-04-2023,  De-mart,     -3998.00,    0.00,    18291.00"); 
		    	        	Data.add("18-04-2023,  From Shaiju,     0.00, 5000.00,    12289.00"); 
		    	        	Data.add("15-04-2023,  Movie,        -500.00,    0.00,    11789.00"); 
		    	        	Data.add("07-04-2023,  Rent,        -5500.00,    0.00,    12289.00"); 
		    	        	Data.add("03-04-2023,  Salary,          0.00,10000.00,    17789.00"); 
		    	        	Data.add("01-04-2023,  Health&Glow, -2400.00,    0.00,     7789.00");
		    	        	
		    	        	System.out.println("Click 1 to view overall statement or 0 to get monthwise statement ");
		    	        	String typeofstatement=sc.nextLine();
		    	        	if (typeofstatement.equals("1")) {
		    	        		for(int i=0;i<Data.size();i++)
			    	        	{
				    	        		file.write(Data.get(i)+ "\n");
			    	        	}
		    	        	}
		    	        	else if(typeofstatement.equals("0")) {
		    	        		System.out.println("Please select the month of statement in number: ");
			    	        	String Month=sc.nextLine();

			    	        	for(int i=0;i<Data.size();i++)
			    	        	{
			    	        		if (Data.get(i).contains("-"+Month + "-")|| Data.get(i).contains("Description"))
				    	        	{
				    	        		file.write(Data.get(i)+ "\n");
				    	        	}
			    	        	}
		    	        	}
		    	        	      
		    	          
		    	        } catch (IOException e) {
		    	            System.out.println("Error occurred while creating the CSV file.");
		    	            e.printStackTrace();
		    	        }


		    	        try (FileReader fileReader = new FileReader(filePath);
		                        BufferedReader reader = new BufferedReader(fileReader)) {

		                    String line;
		                    float totalDebited = 0.0f;
		                    float totalCredited = 0.0f;

		                    while ((line = reader.readLine()) != null) {
		                        System.out.println(line);
		                        if (!line.contains("Description")) {
		                        	String[] parts = line.split(",");
			                        if (parts.length == 5) {
			                            float debited = Float.parseFloat(parts[2].trim());
			                            float credited = Float.parseFloat(parts[3].trim());

			                            totalDebited += debited;
			                            totalCredited += credited;
			                        }
		                        }
		                        
		                    }
		                    System.out.println("Press Enter to check the Summary of the statement ");
		                    String checkSummary=sc.nextLine();
		                    System.out.println("Overall amount spended: " + totalDebited);
		                    System.out.println("Total Credited: " + totalCredited);


		       	        } catch (IOException e) {
		       	            System.out.println("Error occurred while reading the CSV file.");
		       	            e.printStackTrace();
		       	        }
		    	     
		        	}
			    }
			}

