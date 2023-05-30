package com.springverse.SpringDemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springverse.SpringDemo.classes.Marvel;
import com.springverse.SpringDemo.classes.Sparrow;

import java.time.Month;

@Configuration
public class SpringConfig {

	@Bean
	Sparrow parley() {
		
		Sparrow s = new Sparrow();
		s.setName("Jack");
		return s;
	}
	
	@Bean
	String caribbean_Ship() {
		return "Black Pearl";
	}
	
	@Bean
	Integer universe_Number() {
		return 616;
	}
	
	@Bean
	Marvel display() {
		Marvel m =  new Marvel(5, "Loki", Month.OCTOBER);
		m.toString();
		return m;
	}
}
