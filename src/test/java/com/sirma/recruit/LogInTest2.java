package com.sirma.recruit;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

import junit.framework.Assert;

public class LogInTest2 extends Base {
	
	@BeforeTest
	public void initialize() throws IOException {
		WebDriver driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void checkIn() {
    	LogInPage lp = new LogInPage(driver);
    	System.out.println(prop.getProperty("user"));
    	System.out.println(prop.getProperty("password"));
		lp.getEmailTextField().sendKeys(prop.getProperty("user"));
		lp.getPasswordTextField().sendKeys(prop.getProperty("password"));
		lp.getLoginButton().click();
		
		//Validate successful login
		String actualURL = driver.getCurrentUrl();//actual url after perform of the above actions
		String expectedURL = prop.getProperty("ExpectedURLafterLogIn");//the url after successfull login
		//Assert.assertEquals(expectedURL, actualURL);
		HomePage hp = new HomePage(driver);
		CandidatesPage cp = new CandidatesPage(driver);
		hp.getCandidates().click();
		cp.getNameInputFilter().sendKeys("A");
		
		
		
		}
	

	}


