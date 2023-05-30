package com.methodoverloading;

public class Ostrich {



        public void fly(int i) {
        	System.out.println(i);
            System.out.println("int");
        }
    
        public void fly(long l) {
        	System.out.println(l);
            System.out.println("long");
        }
    
    
        public static void main(String[] args) {
            
        	var p = new Ostrich();
            
        	p.fly(123);
            
        	System.out.println("-");
            
        	p.fly(123L);
        }
    }

