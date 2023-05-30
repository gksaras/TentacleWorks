package com.applyingAccessModifiers;

import com.duck.*;

public class LostDuckling {

	  public void swim() {
          var teacher = new DuckTeacher();
          teacher.swim(); 
          System.out.print("Thanks" + teacher.name); 
      }
	  public static void main(String[] args) {
		
		  var d = new LostDuckling();
		  d.swim();
	}
}
