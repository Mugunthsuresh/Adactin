package com.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_main3 {
public static WebDriver driver;

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAddrs() {
	return addrs;
}

public WebElement getCredit() {
	return credit;
}

public WebElement getCtype() {
	return ctype;
}

public WebElement getSmonth() {
	return smonth;
}

public WebElement getCyear() {
	return cyear;
}

public WebElement getCnum() {
	return cnum;
}

public WebElement getBook() {
	return book;
}

public WebElement getSearc() {
	return searc;
}

@FindBy(id ="first_name")
private WebElement fname;

@FindBy(id ="last_name")
private WebElement lname;

@FindBy(id ="address")
private WebElement addrs;

@FindBy(id ="cc_num")
private WebElement credit;

@FindBy(id ="cc_type")
private WebElement ctype;

@FindBy(id="cc_exp_month")
private WebElement smonth;

@FindBy(id ="cc_exp_year")
private WebElement cyear;

@FindBy(id="cc_cvv")
private WebElement cnum;

@FindBy(id ="book_now")
private WebElement book;

@FindBy(id="search_hotel")
private WebElement searc;

public WebElement getOut() {
	return out;
}

@FindBy(xpath ="//input[@value='Logout']")
private WebElement out;

public Pom_main3(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);

}}
