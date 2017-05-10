package com.revit.bddtesting.webtesting;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:./report/cucumber-html-report", 
		"json:./report/cucumber.json"},
        features =  {"features"} ,
        glue = { "com.revit.bddtesting.steps" })
public class RunTest{
}