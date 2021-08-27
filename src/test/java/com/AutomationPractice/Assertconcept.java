package com.AutomationPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertconcept {
@Test
	private void username() {
		String expected ="john 123";
		String actual ="jack 456";

		Assert.assertEquals(expected, actual);
	}
	@Test
private void userpass() {
	String expected="john 123";
	String actual="john 123";
Assert.assertEquals(expected, actual);
}
	
	
	
	
	
	
	
	
	
	
	
}
