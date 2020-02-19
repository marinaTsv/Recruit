package com.sirma.stepDefinitions;

import cucumber.api.PendingException;
import org.apache.logging.log4j.*;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;

import com.sirma.pageObjects.LogInPage;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class AGeneralStepDefinition extends Base {
	private static Logger log = LogManager.getLogger(AGeneralStepDefinition.class.getName());
    @And("^End test$")
    public void end_test() throws Throwable {
       driver.close();
       log.atDebug().log("Driver closed");
    }

	 @And("^Fill in user and pass$")
	    public void fill_in_user_and_pass() throws Throwable {
   	LogInPage lp = new LogInPage(driver);
   	System.out.println(prop.getProperty("user"));
   	System.out.println(prop.getProperty("password"));
		lp.getEmailTextField().sendKeys(prop.getProperty("user"));
		lp.getPasswordTextField().sendKeys(prop.getProperty("password"));
		lp.getLoginButton().click();
		log.atDebug().log("Log in simply");
   }
}
	

