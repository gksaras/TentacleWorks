package com.applyingAccessModifiers;

import com.duck.*;

public class Swan {

    public void swim() {
        floatInWater();
        System.out.print(text); 
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); 
        System.out.print(other.text);  
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater(); 
        System.out.print(other.text); 
    }
}
