package com.applyingAccessModifiers;

import com.duck.*;

// protected access
public class Gosling extends Bird {

	public void swim() {
		floatInWater();
		System.out.println(text);
	}

	public static void main(String[] args) {
		new Gosling().swim();
	}
}
