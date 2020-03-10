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
import io.codearte.jfairy.producer.BaseProducer;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Address;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.text.TextProducer;
import junit.framework.Assert;

import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.AddCandidateManuallyPage;
import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.CreateCompanyPage;
import com.sirma.pageObjects.CreateDepartmentPage;
import com.sirma.pageObjects.CreateLocationPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class CreateLocationStepDefinition extends Base {

	private static Logger log = LogManager.getLogger(CreateLocationStepDefinition.class.getName());
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	CreateLocationPage createLocationPage = new CreateLocationPage(driver);
	Fairy fairy = Fairy.create();
	Company company = fairy.company();
	Person person = fairy.person();
	BaseProducer baseProducer = fairy.baseProducer();
	String locationName = null;
	HomePage hp = new HomePage(driver);
	TextProducer textProducer = fairy.textProducer();
	
	   @Then("^Validate the location was created$")
	    public void validate_the_location_was_created() throws Throwable {
			Thread.sleep(3000);
			WebElement locationNameFilter = createLocationPage.getLocationNameFilter();
			locationNameFilter.sendKeys(locationName);
			WebElement result = driver.findElement(By.xpath(("//a[.='" + locationName + "']")));
			Assert.assertTrue(result.isDisplayed());
	    }
	   
	    @Then("^Validate the Location was not created$")
	    public void validate_the_location_was_not_created() throws Throwable {
			Thread.sleep(3000);
			WebElement locationNameFilter = createLocationPage.getLocationNameFilter();
			locationNameFilter.sendKeys(locationName);
			WebElement result = driver.findElement(By.xpath(("//a[.='" + locationName + "']")));
			Assert.assertFalse(result.isDisplayed());
	    }

	    @And("^Click on Locations submenu$")
	    public void click_on_locations_submenu() throws Throwable {
	    	hp.getLocations().click();
	    }

	    @And("^Click on Create Location button$")
	    public void click_on_create_location_button() throws Throwable {
	    	wait.until(ExpectedConditions
					.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
	    	createLocationPage.getCreateLocationButton().click();
	    }

	    @And("^Fill in LocationName$")
	    public void fill_in_locationname() throws Throwable {
			locationName = company.name();
			createLocationPage.getLocationName().sendKeys(locationName);
	    }

	    @And("^Select Company_inLocation$")
	    public void select_companyinlocation() throws Throwable {
			WebElement compaLny_InLocationPage = createLocationPage.getCompany();
			compaLny_InLocationPage.sendKeys("S&G");
			Thread.sleep(2000);
			compaLny_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Select Timezone$")
	    public void select_timezone() throws Throwable {
			WebElement timezone = createLocationPage.getTimezone();
			timezone.sendKeys("G");
			Thread.sleep(2000);
			timezone.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In Country$")
	    public void fill_in_country() throws Throwable {
			
	    	WebElement country_InLocationPage = createLocationPage.getCountry();
	    	String country = baseProducer.letterify("???????");
	    	country_InLocationPage.sendKeys(country);
			Thread.sleep(2000);
			country_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In City$")
	    public void fill_in_city() throws Throwable {
	    	WebElement city_InLocationPage = createLocationPage.getCity();
	    	String city = baseProducer.letterify("??????? ?????");
	    	city_InLocationPage.sendKeys(city);
			Thread.sleep(2000);
			city_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In State$")
	    public void fill_in_state() throws Throwable {
	    	WebElement state_InLocationPage = createLocationPage.getState();
	    	String state = baseProducer.letterify("????????");
	    	state_InLocationPage.sendKeys(state);
			Thread.sleep(2000);
			state_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In ZipCode$")
	    public void fill_in_zipcode() throws Throwable {
	    	WebElement zipCode_InLocationPage = createLocationPage.getZipCode();
	    	String zipCode = baseProducer.numerify("######");
	    	zipCode_InLocationPage.sendKeys(zipCode);
			Thread.sleep(2000);
			zipCode_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In Address$")
	    public void fill_in_address() throws Throwable {
	    	WebElement address_InLocationPage = createLocationPage.getAddress();
	    	Address address = person.getAddress();
	    	address_InLocationPage.sendKeys(address.toString());
			Thread.sleep(2000);
			address_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In PhoneNumber$")
	    public void fill_in_phonenumber() throws Throwable {
	    	WebElement phoneNumber_InLocationPage = createLocationPage.getPhoneNumber();
	    	//String phone = person.telephoneNumber();
	    	String phoneWithDash = person.telephoneNumber();
	    	phoneNumber_InLocationPage.sendKeys(phoneWithDash.replace("-", ""));
	    }

	    @And("^Fill In Email$")
	    public void fill_in_email() throws Throwable {
	    	WebElement email_InLocationPage = createLocationPage.getEmail();
	    	String email = person.email();
	    	email_InLocationPage.sendKeys(email);
			Thread.sleep(2000);
			email_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Fill In Notes$")
	    public void fill_in_notes() throws Throwable {
	    	WebElement notes_InLocationPage = createLocationPage.getNotes();
	    	String notes = textProducer.paragraph();
	    	notes_InLocationPage.sendKeys(notes);
			Thread.sleep(2000);
			notes_InLocationPage.sendKeys(Keys.ENTER);
	    }

	    @And("^Click button SaveLocation$")
	    public void click_button_savelocation() throws Throwable {
	    	createLocationPage.getSaveLocation().click();
	    }
	    @And("^Click button BackLocation$")
	    public void click_button_backlocation() throws Throwable {
	    	createLocationPage.getBackLocation().click();
	    }

}
