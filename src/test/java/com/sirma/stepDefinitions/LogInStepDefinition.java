package com.sirma.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class LogInStepDefinition extends Base {

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
		
    }
		
/*//	Validate successful login
	    @Then("^URL changes to expected URL$")
		public void url_changes_to_expected_URL() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/ul/li[1]/a/i")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		String actualURL = driver.getCurrentUrl();// actual url after perform of the above actions
		String expectedURL = prop.getProperty("ExpectedURLafterLogIn");// the url after successfull login
		System.out.println(actualURL + " \n" + expectedURL);
		Assert.assertEquals(expectedURL, actualURL);
		}*/
	    
    @Then("^URL changes to expected URL$")
    public void url_changes_to_expected_URL() throws Throwable {
    	//TO DO
    }
    }
	

