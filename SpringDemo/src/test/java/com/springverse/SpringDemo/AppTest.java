package com.springverse.SpringDemo;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.springverse.SpringDemo.classes.Sparrow;
import com.springverse.SpringDemo.config.SpringConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AppTest 
{

	@Autowired
	private ApplicationContext context;
	
	@DisplayName("Testing that Sparrow instance having value Jack")
	
	@Test
	public void testJackInSpringContext() {
		Sparrow s = context.getBean(Sparrow.class);
		assertEquals("john",s.getName());
	}
}
