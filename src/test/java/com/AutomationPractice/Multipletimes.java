package com.AutomationPractice;

import org.testng.annotations.Test;

public class Multipletimes {
	// login with user name and password
	//invocation count
	
	
	@Test(invocationCount = 10)
	private void login() {
		System.out.println("name : test");
		System.out.println("pass:pass");
	}

}
