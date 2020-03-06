package com.sirma.cucumberoptions;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/sirma/features", glue = "com/sirma/stepDefinitions", tags = {"@Location1"}) 
// will execute everything in the features package; provide the file name to execute only it
//package with features and package with step definitions must be in one and the same folder
public class TestRunner extends AbstractTestNGCucumberTests {
}

//, tags = {"@Department1"}