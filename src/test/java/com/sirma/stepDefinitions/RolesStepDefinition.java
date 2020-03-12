package com.sirma.stepDefinitions;

import cucumber.api.PendingException;
import org.openqa.selenium.support.ui.*;

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
import com.sirma.pageObjects.IWebElement;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class RolesStepDefinition extends Base {

	private static Logger log = LogManager.getLogger(RolesStepDefinition.class.getName());
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	CreateDepartmentPage createDepartmentPage = new CreateDepartmentPage(driver);
	Fairy fairy = Fairy.create();
	Company company = fairy.company();
	Person person = fairy.person();
	String departmentName = null;
	HomePage hp = new HomePage(driver);
	


	
	 try{ IWebElement TargetElement = driver.FindElement(By.XPath(xPathVal)); 
	 if (!TargetElement.Selected) { TargetElement.SendKeys(Keys.Space); } } 
	 catch (Exception e) { } 
}
