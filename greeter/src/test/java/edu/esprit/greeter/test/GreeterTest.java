package edu.esprit.greeter.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import edu.esprit.greeter.Greeter;

public class GreeterTest {

	Greeter greeter;
	
	@Before
	public void setUp(){
		greeter = new Greeter();
	}
	
	@Test 
	public void itShouldSayHelloWorld(){
				
		String result = greeter.sayHello("world");
		Assert.assertEquals("Hello world", result);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void itShouldRaiseException(){
		
		String param = "MAN";
		greeter.sayHello(param);
		
		
	}
	@After
	public void tearDown(){
		
		greeter = null;
		
	}
	

}
