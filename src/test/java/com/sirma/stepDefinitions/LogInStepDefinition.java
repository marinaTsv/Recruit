package com.sirma.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class LogInStepDefinition extends Base {
	private static Logger log = LogManager.getLogger(LogInStepDefinition.class.getName());

	@Given("^Initialize browser$")
	public void initialize_browser() throws Throwable {
		driver = initializeDriver();
	}

	@When("^Navigate to URL home page$")
	public void navigate_to_url_home_page() throws Throwable {
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}

	@And("^Enter (.+) and (.+)$")
	public void enter_and(String username, String password) throws Throwable {
		LogInPage lp = new LogInPage(driver);
		lp.getEmailTextField().sendKeys(username);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
		log.atDebug().log("Log in");
	}

	@Then("^Dashboard (.+) opens$")
	public void dashboard_opens(String arg) throws Throwable {
		/*
		 * HomePage hp = new HomePage(driver); List<WebElement> dashboard =
		 * driver.findElements(By.xpath("//a[@data-flag='candidates']")); CandidatesPage
		 * cd = new CandidatesPage(driver);
		 * Assert.assertTrue(cd.getAddCandidateButton().isDisplayed()); else
		 * if(arg.equals("not")) { System.out.println("Arg2 is" + arg);
		 * Assert.assertFalse(cd.getAddCandidateButton().isDisplayed()); }
		 */
	}

	@Then("^Dashboard opens$")
	public void dashboard_opens() throws Throwable {
		List<WebElement> dashboard = driver.findElements(By.xpath("//a[@data-flag='candidates']"));
		Assert.assertFalse(dashboard.isEmpty());
	}

	@Then("^Dashboard does not open$")
	public void dashboard_does_not_open() throws Throwable {
		List<WebElement> dashboard = driver.findElements(By.xpath("//a[@data-flag='candidates']"));
		Assert.assertTrue(dashboard.isEmpty());
	}
}
