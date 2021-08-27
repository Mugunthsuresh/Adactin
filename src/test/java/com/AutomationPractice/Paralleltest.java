package com.AutomationPractice;

import org.testng.annotations.Test;

public class Paralleltest extends Base_class{
	@Test
private void twitter() {
	getbrowser();
	launchurl("https://twitter.com/?lang=en");

}@Test
	private void fb() {
		getbrowser();
		launchurl("https://m.facebook.com/");

	}
	
	
	
	
	
}
