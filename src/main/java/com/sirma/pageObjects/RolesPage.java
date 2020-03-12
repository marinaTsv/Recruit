package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RolesPage {
	
	public WebDriver driver;

	public RolesPage(WebDriver driver) {
		this.driver = driver;
	}

	private By createdRole = By.xpath("//li[@title='"+ +"']");
	private By newRoleButton = By.xpath("//*[@id='app-container']/main/div/div[2]/div[1]/div[2]/div[1]/button");
	//Job
	private By jobCheckbox  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[1]/div/header/div/div[2]");
	private By viewJobsRelatedToTheUser  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[1]/div/ul/li[1]/div/div[2]");
	private By accessAllExistingJobsData  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[1]/div/ul/li[2]/div/div[2]");
	private By createNewJob  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[1]/div/ul/li[3]/div/div[2]");
	private By removeDraftJob  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[1]/div/ul/li[4]/div/div[2]");
	
	//Candidates
	private By candidates  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[2]/div/header/div/div[2]");
	private By viewCandidatesOnlyUser  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[2]/div/ul/li[1]/div/div[2]");
	private By manageCandidates  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[2]/div/ul/li[2]/div/div[2]");
	private By removeCandidates  = By.xpath("//*[@id='userRolePermissions']/div[1]/div[2]/div/ul/li[3]/div/div[2]");

	//Settings
	private By settings  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[1]/div/header/div/div[2]");
	private By manageTeam  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[1]/div/ul/li[1]/div/div[2]");
	private By manageRoles  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[1]/div/ul/li[2]/div/div[2]");
	private By manageCompany  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[1]/div/ul/li[3]/div/div[2]");
	private By manageWorkflow  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[1]/div/ul/li[4]/div/div[2]");
	private By manageGlobalSettings  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[1]/div/ul/li[5]/div/div[2]");
	
	//Sensitive
	private By sensitiveData  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[2]/div/header/div/div[2]");
	private By accessSensitiveData  = By.xpath("//*[@id='userRolePermissions']/div[2]/div[2]/div/ul/li/div/div[2]");
	
	 
	public WebElement getNewRoleButton() {
		return driver.findElement(newRoleButton);
	}
	public WebElement getManageTeam() {
		return driver.findElement(manageTeam);
	}
	public WebElement getAccessSensitiveData() {
		return driver.findElement(accessSensitiveData);
	}
	public WebElement getSensitiveData() {
		return driver.findElement(sensitiveData);
	}
	public WebElement getManageGlobalSettings() {
		return driver.findElement(manageGlobalSettings);
	}
	public WebElement getManageWorkflow() {
		return driver.findElement(manageWorkflow);
	}
	public WebElement getManageCompany() {
		return driver.findElement(manageCompany);
	}
	public WebElement getManageRoles() {
		return driver.findElement(manageRoles);
	}
	public WebElement getSettings() {
		return driver.findElement(settings);
	}
	public WebElement getRemoveCandidates() {
		return driver.findElement(removeCandidates);
	}
	public WebElement getManageCandidates() {
		return driver.findElement(manageCandidates);
	}
	public WebElement getViewCandidatesOnlyUser() {
		return driver.findElement(viewCandidatesOnlyUser);
	}
	public WebElement getCandidates() {
		return driver.findElement(candidates);
	}
	public WebElement getRemoveDraftJob() {
		return driver.findElement(removeDraftJob);
	}
	public WebElement getCreateNewJob() {
		return driver.findElement(createNewJob);
	}
	public WebElement getAccessAllExistingJobsData() {
		return driver.findElement(accessAllExistingJobsData);
	}
	public WebElement getViewJobsRelatedToTheUser() {
		return driver.findElement(viewJobsRelatedToTheUser);
	}
	public WebElement getJobCheckbox() {
		return driver.findElement(jobCheckbox);
	}


}
