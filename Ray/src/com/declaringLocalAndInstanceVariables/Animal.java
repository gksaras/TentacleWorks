package com.declaringLocalAndInstanceVariables;

public class Animal {
	
	public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
        else rest = 20;
        System.out.print(rest);

        final var giraffe = new Animal();
        final int[] friends = new int[5];

      //  rest = 10; 
      //  giraffe = new Animal(); 
      //  friends = null; 
    }

    public void zooAnimalCheckup2(boolean isWeekend) {
        
    	final int rest; // final must be initialised inside block
        
        if(isWeekend == false) 
        {	
        	rest = 5;
        	System.out.print(rest); 
        }
        //System.out.println(rest);
        
    }
    

    public void zooAnimalCheckup() {
        
    	final int rest = 5;
        final Animal giraffe = new Animal();
        final int[] friends = new int[5];
        
        giraffe.setName("George");
        friends[2] = 2;
    }
    
    public String zooFriends() {
       
    	String name = "Harry the Hippo";
        
    	var size = 10;
        
    	boolean wet;
        
        if (size > 100) 
        	size++;
        
        name.substring(0);
        
        wet = true;
        
        return name;
    }
    
    public static void main(String[] args) {
		
    	var a = new Animal();
    	a.zooAnimalCheckup(false); // Answer : 20
    	
    	a.zooAnimalCheckup2(false);
    	
    	//a.zooAnimalCheckup();
    	
    	String name = a.zooFriends();
    	System.out.println(name);
	}
}
