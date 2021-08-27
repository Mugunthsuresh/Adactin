package com.AutomationPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasserttest {
@Test
	private void username() {
		SoftAssert s=new SoftAssert();
		String exp="ABC123";
		String act="ABC123";
		s.assertEquals(act, exp);
System.out.println("verification completed");
s.assertAll();
	}
	
	
	
	
	
	
	
}
