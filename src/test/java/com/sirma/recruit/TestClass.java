package com.sirma.recruit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sirma.pageObjects.CandidatesPage;
import com.sirma.pageObjects.HomePage;
import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

public class TestClass extends Base {

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("URL"));

		driver.manage().window().maximize();

	}

	@Test

	public void logIn() {

		LogInPage lp = new LogInPage(driver);

		lp.getEmailTextField().sendKeys("admin");

		lp.getPasswordTextField().sendKeys("admin1234");

		lp.getLoginButton().click();

		HomePage hp = new HomePage(driver);

		hp.getCandidates().click();

		CandidatesPage cd = new CandidatesPage(driver);

		Assert.assertTrue(cd.getAddCandidateButton().isDisplayed());

		// Assert.assertFalse(hp.getAddCandidateButton().isDisplayed());

		WebDriverWait wait = new WebDriverWait(driver, 10000);

		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div/div/div[2]/main/div/div[2]/div[3]/div/div/div/div")));

		cd.getAddCandidateButton().click();

	}

}
