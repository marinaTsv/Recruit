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
import com.sirma.pageObjects.JobsPage;
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
public class OpenCreateJobsStepDefinition extends Base {
	private static Logger log = LogManager.getLogger(OpenCreateJobsStepDefinition.class.getName());

	@And("^Click on Jobs menu$")
	public void click_on_jobs_menu() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getJobs().click();
	}

	@When("^Click on Create Job button$")
	public void click_on_create_job_button() throws Throwable {

		JobsPage jp = new JobsPage(driver);
		WebElement element = jp.getCreateJobButton();

		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
		
		 if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Enabled&Displayed");
 				element.click();	
 				log.atDebug().log("Click on Create Job button");
		
/*		if (element.isEnabled() && element.isDisplayed()) {
			System.out.println("Enabled&Displayed");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		}*/
	}
	}

	@Then("^Create Jobs form opens$")
	public void create_jobs_form_opens() throws Throwable {

	}

}
