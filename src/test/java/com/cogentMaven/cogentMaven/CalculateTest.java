package com.cogentMaven.cogentMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CalculateTest")

class CalculateTest {
	Calculate c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("execute once b4 all the methods");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("execute once after all the methods are done");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("execute b4 for each test methods are executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("execute after for each test methods are executed");	
	}

	@Test
	void test1() {
		Calculate c=new Calculate ();   //// create a new class in main java // change test to main when you implement the test
		assertEquals(10, c.add(5,5), "Testing my add method");
		System.out.println("The sum of i and j is "+c.add(5, 5));
		
	}
    @Test
	void test2() {
	    c=new Calculate ();   //// create a new class in main java // change test to main when you implement the test
		assertEquals(25, c.multiply(5,5), "Testing my multiply method");
		System.out.println("The sum of i and j is "+c.multiply(5, 5));
		
	}
    
    void test3() {
	       //// create a new class in main java // change test to main when you implement the test
		assertThrows(ArithmeticException.class,()->c.divide(5,0) , "Testing my divide method");
		System.out.println("The division of i and j is "+c.divide(5, 0));
		
	}

	@Test
	void testAll() {
		 assertAll(
				 ()-> assertEquals(25,c.multiply(5,5)),
		          ()-> assertEquals(10,c.add(5,5)),
		          ()-> assertThrows(ArithmeticException.class,()->c.divide(5,0)) 
	     ) ;
}
}


