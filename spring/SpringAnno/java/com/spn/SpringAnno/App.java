package com.spn.SpringAnno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext factory = new AnnotationConfigApplicationContext(Appconfig.class);
    	Samsung s=factory.getBean(Samsung.class);
    	s.config();
        
    }
}
