package com.example.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.impl.Calculator;


public class CalTest {
	
	@Test
	public void divTest1() {
		
		Calculator c1 = new Calculator();
		int x = c1.div(2,2);
		Assertions.assertThrows(ArithmeticException.class,()->c1.div(2,0),"this is an error");
	}
	@Test
	public void divTest2() {
		
		Calculator c1 = new Calculator();
		int x = c1.div(2,2);
		Assertions.assertThrows(ArithmeticException.class,()->c1.div(2,1),"this is an error");
	}
	
	
		
	
	
	

}
