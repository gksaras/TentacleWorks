package com.applyingAccessModifiers;

import com.duck.*;

public class BirdWatcher {


    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); 
        System.out.print(bird.text); 
    }
}
