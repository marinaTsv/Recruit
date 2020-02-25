package com.sirma.stepDefinitions;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

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
	String nameCandidate = null;

	@And("^Click on Add Candidates button, Add Manually$")
	public void click_on_add_candidates_button_add_manually() throws Throwable {
		CandidatesPage cd = new CandidatesPage(driver);
		Assert.assertTrue(cd.getAddCandidateButton().isDisplayed());
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
		WebElement element = cd.getAddCandidateButton();
		element.click();
		WebElement options = driver.findElement(By.xpath("//*[text()='Add manually']"));
		options.click();
	}

	@And("^Fill in Name$")
	public void fill_in_name() throws Throwable {
		nameCandidate = person.fullName();
		acp.getName().sendKeys(nameCandidate);

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
		source.sendKeys(Keys.ENTER);
		;
	}

	@And("^Click button Save$")
	public void click_button_save() throws Throwable {
		acp.getSave().click();
	}

	@And("^Upload photo$")
	public void upload_photo() throws Throwable {
		Thread.sleep(3000);
		propertiesFileRead();
		acp.getUploadPhoto().sendKeys(prop.getProperty("createCandidatePhotoUpload"));
	}



	@And("^Click button Cancel$")
	public void click_button_cancel() throws Throwable {
		WebElement buttonBack = acp.getBack();
		wait.until(ExpectedConditions.elementToBeClickable(buttonBack));
		buttonBack.click();
	}

	@And("^click button RemoveResume$")
	public void click_button_removeresume() throws Throwable {
		WebElement removeFile = acp.getRemoveResume();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", removeFile);
	}

	@Then("^Validate the Candidate was created$")
	public void validate_the_candidate_was_created() throws Throwable {
		CandidatesPage cp = new CandidatesPage(driver);
		Thread.sleep(3000);
		WebElement nameFilter = cp.getNameInputFilter();
		nameFilter.sendKeys(nameCandidate);
		WebElement result = driver.findElement(By.xpath(("//p[contains(@title, '" + nameCandidate + "')]")));
		Assert.assertTrue(result.isDisplayed());
	}

	@Then("^Validate the Candidate was not created$")
	public void validate_the_candidate_was_not_created() throws Throwable {
		CandidatesPage cp = new CandidatesPage(driver);
		Thread.sleep(3000);
		WebElement nameFilter = cp.getNameInputFilter();
		nameFilter.sendKeys(nameCandidate);
		List<WebElement> result = driver.findElements(By.xpath(("//p[contains(@title, '" + nameCandidate + "')]")));
		Assert.assertTrue(result.isEmpty());
	}
	
	@When("^Upload CV_Resume \"([^\"]*)\"$")
	public void upload_CV_Resume(String fileToUpload) throws Throwable {
		Thread.sleep(3000);
		propertiesFileRead();
		acp.getUploadFile().sendKeys(prop.getProperty(fileToUpload));
	}
	
    
    @Then("^Validate file upload$")
    public void validate_file_upload() throws Throwable {
   	 List<WebElement> uploadedFile = driver.findElements(By.xpath("//span[.='Upload File']"));
   	 Assert.assertTrue(uploadedFile.isEmpty());
    }
    
    @And("^Validate file removal$")
    public void validate_file_removal() throws Throwable {
      	 List<WebElement> uploadedFile = driver.findElements(By.xpath("//span[.='Upload File']"));
       	 Assert.assertFalse(uploadedFile.isEmpty());
    }
    
    @And("^Validate picture upload$")
    public void validate_picture_upload() throws Throwable {
     	 List<WebElement> uploadedFile = driver.findElements(By.xpath("//img[@class='candidate-avatar']"));
       	 Assert.assertFalse(uploadedFile.isEmpty());
    }

}
