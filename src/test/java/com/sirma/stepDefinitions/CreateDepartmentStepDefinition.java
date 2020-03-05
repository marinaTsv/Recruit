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
public class CreateDepartmentStepDefinition extends Base {

	private static Logger log = LogManager.getLogger(CreateDepartmentStepDefinition.class.getName());
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	CreateCompanyPage createCompanyPage = new CreateCompanyPage(driver);
	Fairy fairy = Fairy.create();
	Company company = fairy.company();
	Person person = fairy.person();
	String companyName = null;
	HomePage hp = new HomePage(driver);
	
	   @Then("^Validate the Department was not created$")
	    public void validate_the_department_was_not_created() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Click on Department submenu$")
	    public void click_on_department_submenu() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Click on Create Department button$")
	    public void click_on_create_department_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Fill in Departmentname$")
	    public void fill_in_departmentname() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Select AssistantDepartmentHead$")
	    public void select_assistantdepartmenthead() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Select DepartmentHead$")
	    public void select_departmenthead() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Select Company$")
	    public void select_company() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Click button BackDepartment$")
	    public void click_button_backdepartment() throws Throwable {
	        throw new PendingException();
	    }
}
