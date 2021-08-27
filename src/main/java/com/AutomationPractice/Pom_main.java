package com.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_main {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement passerd;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasserd() {
		return passerd;
	}

	public WebElement getLogin() {
		return login;
	}

	public Pom_main(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
}