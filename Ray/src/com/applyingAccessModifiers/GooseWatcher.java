package com.applyingAccessModifiers;

public class GooseWatcher {

	 public void watch() {
         Goose goose = new Goose();
         goose.floatInWater(); 
        // This code doesn’t compile because we are not in the goose object.
     }
}
