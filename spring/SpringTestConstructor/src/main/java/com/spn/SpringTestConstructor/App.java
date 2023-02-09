package com.spn.SpringTestConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        mango m=(mango)context.getBean("m");
        m.eat();
        sugarless c=(sugarless)context.getBean("s");
        System.out.println(c);
        
    }
}
