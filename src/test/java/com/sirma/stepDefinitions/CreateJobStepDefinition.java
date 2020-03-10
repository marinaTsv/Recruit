package com.sirma.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;
import junit.framework.Assert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sirma.pageObjects.CreateJobPage;
import org.apache.logging.log4j.*;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)

public class CreateJobStepDefinition extends Base {
	private static Logger log = LogManager.getLogger(CreateJobStepDefinition.class.getName());
	CreateJobPage cjp = new CreateJobPage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20000);
	String jobTitle = null;
   
    @And("^Fill in Title (.+)$")
    public void fill_in_title(String title) throws Throwable {
    	cjp.gettitleTextField().sendKeys(title);
    	jobTitle = title;
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
    	cjp.getLocationLabel().click();
    	Thread.sleep(2000);
    	cjp.getAddNewLocationButton().click();
    	//<div id="react-select-5-option-2" class="css-fk865s-option"> obscures
    }
    
    @And("^Click button AddNewEmploymentType$")
    public void click_button_addnewemploymenttype() throws Throwable {
		/*driver.switchTo().defaultContent();
		WebElement addNew_EmploymentType = cjp.getAddNewEmploymentTypeButton();
		addNew_EmploymentType.click();*/
    	WebElement element = cjp.getAddNewEmploymentTypeButton();
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	Thread.sleep(500); 
    	element.click();

    }
 
    @And("^Fill in Create Location$")
    public void fill_in_create_location() throws Throwable {
		Fairy fairy = Fairy.create();
		Person person = fairy.person();
		Company company1 = fairy.company();
		cjp.getLocationName().sendKeys(person.firstName());
		cjp.getAddress().sendKeys(person.fullName());
		cjp.getCountry().sendKeys(person.fullName());
		cjp.getCity().sendKeys(person.fullName());
		cjp.getSave().click();
    }
    
    @And("^Create NewEmploymentType$")
    public void create_newemploymenttype() throws Throwable {
		cjp.getName().sendKeys("Employment A");
		cjp.getSave_EmploymentType().click();
    }

    @And("^Validate the job was created$")
    public void validate_the_job_was_created() throws Throwable {
    	//JobsPage jp = new JobsPage(driver);
		Thread.sleep(3000);
		//WebElement nameFilter = cp.getNameInputFilter();
		//nameFilter.sendKeys(nameCandidate);
		WebElement result = driver.findElement(By.xpath(("//h1[.='" + jobTitle + "']")));
		Assert.assertTrue(result.isDisplayed());
		log.info("Job was created");
    }
}
