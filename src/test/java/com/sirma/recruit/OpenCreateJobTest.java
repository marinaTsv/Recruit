package com.sirma.recruit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.JobsPage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OpenCreateJobTest extends Base {

	@Test

	public void openCreateJob() throws Throwable {

		driver = initializeDriver();

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();

		LogInPage lp = new LogInPage(driver);
		lp.getEmailTextField().sendKeys("admin");
		lp.getPasswordTextField().sendKeys("admin1234");
		lp.getLoginButton().click();

		HomePage hp = new HomePage(driver);
		hp.getJobs().click();

		JobsPage jp = new JobsPage(driver);
		WebElement element = jp.getCreateJobButton();
	
		WebDriverWait wait = new WebDriverWait(driver, 60000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
		
		 if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Enabled&Displayed");
				//((JavascriptExecutor)driver).executeScript("arguments[0].click();",element); 				 
				element.click();
		}
	}
}
