package com.revit.bddtesting.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectFlightStep extends StepDef{
	@Given("^I have found flights$")
	public void findFlight() {
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		login.passUsername("mercury");
		login.passPassword("mercury");
		login.clickLogin();
		findFlight.selectTripType("One Way");
		findFlight.passDeparting("Sydney");
		findFlight.passArrival("London");
		findFlight.selectSeatClass("First Class");
		findFlight.clickFindFlight();
	}

	@Given("^I am on the select flight page$")
	public void verifyOnSelectPage() {
		assertEquals("Select a Flight: Mercury Tours", driver.getTitle());
	}

	@When("I click select flight$")
	public void selectFlight() {
		selectFlight.clickSelectFlight();
	}

	@Then("^I should be on book flight page$")
	public void verifyOnBookFlightPage() {
		assertEquals("Book a Flight: Mercury Tours", driver.getTitle());
	}
}
