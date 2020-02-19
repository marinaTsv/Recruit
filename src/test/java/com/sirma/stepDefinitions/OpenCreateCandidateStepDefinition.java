package com.sirma.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class OpenCreateCandidateStepDefinition extends Base {
	private static Logger log = LogManager.getLogger(OpenCreateCandidateStepDefinition.class.getName());

	@And("^Click on Candidates menu$")
	public void click_on_Candidates_menu() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getCandidates().click();
		log.atDebug().log("Click on Candidates Menu");
	}

	@When("^Click on Add Candidates button$")
	public void click_on_Add_Candidates_button() throws Throwable {
		CandidatesPage cd = new CandidatesPage(driver);
		WebElement element = cd.getAddCandidateButton();
		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
		if (element.isEnabled() && element.isDisplayed()) {
			System.out.println("Enabled&Displayed");
			element.click();
		}
		log.atDebug().log("Click onAdd  Candidates button");
	}
	
	

	@Then("^Add Candidate form opens$")
	public void add_Candidate_form_opens() throws Throwable {
		/*
		 * String actualURL = driver.getCurrentUrl();// actual url after perform of the
		 * above actions String expectedURL =
		 * prop.getProperty("ExpectedURLafterLogIn");// the url after successfull login
		 * System.out.println(actualURL + " \n" + expectedURL);
		 * Assert.assertEquals(expectedURL, actualURL);
		 */
	}

}
