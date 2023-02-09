package com.spn.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("Lets drive Bike");
	}

}
