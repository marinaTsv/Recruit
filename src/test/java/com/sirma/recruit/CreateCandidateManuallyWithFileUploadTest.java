package com.sirma.recruit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

import com.sirma.pageObjects.AddCandidateManuallyPage;
import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import junit.framework.Assert;

public class CreateCandidateManuallyWithFileUploadTest extends Base{

	@BeforeTest
	public void initialize() throws IOException {
		WebDriver driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void logIn() throws Exception {
//Open Create Candidate		
	LogInPage lp = new LogInPage(driver);
	lp.getEmailTextField().sendKeys("admin");
	lp.getPasswordTextField().sendKeys("admin1234");
	lp.getLoginButton().click();
	
	HomePage hp = new HomePage(driver);
	hp.getCandidates().click();
    CandidatesPage cd = new CandidatesPage(driver);
	Assert.assertTrue(cd.getAddCandidateButton().isDisplayed());

	WebDriverWait wait = new WebDriverWait(driver, 10000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='p-component-overlay p-dialog-mask']")));
	WebElement element = cd.getAddCandidateButton();
	element.click();
	WebElement options = driver.findElement(By.xpath("//*[text()='Add manually']"));//("//div[@class='css-dpec0i-option']."));
	options.click();

//Create Candidate
	
	AddCandidateManuallyPage acp = new AddCandidateManuallyPage(driver);
	//first create Fairy object. By default - Locale is English
	Fairy fairy = Fairy.create();
	Person person = fairy.person();
	acp.getName().sendKeys(person.fullName());
	System.out.print("Name Inserted");
	acp.getEmail().sendKeys(person.email());
//Telephone	
	String phoneWithDash = person.telephoneNumber();
	acp.getPhone().sendKeys(phoneWithDash.replace("-", ""));

	WebElement jobsOfTalentPools = acp.getJobsOfTalentPools();
	jobsOfTalentPools.sendKeys("J");
	Thread.sleep(2000);
	jobsOfTalentPools.sendKeys(Keys.ENTER);
	
	WebElement source = acp.getSource();
	source.sendKeys("J");
	Thread.sleep(2000);
	source.sendKeys(Keys.ENTER);
	
//Upload Picture
	
	//Runtime.getRuntime().exec("D:\\Projects\\Recruit\\src\\main\\java\\com\\sirma\\resources\\fileupload.exe");
	 Thread.sleep(3000);
	 acp.getUploadPhoto().sendKeys("C:\\Users\\marina.tsvetkova\\Pictures\\photo.jpg");   
	 Thread.sleep(3000);
	 acp.getUploadFile().sendKeys("C:\\Users\\marina.tsvetkova\\Pictures\\CVasdkik c.docx"); 
	 wait.until(ExpectedConditions.visibilityOf(acp.getRemoveResume()));
	// WebElement footer = driver.findElement(By.xpath("//div[@class='version-footer']"));
	// wait.until(ExpectedConditions.invisibilityOf(footer));
	 Thread.sleep(3000);
	// acp.getRemoveResume().click();
	 WebElement removeFile = acp.getRemoveResume();
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();", removeFile);
	 acp.getUploadFile().sendKeys("C:\\Users\\marina.tsvetkova\\Pictures\\CVasdkik c - Copy.docx"); 
	 //acp.getSave().click();
	}
}
