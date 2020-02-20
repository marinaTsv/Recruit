package com.sirma.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CandidatesPage {

	public WebDriver driver;

	public CandidatesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Candidates
	private By addCandidateButton  = By.xpath("//div[@class='css-bg1rzq-control']");
	private By nameInputFilter = By.xpath(("//div[@class='cnadidate-grid-align row']/div/div[1]/div/div[2]/table/thead/tr/th[1]/input"));
	
	//Candidates
	public WebElement getAddCandidateButton() {
		return driver.findElement(addCandidateButton);
	}
	public WebElement getNameInputFilter() {
		return driver.findElement(nameInputFilter);
	}
}
