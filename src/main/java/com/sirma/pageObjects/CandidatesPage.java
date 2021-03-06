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
	private By nameInputFilter = By.xpath(("//thead[@class='p-datatable-thead']/tr/th/input"));
	
	//Candidates
	public WebElement getAddCandidateButton() {
		return driver.findElement(addCandidateButton);
	}
	public WebElement getNameInputFilter() {
		return driver.findElement(nameInputFilter);
	}
}
