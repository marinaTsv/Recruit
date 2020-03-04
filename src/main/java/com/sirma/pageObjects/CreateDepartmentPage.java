package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateDepartmentPage {

	public WebDriver driver;

	public CreateDepartmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Department
	private By createDepartmentButton  = By.xpath("//div[@class='department-crt-btn']");
		
	//Create Department
	private By name  = By.xpath("//input[@id='name']");
	private By assitantDepHead  = By.xpath("//div[@id='assist']/div/div/div[2]/div/input");
	private By departmentHead  = By.xpath("//div[@id='head']/div/div/div[2]/div/input");
	private By company  = By.xpath("//div[@id='company']/div/div/div[2]/div/input");
	private By activeRadiobutton  = By.xpath("//*[@id='activeRadio']");
	private By inactiveRadiobutton  = By.xpath("//*[@id='inactiveRadio']");
	private By saveDepartment  = By.xpath("button//[@id='saveBtn']");
	private By backDepartment  = By.xpath("button//[@id='cancelBtn']");


	public WebElement getSaveDepartment() {
		return driver.findElement(saveDepartment);
	}
	public WebElement getBackDepartment() {
		return driver.findElement(backDepartment);
	}
	public WebElement getActiveRadiobutton() {
		return driver.findElement(activeRadiobutton);
	}
	public WebElement getInactiveRadiobutton() {
		return driver.findElement(inactiveRadiobutton);
	}
	public WebElement getCreateDepartmentButton() {
		return driver.findElement(createDepartmentButton);
	}
	public WebElement getDepartmentHead() {
		return driver.findElement(departmentHead);
	}
	public WebElement getCompany() {
		return driver.findElement(company);
	}
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getAssitantDepHead() {
		return driver.findElement(assitantDepHead);
	}
}
