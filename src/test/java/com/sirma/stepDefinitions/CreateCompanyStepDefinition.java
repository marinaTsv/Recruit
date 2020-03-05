package com.sirma.stepDefinitions;

import cucumber.api.PendingException;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;
import junit.framework.Assert;

import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.AddCandidateManuallyPage;
import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.CreateCompanyPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class CreateCompanyStepDefinition extends Base {

	private static Logger log = LogManager.getLogger(CreateCompanyStepDefinition.class.getName());
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	CreateCompanyPage createCompanyPage = new CreateCompanyPage(driver);
	Fairy fairy = Fairy.create();
	Company company = fairy.company();
	Person person = fairy.person();
	String companyName = null;
	HomePage hp = new HomePage(driver);


	
	
	@And("^Click on Sttings menu$")
	public void click_on_Sttings_menu() throws Throwable {
		Thread.sleep(2000);
		hp.getSettingsButton().click();
	    
	}

	@And("^Click on Companies submenu$")
	public void click_on_Companies_submenu() throws Throwable {
		Thread.sleep(2000);
		hp.getCompanies().click();
	}

	@And("^Click on Create Company button$")
	public void click_on_Create_Company_button() throws Throwable {
		Thread.sleep(2000);
		createCompanyPage.getCreateCompanyButton().click();
	}

	@When("^Fill in CompaNyname$")
	public void fill_in_CompaNyname() throws Throwable {
		companyName = company.name();
		createCompanyPage.getName().sendKeys(companyName);
	}

	@And("^Fill in CompanyEmail$")
	public void fill_in_CompanyEmail() throws Throwable {
	    String companyEmail = company.email();
	    createCompanyPage.getEmail().sendKeys(companyEmail);
	}

	@And("^Fill in CompanyWebsite$")
	public void fill_in_CompanyWebsite() throws Throwable {
	    String companyWebsite = company.url();
	    createCompanyPage.getWebsite().sendKeys(companyWebsite);
	}

	@And("^Fill CompanyContactPerson$")
	public void fill_CompanyContactPerson() throws Throwable {
		WebElement contactPerson = createCompanyPage.getContactPerson();
		contactPerson.sendKeys("m");
		Thread.sleep(2000);
		contactPerson.sendKeys(Keys.ENTER);
	}

	/*@And("^Upload file companyLogo$")
	public void upload_file_companyLogo() throws Throwable {
		Thread.sleep(3000);
		propertiesFileRead();
		createCompanyPage.getCompanyLogoUpload().sendKeys(prop.getProperty("companyLogo"));
	}*/

	@And("^Click button SaveCompany$")
	public void click_button_SaveCompany() throws Throwable {
		createCompanyPage.getSaveButton().click();
	}

	@Then("^Validate the Company was created$")
	public void validate_the_Company_was_created() throws Throwable {
		Thread.sleep(3000);
		WebElement companyNameFilter = createCompanyPage.getCompanyNameFilterInput();
		companyNameFilter.sendKeys(companyName);
		List<WebElement> result = driver.findElements(By.xpath(("//a[.='" + companyName + "']")));
		Assert.assertFalse(result.isEmpty());
	}
	
    @Then("^Validate the Company was not created$")
    public void validate_the_Company_was_not_created() throws Throwable {
		Thread.sleep(3000);
		WebElement companyNameFilter = createCompanyPage.getCompanyNameFilterInput();
		companyNameFilter.sendKeys(companyName);
		List<WebElement> result = driver.findElements(By.xpath(("//a[.='" + companyName + "']")));
		Assert.assertTrue(result.isEmpty());
    }
	
    @Then("^Validate companyLogo file upload$")
    public void validate_companylogo_file_upload() throws Throwable {
      	 List<WebElement> uploadedFile = driver.findElements(By.xpath("//span[.='Upload file']"));
       	 Assert.assertTrue(uploadedFile.isEmpty());
    }
    
    @And("^Validate companyLogo file removal$")
    public void validate_companylogo_file_removal() throws Throwable {
      	 List<WebElement> uploadedFile = driver.findElements(By.xpath("//span[.='Upload file']"));
       	 Assert.assertFalse(uploadedFile.isEmpty());
    }
    
    @When("^Click button Back in Create Company Page$")
    public void click_button_Back_in_Create_Company_Page() throws Throwable {
    	createCompanyPage.getBackButton().click();
    }
    
    @And("^click button RemoveLogo$")
    public void click_button_removelogo() throws Throwable {
    	createCompanyPage.getRemoveCompanyLogoUpload().click();
    }

    @Then("^Error message for unsupported file type appears$")
    public void error_message_for_unsupported_file_type_appears() throws Throwable {
    	Assert.assertTrue(createCompanyPage.getМessageSupportedFiles().isDisplayed());
    	
    }

    @And("^Upload file (.+)$")
    public void upload_file(String file) throws Throwable {
		Thread.sleep(3000);
		propertiesFileRead();
		createCompanyPage.getCompanyLogoUpload().sendKeys(prop.getProperty(file));
    }
}
