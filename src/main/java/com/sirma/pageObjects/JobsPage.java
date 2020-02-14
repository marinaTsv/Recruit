package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {

	public WebDriver driver;

	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private By createJobButton  = By.xpath("//*[@id=\"newJobBtn\"]");
	
	
	
	public WebElement getCreateJobButton() {
		return driver.findElement(createJobButton);
	}

}
