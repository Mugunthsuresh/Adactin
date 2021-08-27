package com.AutomationPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mainproject extends Base_class {
	public static void main(String[] args) throws InterruptedException, IOException {
		getbrowser();
		launchurl("https://adactinhotelapp.com/");
		Pom_main mn = new Pom_main(driver);

		inputValue(mn.getUsername(), "Mugunth2021");
		inputValue(mn.getPasserd(), "vaishnavi");
		clickonElement(mn.getLogin());
		Pom_main1 mn1 = new Pom_main1(driver);

		singledropdown(mn1.getLocation(), "value", "Melbourne");

		singledropdown(mn1.getHotel(), "value", "Hotel Sunshine");

		singledropdown(mn1.getRoomtype(), "value", "Deluxe");

		singledropdown(mn1.getRoomno(), "value", "2");

		singledropdown(mn1.getAdult(), "value", "2");

		singledropdown(mn1.getChild(), "value", "1");

		clickonElement(mn1.getSearch());

		clickonElement(mn1.getRadio());
		clickonElement(mn1.getContinu());

		Pom_main3 mn3 = new Pom_main3(driver);
		inputValue(mn3.getFname(), "Mugunth");

		inputValue(mn3.getLname(), "suresh");

		inputValue(mn3.getAddrs(), "No-7,mexi st,2nd colony,Australia");

		inputValue(mn3.getCredit(), "2343565478986542");

		singledropdown(mn3.getCtype(), "value", "MAST");

		singledropdown(mn3.getSmonth(), "value", "2");

		singledropdown(mn3.getCyear(), "value", "2022");

		inputValue(mn3.getCnum(), "3456");

		clickonElement(mn3.getBook());

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(mn3.getOut());

	}

}
