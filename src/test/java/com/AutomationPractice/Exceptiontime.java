package com.AutomationPractice;

import org.testng.annotations.Test;

public class Exceptiontime {
@Test (expectedExceptions = ArithmeticException.class)
	private void login() throws InterruptedException {
		System.out.println(10/0);
 
	}
}
