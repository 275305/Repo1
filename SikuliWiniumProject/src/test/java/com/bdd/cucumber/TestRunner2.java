package com.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/MyApplication2.feature", glue= {"SmokeTest2"},dryRun=true)
public class TestRunner2 {

}
