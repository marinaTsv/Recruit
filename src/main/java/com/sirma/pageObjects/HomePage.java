                                                                                                                                                                             package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	//upper navbar
	private By menu_button  = By.xpath("");
	private By language_button  = By.xpath("");
	private By mylogo  = By.xpath("");
	private By logged_user_button  = By.xpath("");
	

	//left side navbar
	private By dashboard  = By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/ul/li[1]/a");
	private By tasks  = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/div/ul/li[2]/a");
	private By jobs  = By.xpath("//a[@data-flag='job']");
	private By candidates  = By.xpath("//a[@data-flag='candidates']");//("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/ul/li[4]/a");
	private By settingsButton  = By.xpath("//a[@data-flag='settings']");
	
	//Settings sub-menu
	private By companies  = By.xpath("//span[.='Companies']");
	private By departments  = By.xpath("");
	private By locations  = By.xpath("");
	private By disqualifyReasons  = By.xpath("");
	private By pipeline  = By.xpath("");
	private By sources  = By.xpath("");
	private By employmentTypes  = By.xpath("");
	private By teamMembers  = By.xpath("");
	private By globalSettings  = By.xpath("");

	
	public WebElement getCompanies() {
		return driver.findElement(companies);
	}
	public WebElement getSettingsButton() {
		return driver.findElement(settingsButton);
	}
	public WebElement getMenu_button() {
		return driver.findElement(menu_button);
	}
	public WebElement getLanguage_buttonn() {
		return driver.findElement(language_button);
	}
	public WebElement getMylogo() {
		return driver.findElement(mylogo);
	}
	public WebElement getLogged_user_button() {
		return driver.findElement(logged_user_button);
	}
	
	//left side navbar
	public WebElement getDashboardn() {
		return driver.findElement(dashboard);
	}
	public WebElement getTasks() {
		return driver.findElement(tasks);
	}
	public WebElement getJobs() {
		return driver.findElement(jobs);
	}
	public WebElement getCandidates() {
		return driver.findElement(candidates);
	}
}
