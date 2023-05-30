package com.applyingAccessModifiers;

/*class MotherDuck{

   String noise = "quack";

   void quack() {
       System.out.println(noise);
   }	
}*/

public class GoodDuckling {

	 public void makeNoise() {
         
		 var duck = new MotherDuck();
         duck.quack();   // package access is ok
         System.out.println(duck.noise); // package access is ok
     }
	 
	 public static void main(String[] args) {
		var d = new GoodDuckling();
		d.makeNoise();
	}
}
