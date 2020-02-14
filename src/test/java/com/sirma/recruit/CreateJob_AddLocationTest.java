package com.sirma.recruit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sirma.pageObjects.CreateJobPage;
import com.sirma.pageObjects.CreateJob_AddNewLocationPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.JobsPage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Person;
import junit.framework.Assert;

public class CreateJob_AddLocationTest extends Base {
	
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
		 
		 
	//In the Create Job page
		 
			CreateJobPage cjp = new CreateJobPage(driver);
			cjp.gettitleTextField().sendKeys("Job Positions 123");
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-5-input']")));
			WebElement company = cjp.getcompanyDropDown();
			//company.clear();
			

			company.sendKeys("S");
			Thread.sleep(2000);
			company.sendKeys(Keys.ENTER);
			
			WebElement department = cjp.getdepartmentDropDown();
			department.sendKeys("S");
			Thread.sleep(2000);
			department.sendKeys(Keys.ENTER);
	
//add new location
			//first create Fairy object. By default - Locale is English
			Fairy fairy = Fairy.create();
			Person person = fairy.person();
			Company company1 = fairy.company();

			
			cjp.getAddNewLocationButton().click();
			/*CreateJob_AddNewLocationPage addnl = new CreateJob_AddNewLocationPage(driver);
			addnl.getLocationName().sendKeys("New Location B");
			addnl.getAddress().sendKeys("Address 56");
			addnl.getCountry().sendKeys("Country");
			addnl.getCity().sendKeys("City");
			addnl.getSave().click();*/
			
			cjp.getLocationName().sendKeys(person.firstName());
			cjp.getAddress().sendKeys(person.fullName());
			cjp.getCountry().sendKeys(person.fullName());
			cjp.getCity().sendKeys(person.fullName());
			cjp.getSave().click();
						
///Job Description
			WebElement jobDescriptioniFrame = cjp.getJobDescriptioniFrame();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(jobDescriptioniFrame));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@class='mce-content-body ']")));

			
			WebElement jobDescriptionBody = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
			jobDescriptionBody.click();
			Thread.sleep(2000);
			jobDescriptionBody.sendKeys("Vamos con una apuesta para esta");

///Job Requirements
			driver.switchTo().defaultContent();
			//WebElement jobRequirementsiFrame1 = cjp.getJobRequirementsiFrame();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='job-content-wrapper row']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/iframe")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@class='mce-content-body ']")));


			WebElement jobRequirementsiFrameBody = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
			jobRequirementsiFrameBody.click();
			Thread.sleep(2000);
			jobRequirementsiFrameBody.sendKeys("Vamos con una apuesta para esta!");
			
	//Employment type & click button
			driver.switchTo().defaultContent();
			WebElement employmentType = cjp.getEmploymentType();
			employmentType.sendKeys("S");
			Thread.sleep(2000);
			employmentType.sendKeys(Keys.ENTER);
			
			cjp.getSaveButton().click();
			
			WebElement message = driver.findElement(By.xpath("//*[text()='Job has been created successfully']"));
			Assert.assertEquals(true, message.isDisplayed());
	}
}
