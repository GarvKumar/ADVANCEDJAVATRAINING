package com.spn.springdemo1;

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
       Tyre obj=(Tyre)context.getBean("tyre");
       System.out.println(obj);
       Car c=(Car)context.getBean("car");
       System.out.println(c);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    	//Car car=new Car();
    	//car.drive();
    	//Bike obj=new Bike(); //dependency on right and left, use di
    	// create interface
    //  Vehicle obj=new Bike();//now change right part only
       //y right part , so use spring di
       //obj.drive();
       //getBean can be get through BeanFactory or ApplicationContext
       //small app use beanfactoruy and web app app context
     
      	//Vehicle obj=(Vehicle)context.getBean("vehicle");
      //Vehicle obj1=(Vehicle)context.getBean("car");
       
       //d capitalized, Car object c small
      // obj1.drive();
      //  obj.drive();
    	 
       //for tyre
     //  Tyre t=(Tyre)context.getBean("tyre");
     //  System.out.println( t);
    }
}