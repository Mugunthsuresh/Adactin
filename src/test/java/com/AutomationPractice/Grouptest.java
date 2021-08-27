package com.AutomationPractice;

import org.testng.annotations.Test;

public class Grouptest {
	@Test
private void Apple() {
	System.out.println("apple");

}@Test
	private void samsung() {
		System.out.println("samsung");

	}
	@Test(groups="android")
	private void oneplus() {
		System.out.println("oneplus");

	}@Test (groups="android")
	private void redmi() {
	System.out.println("redmi");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
