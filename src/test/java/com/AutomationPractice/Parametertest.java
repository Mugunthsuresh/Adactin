package com.AutomationPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	
	
	@Parameters({"Name"})
	@Test
	private void Username(@Optional("RAJA")String Name) {
		System.out.println("Username:"+Name);

	}
	
	
	
	
	

}
