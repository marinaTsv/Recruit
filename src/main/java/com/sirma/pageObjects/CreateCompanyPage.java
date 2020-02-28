package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateCompanyPage {

	public WebDriver driver;

	public CreateCompanyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Company
	private By createCompanyButton  = By.xpath("//div[@class='company-crt-btn']");
	
	//Edit Company
	
	
	//Create Company
	private By name  = By.xpath("//*[@id='name']");
	private By email  = By.xpath("//*[@id='email']");
	private By website  = By.xpath("//*[@id='website']");
	private By contactPerson  = By.xpath("");

	private By activeRadiobutton  = By.xpath("//input[@id='activeRadio']");
	private By inactiveRadiobutton  = By.xpath("//*[@id='inactiveRadio']");
	private By logoUpload  = By.xpath("//input[@type='file']");
	private By saveButton  = By.xpath("//*[@id='saveBtn']");
	private By backButton  = By.xpath("//*[@id='cancelBtn']");
	
	

	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getContactPerson() {
		return driver.findElement(contactPerson);
	}
	public WebElement getWebsite() {
		return driver.findElement(website);
	}
	public WebElement getActiveRadiobutton() {
		return driver.findElement(activeRadiobutton);
	}
	public WebElement getInactiveRadiobutton() {
		return driver.findElement(inactiveRadiobutton);
	}
	public WebElement getLogoUpload() {
		return driver.findElement(logoUpload);
	}
	public WebElement getSaveButton() {
		return driver.findElement(saveButton);
	}
	public WebElement getBackButton() {
		return driver.findElement(backButton);
	}
	
	

}
