package com.revit.bddtesting.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindFlightStep extends StepDef{
	@Given("^I am a logged-in user$")
	public void setUp() {
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		login.passUsername("mercury");
		login.passPassword("mercury");
		login.clickLogin();
	}

	@Given("^I am on the find flight page$")
	public void verifyOnFindFlightPage() {
		assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}

	@When("^I select trip type as \"(.*)\"$")
	public void tripType(String arg1) {
		findFlight.selectTripType(arg1);
	}

	@When("^I enter departure city as \"(.*)\"$")
	public void selectDep(String arg1) {
		findFlight.passDeparting(arg1);
	}

	@When("^I enter arrival city as \"(.*)\"$")
	public void selectArr(String arg1) {
		findFlight.passArrival(arg1);
	}

	@When("^I select seat class as \"(.*)\"$")
	public void seatClass(String arg1) {
		findFlight.selectSeatClass(arg1);
	}

	@When("^I click find flight button$")
	public void clickFind() {
		findFlight.clickFindFlight();
	}

	@Then("^I should be on select flight page$")
	public void verifyOnSelectPage() {
		assertEquals("Select a Flight: Mercury Tours", driver.getTitle());
	}

	@Then("^The departure city should be \"(.*)\"$")
	public void verifyDepCity(String arg1) {
		assertEquals(arg1, selectFlight.readFromPort());
	}

	@Then("^The arrival city should be \"(.*)\"$")
	public void verifyArrCity(String arg1) {
		assertEquals(arg1, selectFlight.readToPort());
	}

	@Then("^The seat class should be \"(.*)\"$")
	public void verifySeatClass(String arg1) {
		String cl = selectFlight.readServClass();
		if (cl.equals("Coach"))
			cl = "Economy Class";
		assertEquals(arg1, cl);
	}
}
