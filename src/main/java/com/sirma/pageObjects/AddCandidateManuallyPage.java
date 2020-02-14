package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCandidateManuallyPage {

	public WebDriver driver;

	public AddCandidateManuallyPage(WebDriver driver) {
		this.driver = driver;
	}

//n  = By.xpath("");
	private By name  = By.xpath("//div[@class='input-group ']/label[2]/input");   //input[id='candidateName']");
	private By email  = By.xpath("//*[@id='email']");
	private By jobsOfTalentPools  = By.xpath("//div[@id='assignJobs']/div/div/div[2]/div/input");
	private By source  = By.xpath("//div[@id='source']/div/div/div[2]/div/input");
	
//Upload file/photo
	private By uploadPhoto  = By.xpath("//*[text()='Upload photo']");
	private By uploadFile  = By.xpath("//div[class='p-button p-component p-button p-component upload-resume-btn  p-button-text-icon-left']/span[2]/span");
	
//Buttons
	private By save  = By.xpath("//div[@class='form-footer']/button");             //button[class='btn btn-primary btn-lg']/span");
	private By back  = By.xpath("//button[class='btn btn-outline-primary btn-lg back-btn-candidate']");
	
//Not Required
	private By phone  = By.xpath("//*[@id='phone']");
	private By socialLinks  = By.xpath("");
	private By links  = By.xpath("");
	private By note  = By.xpath("");
	private By coverLetter  = By.xpath("");
	
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getJobsOfTalentPools() {
		return driver.findElement(jobsOfTalentPools);
	}
	public WebElement getSource() {
		return driver.findElement(source);
	}
	public WebElement getWebelement() {
		return driver.findElement(uploadPhoto);
	}
	public WebElement getUploadFile() {
		return driver.findElement(uploadFile);
	}
	public WebElement getSave() {
		return driver.findElement(save);
	}
	public WebElement getBack() {
		return driver.findElement(back);
	}
	public WebElement getPhone() {
		return driver.findElement(phone);
	}
	public WebElement getSocialLinks() {
		return driver.findElement(socialLinks);
	}
	public WebElement getLinks() {
		return driver.findElement(links);
	}
	public WebElement getNote() {
		return driver.findElement(note);
	}
	public WebElement getCoverLetter() {
		return driver.findElement(coverLetter);
	}
	
}
