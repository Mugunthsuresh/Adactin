package com.AutomationPractice;

import org.testng.annotations.Test;

public class Sampletest {
@Test
	private void demo() {
		System.out.println(10/10);

	}
	@Test(retryAnalyzer = Myretry.class)
	private void divide() {
		System.out.println(10/0);

	}
	
	
	
	
}
