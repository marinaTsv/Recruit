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
	private By uploadPhoto  = By.xpath("//*[@id='imgUpload']");
	private By uploadFile  = By.xpath("//*[@id='cvUpload']");
	private By removeResume = By.xpath("//div[@class='upload-cv-section']/div[1]/div/div/button[2]");
//Buttons
	private By save  = By.xpath("//div[@class='form-footer']/button");             //button[class='btn btn-primary btn-lg']/span");
	private By back  = By.xpath("//button[@class='btn btn-outline-primary btn-lg back-btn-candidate']");
	
//Not Required
	private By phone  = By.xpath("//*[@id='phone']");
	private By socialLinks  = By.xpath("//*[@id='socialLinks']");
	private By addSocialLinksButton  = By.xpath("//div[@class='plus-btn-container']/button");
	private By addLinksButton  = By.xpath("//form[@class='form-align']/div[3]/div[2]/button");
	private By links  = By.xpath("//*[@id='links']");
	private By note  = By.xpath("//*[@id='note']");
	private By coverLetter  = By.xpath("//*[@id='coverLetter']");

	//
	public WebElement getAddSocialLinksButton() {
		return driver.findElement(addSocialLinksButton);
	}
	public WebElement getAddLinksButton() {
		return driver.findElement(addLinksButton);
	}
	
	public WebElement getRemoveResume() {
		return driver.findElement(removeResume);
	}
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
	public WebElement getUploadPhoto() {
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
