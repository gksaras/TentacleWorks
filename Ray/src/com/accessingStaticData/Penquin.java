package com.accessingStaticData;

public class Penquin {

	  String name;
      static String nameOfTallestPenguin;
  
      public static void main(String[] args) {
  
          var p1 = new Penquin();
          p1.name = "Lilly";
          p1.nameOfTallestPenguin = "Lilly";
  
          var p2 = new Penquin();
          p2.name = "Willy";
          p2.nameOfTallestPenguin = "Willy";
  
          System.out.println(p1.name); 				// Lilly
          System.out.println(p1.nameOfTallestPenguin); // Willy
          System.out.println(p2.name); 				// Willy
          System.out.println(p2.nameOfTallestPenguin); // Willy
  
  
      }
}
