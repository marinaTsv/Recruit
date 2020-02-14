package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateJob_AddNewLocationPage {

	public WebDriver driver;

	public CreateJob_AddNewLocationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By locationName  = By.xpath("//input[@id='name']");
	private By address  = By.xpath("//input[@id='address']");
	private By country  = By.xpath("//input[@id='country']");
	private By state  = By.xpath("//input[@id='region']");
	private By city  = By.xpath("//input[@id='city']");
	private By zipCode  = By.xpath("//input[@id='zipCode']");
	private By cancel  = By.xpath("//button[@class='btn btn-md btn-outline-primary lft-btn']");
	private By save  = By.xpath("//button[@class='btn btn-md btn-primary rght-btn']");
	
	

	public WebElement getLocationName() {
		return driver.findElement(locationName);
	}
	public WebElement getAddress() {
		return driver.findElement(address);
	}
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	public WebElement getState() {
		return driver.findElement(state);
	}
	public WebElement getCity() {
		return driver.findElement(city);
	}
	public WebElement getZipCode() {
		return driver.findElement(zipCode);
	}
	public WebElement getCancel() {
		return driver.findElement(cancel);
	}
	public WebElement getSave() {
		return driver.findElement(save);
	}
	

}
