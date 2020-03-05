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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sirma.pageObjects.AddCandidateManuallyPage;
import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.CreateCompanyPage;
import com.sirma.pageObjects.CreateDepartmentPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class CreateDepartmentStepDefinition extends Base {

	private static Logger log = LogManager.getLogger(CreateDepartmentStepDefinition.class.getName());
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	CreateDepartmentPage createDepartmentPage = new CreateDepartmentPage(driver);
	Fairy fairy = Fairy.create();
	Company company = fairy.company();
	Person person = fairy.person();
	String departmentName = null;
	HomePage hp = new HomePage(driver);
	


	    @And("^Click on Department submenu$")
	    public void click_on_department_submenu() throws Throwable {
	        hp.getDepartments().click();
	    }

	    @And("^Click on Create Department button$")
	    public void click_on_create_department_button() throws Throwable {
	    	wait.until(ExpectedConditions
					.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
	    	createDepartmentPage.getCreateDepartmentButton().click();
	    }

	    @And("^Fill in Departmentname$")
	    public void fill_in_departmentname() throws Throwable {
			departmentName = company.name();
			createDepartmentPage.getName().sendKeys(departmentName);
	    }

	    @And("^Select AssistantDepartmentHead$")
	    public void select_assistantdepartmenthead() throws Throwable {
			WebElement assistantDepartmentHead = createDepartmentPage.getAssitantDepHead();
			assistantDepartmentHead.sendKeys("m");
			Thread.sleep(2000);
			assistantDepartmentHead.sendKeys(Keys.ENTER);
	    }

	    @And("^Select DepartmentHead$")
	    public void select_departmenthead() throws Throwable {
			WebElement departmentHead = createDepartmentPage.getDepartmentHead();
			departmentHead.sendKeys("m");
			Thread.sleep(2000);
			departmentHead.sendKeys(Keys.ENTER);
	    }

	    @And("^Select Company$")
	    public void select_company() throws Throwable {
			WebElement company = createDepartmentPage.getCompany();
			company.sendKeys("S&G");
			Thread.sleep(2000);
			company.sendKeys(Keys.ENTER);
	    }

	    @And("^Click button BackDepartment$")
	    public void click_button_backdepartment() throws Throwable {
	    	createDepartmentPage.getBackDepartment().click();
	    }
	    
	    @Then("^Validate the Department was created$")
	    public void validate_the_department_was_created() throws Throwable {
			Thread.sleep(3000);
			WebElement departmentNameFilter = createDepartmentPage.getDepartmentNameFilterInput();
			departmentNameFilter.sendKeys(departmentName);
			List<WebElement> result = driver.findElements(By.xpath(("//a[.='" + departmentName + "']")));
			Assert.assertFalse(result.isEmpty());
	    }
	    
		@Then("^Validate the Department was not created$")
		public void validate_the_department_was_not_created() throws Throwable {
			Thread.sleep(3000);
			WebElement departmentNameFilter = createDepartmentPage.getDepartmentNameFilterInput();
			departmentNameFilter.sendKeys(departmentName);
			List<WebElement> result = driver.findElements(By.xpath(("//a[.='" + departmentName + "']")));
			Assert.assertTrue(result.isEmpty());
		    }

	    @And("^Click button SaveDepartment$")
	    public void click_button_savedepartment() throws Throwable {
	    	createDepartmentPage.getSaveDepartment().click();
	    }
	    
	    @Then("^Validate that SaveDepartment button is enabled$")
	    public void validate_that_savedepartment_button_is_enabled() throws Throwable {
	        Assert.assertTrue(createDepartmentPage.getSaveDepartment().isEnabled());
	    }
	    
	    @Then("^Validate the Department was created as Active$")
	    public void validate_the_department_was_created_as_active() throws Throwable {
			Thread.sleep(3000);
			WebElement departmentNameFilter = createDepartmentPage.getDepartmentNameFilterInput();
			departmentNameFilter.sendKeys(departmentName);
			List<WebElement> result = driver.findElements(By.xpath(("//a[.='" + departmentName + "']")));
			Assert.assertTrue(createDepartmentPage.getDropdownInactive().isDisplayed());
			
		/*	WebElement dropdownAdult = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
			Select sDropdown = new Select(dropdownAdult); //the Select argument is the web element
			sDropdown.selectByValue("2").*/
	    }
	    
	    @Then("^Validate the Department was created as Inctive$")
	    public void validate_the_department_was_created_as_inctive() throws Throwable {
			Thread.sleep(3000);
			WebElement departmentNameFilter = createDepartmentPage.getDepartmentNameFilterInput();
			departmentNameFilter.sendKeys(departmentName);
			List<WebElement> result = driver.findElements(By.xpath(("//a[.='" + departmentName + "']")));
			WebElement dropdownAdult = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
			//Select activeDropdown    = new Select(createDepartmentPage.getDropdownActive()); 
			Assert.assertTrue(createDepartmentPage.getDropdownInactive().isDisplayed()  );
	    }
}
