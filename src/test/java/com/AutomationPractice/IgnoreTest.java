package com.AutomationPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Ignore
	@Test
private void Apple() {
	System.out.println("apple");

}
	@Test
	private void oneplus() {
		System.out.println("oneplus");

	}
	@Test
	private void samsung() {
		System.out.println("samsung");

	}
	@Test
	private void redmi() {
		System.out.println("redmi");

	}
	
	
	
}
