package com.duck;

import com.applyingAccessModifiers.*;

public class BadCygnet {

	 public void makeNoise() {
		    
         var duck = new MotherDuc();
         duck.quack();   
         System.out.print(duck.noise); 
     }
	 public static void main(String[] args) {
		var d = new BadCygnet();
		d.makeNoise();
	}
}
