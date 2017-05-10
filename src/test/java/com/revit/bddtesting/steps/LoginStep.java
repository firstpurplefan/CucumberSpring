package com.revit.bddtesting.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends StepDef {
	@Given("^I am a user of Book Flight$")
	public void setUp() {
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@Given("^I am on the login page$")
	public void verifyOnLoginPage() {
		assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@When("^I enter username as \"(.*)\"$")
	public void enterUsername(String arg1) {
		login.passUsername(arg1);
	}

	@When("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) {
		login.passPassword(arg1);
		login.clickLogin();
	}

	@Then("^I should be logged in$")
	public void checkSuccess() {
		assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}
}
