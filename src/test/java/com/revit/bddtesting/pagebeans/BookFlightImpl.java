package com.revit.bddtesting.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Repository;

import com.revit.bddtesting.models.BookFlight;

/**
 * BookFlight class. This is a page model including the web elements on this
 * page.
 */
@Repository("bookFlightBean")
public class BookFlightImpl extends SuperPageBean implements BookFlight {

	@FindBy(name = "passFirst0")
	private WebElement firstNameBox;

	@FindBy(name = "passLast0")
	private WebElement lastNameBox;

	@FindBy(name = "creditnumber")
	private WebElement creditNumberBox;

	@FindBy(name = "ticketLess")
	private WebElement ticketLessBox;

	@FindBy(name = "buyFlights")
	private WebElement buyFlightButton;

	public void passFirstname(String firstName) {
		firstNameBox.sendKeys(firstName);
	}

	public void passLastname(String lastName) {
		lastNameBox.sendKeys(lastName);
	}

	public void passCreditNum(String number) {
		creditNumberBox.sendKeys(number);
	}

	public void checkTickLess() {
		ticketLessBox.click();
	}

	public void clickBookTicket() {
		buyFlightButton.click();
	}
}
