package com.AutomationPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Miniproject extends Base_class{
	public static void main(String[] args) throws InterruptedException, IOException {
		getbrowser();
		launchurl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement email = driver.findElement(By.id("email"));
		inputValue(email, "mugunthsuresh1@gmail.com");
		
		WebElement passwrd = driver.findElement(By.id("passwd"));
		inputValue(passwrd, "Suresh#78M");
		
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		clickonElement(login);
		
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		actionsmethod(women, "movetoelement");
		Thread.sleep(3000);
		WebElement evngdress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		clickonElement(evngdress);
		
		WebElement size = driver.findElement(By.id("layered_id_attribute_group_2"));
		clickonElement(size);
		
		WebElement compose = driver.findElement(By.id("layered_id_feature_3"));
		clickonElement(compose);
		
		WebElement style = driver.findElement(By.id("layered_id_feature_16"));
		clickonElement(style);
		
		WebElement properties = driver.findElement(By.id("layered_id_feature_19"));
		clickonElement(properties);
		
		WebElement avalable = driver.findElement(By.id("layered_quantity_1"));
		clickonElement(avalable);
		
		WebElement manufacture = driver.findElement(By.id("layered_manufacturer_1"));
		clickonElement(manufacture);
		
		WebElement condition = driver.findElement(By.id("layered_condition_new"));
		clickonElement(condition);
		
		//WebElement quick = driver.findElement(By.xpath("//a[@class='quick-view']"));
		//clickonElement(quick);
		//Thread.sleep(3000);
		WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		clickonElement(img);
		
     // WebElement frame = driver.findElement(By.xpath("//iframe[@src='http://automationpractice.com/index.php?id_product=4&controller=product&content_only=1']"));
     // framemthd(frame);
      
		
		WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		clickonElement(quantity);
		clickonElement(quantity);
		
		WebElement size1 = driver.findElement(By.id("group_1"));
		singledropdown(size1, "value", "2");
		
		
		WebElement color = driver.findElement(By.id("color_24"));
		clickonElement(color);
		
		WebElement add = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickonElement(add);
		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		clickonElement(proceed);
		//alertaccept(proceed, "accept");
		Thread.sleep(3000);
		WebElement proceed2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		clickonElement(proceed2);
		Thread.sleep(3000);
		WebElement proceed3 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		clickonElement(proceed3);
		
		WebElement agree = driver.findElement(By.id("cgv"));
		clickonElement(agree);
		
		
		WebElement proceed4 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		clickonElement(proceed4);
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickonElement(payment);
		
		WebElement cnfrm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickonElement(cnfrm);
		screenshot("C:\\Users\\vaish\\eclipse-workspace\\Selenium_concept\\screenshot\\picture5.png");
		
		
		
	}

}
