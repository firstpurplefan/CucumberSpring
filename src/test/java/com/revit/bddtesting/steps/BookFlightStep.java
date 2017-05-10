package com.revit.bddtesting.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightStep extends StepDef{

	@Given("^I have selected flights$")
	public void selectFlight() throws Throwable {
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		login.passUsername("mercury");
		login.passPassword("mercury");
		login.clickLogin();
		findFlight.selectTripType("One Way");
		findFlight.passDeparting("Sydney");
		findFlight.passArrival("London");
		findFlight.selectSeatClass("First Class");
		findFlight.clickFindFlight();
		selectFlight.clickSelectFlight();
	}

	@Given("^I am on the booking flight page$")
	public void verifyOnBookPage() {
		assertEquals("Book a Flight: Mercury Tours", driver.getTitle());
	}

	@When("^I enter the first name as \"(.*)\"$")
	public void enterFirstName(String arg1) {
		bookFlight.passFirstname(arg1);
	}

	@When("^I enter the last name as \"(.*)\"$")
	public void enterLastName(String arg1) {
		bookFlight.passLastname(arg1);
	}

	@When("^I enter the credit card number as \"(.*)\"$")
	public void enterCredit(String arg1) {
		bookFlight.passCreditNum(arg1);
	}

	@When("^I do need a ticketless bill$")
	public void selectTicketless() {

		bookFlight.checkTickLess();
	}

	@When("^I donot need a ticketless bill$")
	public void doNothing() {

	}

	@When("^I click on purchase button$")
	public void clickPurchase() {
		bookFlight.clickBookTicket();
	}

	@Then("^I should be on the comfirmation page$")
	public void then() throws Throwable {
		assertEquals("Flight Confirmation: Mercury Tours", driver.getTitle());
	}
}
