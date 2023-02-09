package com.spn.springdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spn.springdemo1.Vehicle;

@Component
public class Car implements Vehicle {
	@Autowired
	private Tyre tyre;
	
	 public void drive() {
		 
		 System.out.println("driving car : \n" + tyre);
	 }
	 
	 public void setTyre(Tyre tyre) {
		 this.tyre = tyre;
	 }
	 
	 public Tyre getTyre() {
		 return tyre;
	 }
	 
	 public String toString() {
		 return "tyre is working in car";
	 }

}
