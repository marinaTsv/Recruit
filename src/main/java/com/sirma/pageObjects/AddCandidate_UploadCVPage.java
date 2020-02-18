package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCandidate_UploadCVPage {

	public WebDriver driver;

	public AddCandidate_UploadCVPage(WebDriver driver) {
		this.driver = driver;
	}

//n  = By.xpath("");
	private By name  = By.xpath("//*[@id='candidateName']");   
	private By email  = By.xpath("//*[@id='email']");
	private By jobsOfTalentPools  = By.xpath("//div[@id='assignJobs']/div/div/div[2]/div/input");
	private By uploadFile  = By.xpath("//*[@id='cvUpload']");
	private By submit  = By.xpath("//div[@class='p-sidebar p-component p-sidebar-right p-sidebar-active']/div/form/div[6]/button[2]");
	private By cancel  = By.xpath("//div[@class='p-sidebar p-component p-sidebar-right p-sidebar-active']/div/form/div[6]/button");

	
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getJobsOfTalentPools() {
		return driver.findElement(jobsOfTalentPools);
	}
	public WebElement getUploadFile() {
		return driver.findElement(uploadFile);
	}
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	public WebElement getCancel() {
		return driver.findElement(cancel);
	}

	
}
