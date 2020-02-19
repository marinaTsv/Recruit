package com.sirma.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.AddCandidateManuallyPage;
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
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class CreateCandidateStepDefinition extends Base {
	private static Logger log = LogManager.getLogger(CreateCandidateStepDefinition.class.getName());
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	AddCandidateManuallyPage acp = new AddCandidateManuallyPage(driver);
	Fairy fairy = Fairy.create();
	Person person = fairy.person();
	
    @And("^Click on Add Candidates button, Add Manually$")
    public void click_on_add_candidates_button_add_manually() throws Throwable {
        CandidatesPage cd = new CandidatesPage(driver);
    	Assert.assertTrue(cd.getAddCandidateButton().isDisplayed());
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
    	WebElement element = cd.getAddCandidateButton();
    	element.click();
    	WebElement options = driver.findElement(By.xpath("//*[text()='Add manually']"));
    	options.click();
    }

    @And("^Fill in Name$")
    public void fill_in_name() throws Throwable {
    	acp.getName().sendKeys(person.fullName());

    }

    @And("^Fill in email$")
    public void fill_in_email() throws Throwable {
    	acp.getEmail().sendKeys(person.email());
    }

    @And("^Fill in Jobs or Talent Pools$")
    public void fill_in_jobs_or_talent_pools() throws Throwable {
    	WebElement jobsOfTalentPools = acp.getJobsOfTalentPools();
    	jobsOfTalentPools.sendKeys("J");
    	Thread.sleep(2000);
    	jobsOfTalentPools.sendKeys(Keys.ENTER);
    }

    @And("^Fill in Source$")
    public void fill_in_source() throws Throwable {
    	WebElement source = acp.getSource();
    	source.sendKeys("J");
    	Thread.sleep(2000);
    	source.sendKeys(Keys.ENTER);;
    }
    
    @And("^Click button Save$")
    public void click_button_save() throws Throwable {
    	acp.getSave().click();
    }
    
    @And("^Upload photo$")
    public void upload_photo() throws Throwable {
   	 Thread.sleep(3000);
   	 acp.getUploadPhoto().sendKeys("C:\\Users\\marina.tsvetkova\\Pictures\\photo.jpg");   
    }
    
    @And("^Upload CV_ Resume$")
    public void upload_cvresume() throws Throwable {
   	 Thread.sleep(3000);
   	 acp.getUploadFile().sendKeys("C:\\Users\\marina.tsvetkova\\Pictures\\CVasdkik c.docx"); 
    }
}
