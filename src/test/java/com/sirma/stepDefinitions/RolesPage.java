package com.sirma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RolesPage {
	private By backDepartment  = By.xpath("");


	
	public WebElement getdropdownActive() {
		return driver.findElement(dropdownActive);
	}
	
	 try{ IWebElement TargetElement = driver.FindElement(By.XPath(xPathVal)); 
	 if (!TargetElement.Selected) { TargetElement.SendKeys(Keys.Space); } } 
	 catch (Exception e) { } 

}
