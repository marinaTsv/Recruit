package com.sirma.recruit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

import junit.framework.Assert;

public class LogInTest extends Base {
	
	@BeforeTest
	public void initialize() throws IOException {
		WebDriver driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void checkIn(String username,String password) {
		LogInPage lp = new LogInPage(driver);
		lp.getEmailTextField().sendKeys(username);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
		
		//Validate successful login
		String actualURL = driver.getCurrentUrl();//actual url after perform of the above actions
		String expectedURL = prop.getProperty("ExpectedURLafterLogIn");//the url after successfull login
		//Assert.assertEquals(expectedURL, actualURL);
		}
	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2

		Object[][] data=new Object[4][2];

		data[0][0]="admin";
		data[0][1]="admin1234";

		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		
		data[1][0]="admin";
		data[1][1]="456788";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="admin1234";
		
		return data;
	
	}
	}


