package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ATemplate {

	public WebDriver driver;

	public ATemplate(WebDriver driver) {
		this.driver = driver;
	}
	
	private By webelement  = By.xpath("");
	
	

	public WebElement getwebelement() {
		return driver.findElement(webelement);
	}
	

}
