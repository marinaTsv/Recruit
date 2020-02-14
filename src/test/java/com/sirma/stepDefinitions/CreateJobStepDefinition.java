package com.sirma.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.CreateJobPage;
import com.sirma.pageObjects.CreateJob_AddNewLocationPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)


public class CreateJobStepDefinition extends Base {
	CreateJobPage cjp = new CreateJobPage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20000);
    @And("^Fill in Title (.+)$")
    public void fill_in_title(String title) throws Throwable {
    	cjp.gettitleTextField().sendKeys(title);
    }

    @And("^FIll in Company (.+)$")
    public void fill_in_company(String company) throws Throwable {
    	
    	WebElement companyDropDown = cjp.getcompanyDropDown();
    	companyDropDown.sendKeys(company);
		Thread.sleep(2000);
		companyDropDown.sendKeys(Keys.ENTER);
    }

    @And("^FIll in Department (.+)$")
    public void fill_in_department(String department) throws Throwable {
		WebElement departmentdropDown = cjp.getdepartmentDropDown();
		departmentdropDown.sendKeys(department);
		Thread.sleep(2000);
		departmentdropDown.sendKeys(Keys.ENTER);
    }

    @And("^FIll in Location (.+)$")
    public void fill_in_location(String location) throws Throwable {
		WebElement locationDropDown = cjp.getLocationDropdown();
		locationDropDown.sendKeys(location);
		Thread.sleep(2000);
		locationDropDown.sendKeys(Keys.ENTER);
    }

    @And("^FIll in JobDescription (.+)$")
    public void fill_in_jobdescription(String jobdescription) throws Throwable {
		WebElement jobDescriptioniFrame = cjp.getJobDescriptioniFrame();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(jobDescriptioniFrame));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@class='mce-content-body ']")));
		cjp.getJobDescriptionBody().click();
		Thread.sleep(2000);
		cjp.getJobDescriptionBody().sendKeys(jobdescription);
		driver.switchTo().defaultContent();
    }

    @And("^FIll in JobRequirements (.+)$")
    public void fill_in_jobrequirements(String jobrequirements) throws Throwable {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='job-content-wrapper row']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/iframe")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@class='mce-content-body ']")));
		WebElement jobRequirementsiFrameBody = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
		jobRequirementsiFrameBody.click();
		Thread.sleep(2000);
		jobRequirementsiFrameBody.sendKeys(jobrequirements);
		driver.switchTo().defaultContent();
    }

    @And("^FIll in EmploymentType (.+)$")
    public void fill_in_employmenttype(String employmenttype) throws Throwable {
		WebElement employmentType = cjp.getEmploymentType();
		employmentType.sendKeys(employmenttype);
		Thread.sleep(2000);
		employmentType.sendKeys(Keys.ENTER);
    }

    @And("^Click on button Save$")
    public void click_on_button_save() throws Throwable {
    	cjp.getSaveButton().click();
    }
    
    @And("^Click button AddNewLocation$")
    public void click_button_addnewlocation() throws Throwable {
		cjp.getAddNewLocationButton().click();
    }

    @And("^Fill in Location Name, Address, Country,State, City,ZipCode and click button Save $")
    public void fill_in_location_name_address_countrystate_cityzipcode_and_click_button_save() throws Throwable {
		//first create Fairy object. By default - Locale is English
		Fairy fairy = Fairy.create();
		Person person = fairy.person();
		cjp.getLocationName().sendKeys(person.fullName());
		cjp.getAddress().sendKeys(person.fullName());
		cjp.getCountry().sendKeys(person.fullName());
		cjp.getCity().sendKeys(person.fullName());
		cjp.getSave().click();
    }
    
    @And("^Click button AddNewEmploymentType$")
    public void click_button_addnewemploymenttype() throws Throwable {
		driver.switchTo().defaultContent();
		WebElement addNew_EmploymentType = cjp.getAddNewEmploymentTypeButton();
		addNew_EmploymentType.click();
    }

    @And("^Fill in the NewEmploymentType Name and click button Save $")
    public void fill_in_the_newemploymenttype_name_and_click_button_save() throws Throwable {
		cjp.getName().sendKeys("Employment A");
		cjp.getSave_EmploymentType().click();
    }

}
