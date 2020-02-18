package com.sirma.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import com.sirma.resources.Base;

@RunWith(Cucumber.class)
public class AGeneralStepDefinition extends Base {

    @And("^End test$")
    public void end_test() throws Throwable {
       driver.close();
    }
}
	

