package com.AutomationPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_test {
	@Parameters({ "name" })
	@Test
	private void loginid(@Optional("mug") String name) {
		System.out.println("loginid:" + name);

	}

	@Parameters({ "name1" })
	@Test
	private void username(@Optional("Mugunth") String name1) {
		System.out.println("username:" + name1);

	}

	@Parameters({ "psswrd" })
	@Test
	private void password(@Optional("virat") String psswrd) {
		System.out.println("password:" + psswrd);

	}

	@Parameters({ "hhh" })
	@Test
	private void mailid(@Optional("hbk@gmail.com") String hhh) {
		System.out.println("email:" + hhh);

	}

}
