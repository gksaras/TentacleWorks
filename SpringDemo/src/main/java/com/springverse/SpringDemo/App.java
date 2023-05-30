package com.springverse.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springverse.SpringDemo.classes.Marvel;
import com.springverse.SpringDemo.classes.Sparrow;
import com.springverse.SpringDemo.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Sparrow sparrow = context.getBean(Sparrow.class);
        System.out.println(sparrow.getName());
        
        String str = context.getBean(String.class);
        System.out.println(str);
        
        Integer bean = context.getBean(Integer.class);
        System.out.println(bean);
        
        Marvel marvel = context.getBean(Marvel.class);
        System.out.println(marvel);
    }
    
}
