package com.AutomationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeSuite
	private void setproperty() {
		System.out.println("system set property");

	}

	@BeforeTest
	private void browserlaunch() {
		System.out.println("Chrome");

	}

	@BeforeClass
	private void url() {
		System.out.println("amazon.com");

	}

	@BeforeMethod
	private void login() {
		System.out.println("login");

	}

	@Test
	private void searchmobile() {
		System.out.println("searchmobile");

	}
@AfterMethod
	private void logout() {
		System.out.println("logout");

	}
@AfterClass
	private void closebrowser() {
		System.out.println("closebrowser");

	}
@AfterTest
	private void verification() {
		System.out.println("verification");

	}
@AfterSuite
	private void deletecookies() {
		System.out.println("deletecookies");

	}

}
