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
	private By menu_button  = By.xpath("/html/body/div/div/div[2]/nav/div[1]/div[1]/a[1]");
	private By language_button  = By.xpath("/html/body/div/div/div[2]/nav/div[1]/div[2]/div/button");
	private By mylogo  = By.xpath("/html/body/div/div/div[2]/nav/a/div");
	private By logged_user_button  = By.xpath("/html/body/div/div/div[2]/nav/div[2]/div/div/button");

	//left side navbar
	private By dashboard  = By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/ul/li[1]/a");
	private By tasks  = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/div/ul/li[2]/a");
	private By jobs  = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/div/ul/li[3]/a");
	private By candidates  = By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/ul/li[4]/a");
	private By settings  = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/div/ul/li[5]/a");
	
	

	//upper navbar
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
	public WebElement getSettings() {
		return driver.findElement(settings);
	}
	

}
