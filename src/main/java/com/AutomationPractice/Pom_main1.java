package com.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_main1 {
	 
public static WebDriver driver;
@FindBy(id ="location")
private WebElement location;

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoomno() {
	return roomno;
}

public WebElement getAdult() {
	return adult;
}

public WebElement getChild() {
	return child;
}

public WebElement getSearch() {
	return search;
}

@FindBy(id ="hotels")
private WebElement hotel;

@FindBy(id ="room_type")
private WebElement roomtype;

@FindBy(id ="room_nos")
private WebElement roomno;

@FindBy(id ="adult_room")
private WebElement adult;

@FindBy(id = "child_room")
private WebElement child;

@FindBy(id ="Submit")
private WebElement search;

@FindBy(id ="radiobutton_0")
private WebElement radio;

public WebElement getRadio() {
	return radio;
}

public WebElement getContinu() {
	return continu;
}

@FindBy(id ="continue")
private WebElement continu;


public Pom_main1(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
	
	
}
}


