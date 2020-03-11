package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateLocationPage {

	public WebDriver driver;

	public CreateLocationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Location
	private By createLocationButton = By.xpath("//*[@id='createLocBtn']");
	private By locationNameFilter = By.xpath(("//thead[@class='p-datatable-thead']/tr/th/input"));
	
	
	//Create Location
	private By locationName  = By.xpath("//*[@id='name']");
	private By company  = By.xpath("//div[@id='company']/div/div/div[2]/div/input");
	private By timezone  = By.xpath("//div[@id='timezone']/div/div/div[2]/div/input");
	private By country  = By.xpath("//*[@id='country']");
	private By city  = By.xpath("//*[@id='city']");
	private By state  = By.xpath("//*[@id='state']");
	private By zipCode  = By.xpath("//*[@id='zipCode']");
	private By address  = By.xpath("//*[@id='address']");
	private By phoneNumber  = By.xpath("//*[@id='phoneNumber']");
	private By email  = By.xpath("//*[@id='email']");
	private By notes  = By.xpath("//*[@id='notes']");
	private By dropdownActive = By.xpath("//td[@class='']/select");
	private By saveLocation  = By.xpath("//*[@id='saveBtn']");
	private By backLocation  = By.xpath("//*[@id='cancelBtn']");
	private By activeRadiobutton  = By.xpath("//span[.='Active']");
	private By inactiveRadiobutton  = By.xpath("//span[.='Inactive']");
	
	
	public WebElement getActiveRadiobutton() {
		return driver.findElement(activeRadiobutton);
	}
	public WebElement getInactiveRadiobutton() {
		return driver.findElement(inactiveRadiobutton);
	}
	public WebElement getLocationNameFilter() {
		return driver.findElement(locationNameFilter);
	}
	public WebElement getCreateLocationButton() {
		return driver.findElement(createLocationButton);
	}
	public WebElement getSaveLocation() {
		return driver.findElement(saveLocation);
	}
	public WebElement getBackLocation() {
		return driver.findElement(backLocation);
	}

	public WebElement getNotes() {
		return driver.findElement(notes);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNumber);
	}
	public WebElement getAddress() {
		return driver.findElement(address);
	}
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	public WebElement getLocationName() {
		return driver.findElement(locationName);
	}
	public WebElement getCompany() {
		return driver.findElement(company);
	}
	public WebElement getTimezone() {
		return driver.findElement(timezone);
	}
	public WebElement getCity() {
		return driver.findElement(city);
	}
	public WebElement getState() {
		return driver.findElement(state);
	}
	public WebElement getZipCode() {
		return driver.findElement(zipCode);
	}

}
