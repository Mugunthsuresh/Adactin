package com.AutomationPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	@Test(dataProvider = "my data")
	private void loginDetails(String name,String pass,int Data) {
		System.out.println("Usename:"+name);
System.out.println("password:"+pass);
System.out.println("data:"+Data);
	}
	@DataProvider(name="my data")
	private Object[][] data() {
		return new Object[][] {
			{"raja","123",7},{"roja","46",4}
	};
	}	
@DataProvider(name="dev data")
private Object[][] inputdata() {
	return new Object[][] {
		{"mark","23"},{"antony","547"}
};
}
}