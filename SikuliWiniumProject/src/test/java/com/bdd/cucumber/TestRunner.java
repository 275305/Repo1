package com.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//features refers the .features file or to locate the .feature file

//glue is refers the step definition file or to locate the step definition file



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/MyApplication.feature")
public class TestRunner {
	
	

}
