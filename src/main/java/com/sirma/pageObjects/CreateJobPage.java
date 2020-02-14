package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateJobPage {

	public WebDriver driver;

	public CreateJobPage(WebDriver driver) {
		this.driver = driver;
	}
	
//Required
    private By titleTextField  = By.xpath("//input[@id='title']");
	private By companyDropDown  = By.xpath("//div[@id='company']/div/div/div[2]/div/input");//input[@id='react-select-4-input']");////*[@id='title']");   //(
	private By departmentDropDown  = By.xpath("//div[@id='department']/div/div/div[2]/div/input");	
	private By locationDropdown  = By.xpath("//div[@class='location-wrapper']/div/div/div/div/div/div[2]/div/input");	
	private By jobDescriptioniFrame  = By.xpath("//iframe[@class='tox-edit-area__iframe']");
	private By jobDescriptionBody  = By.xpath("//body[@class='mce-content-body ']");
	private By jobRequirementsiFrame  = By.xpath("//div[@class='job-content-wrapper row']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/iframe");
	private By jobRequirementsBody  = By.xpath("//body[@class='mce-content-body ']");
	private By employmentType = By.xpath("//div[@id='employmentType']/div/div/div[2]/div/input");
	private By saveButton = By.xpath("//*[@id='saveJob']");
	
//NonRequired	
	private By jobPosting  = By.xpath("//li[@class='p-unselectable-text p-tabview-selected p-highlight']\")");
	private By titleLabel  = By.xpath("");
	private By companyLabel  = By.xpath("");
	private By departmentLabel  = By.xpath("");
	private By locationLabel  = By.xpath("/html/body/div[1]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/div/div/div/form[1]/div[2]/div[1]/label");
	private By jobDescriptionLabel  = By.xpath("");
	private By jobRequirementsLabel  = By.xpath("");	

	//AddNewEmploymentType
	private By addNewEmploymentTypeButton = By.xpath("//button[@id='newEmploymentType']");
	private By name = By.xpath("//input[@id='name']");
	private By save_EmploymentType = By.xpath("//button[@class='btn btn-md btn-primary rght-btn']");
	private By cancel_EmploymentType = By.xpath("//button[@class='btn btn-md btn-outline-primary lft-btn']");

	//AddNewLocation
	private By addNewLocationButton = By.xpath("//button[@class='btn btn-sm btn-outline-primary add-new-btn']");
	private By locationName  = By.xpath("//input[@id='name']");
	private By address  = By.xpath("//input[@id='address']");
	private By country  = By.xpath("//input[@id='country']");
	private By state  = By.xpath("//input[@id='region']");
	private By city  = By.xpath("//input[@id='city']");
	private By zipCode  = By.xpath("//input[@id='zipCode']");
	private By cancel  = By.xpath("//button[@class='btn btn-md btn-outline-primary lft-btn']");
	private By save  = By.xpath("//button[@class='btn btn-md btn-primary rght-btn']");

	
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getSave_EmploymentType() {
		return driver.findElement(save_EmploymentType);
	}
	public WebElement getCancel_EmploymentType() {
		return driver.findElement(cancel_EmploymentType);
	}
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
	
	public WebElement getSaveButton() {
		return driver.findElement(saveButton);
	}
	
	public WebElement getEmploymentType() {
		return driver.findElement(employmentType);
	}
	public WebElement getJobRequirementsiFrame() {
		return driver.findElement(jobRequirementsiFrame);
	}
	public WebElement getJobRequirementsBody() {
		return driver.findElement(jobRequirementsBody);
	}
	
	public WebElement getJobDescriptioniFrame() {
		return driver.findElement(jobDescriptioniFrame);
	}
	public WebElement getJobDescriptionBody() {
		return driver.findElement(jobDescriptionBody);
	}
	public WebElement getjobPosting() {
		return driver.findElement(jobPosting);
	}
	public WebElement gettitleLabel() {
		return driver.findElement(titleLabel);
	}
	public WebElement getcompanyLabel() {
		return driver.findElement(companyLabel);
	}
	public WebElement gettitleTextField() {
		return driver.findElement(titleTextField);
	}
	public WebElement getdepartmentLabel() {
		return driver.findElement(departmentLabel);
	}
	public WebElement getcompanyDropDown() {
		return driver.findElement(companyDropDown);
	}
	public WebElement getdepartmentDropDown() {
		return driver.findElement(departmentDropDown);
	}
	public WebElement getjobDescriptionLabel() {
		return driver.findElement(jobDescriptionLabel);
	}

	public WebElement getjobRequirementsLabel() {
		return driver.findElement(jobRequirementsLabel);
	}

	public WebElement getAddNewLocationButton() {
		return driver.findElement(addNewLocationButton);
	}
	public WebElement getAddNewEmploymentTypeButton() {
		return driver.findElement(addNewEmploymentTypeButton);
	}

	public WebElement getLocationDropdown() {
		return driver.findElement(locationDropdown);
	}
}
