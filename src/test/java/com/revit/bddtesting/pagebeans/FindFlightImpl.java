package com.revit.bddtesting.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Repository;

import com.revit.bddtesting.models.FindFlight;

/**
 * FindFlight class. This is a page model including the web elements on this
 * page.
 */
@Repository("findFlightBean")
public class FindFlightImpl extends SuperPageBean implements FindFlight {
	@FindBy(xpath = "//input[@value='oneway']")
	private WebElement onewayRadio;

	@FindBy(xpath = "//input[@value='roundtrip']")
	private WebElement roundTripRadio;

	@FindBy(name = "fromPort")
	private WebElement depBox;

	@FindBy(name = "toPort")
	private WebElement arrBox;

	@FindBy(xpath = "//input[@value='First']")
	private WebElement firstClassBox;

	@FindBy(xpath = "//input[@value='Coach']")
	private WebElement economyClassBox;

	@FindBy(xpath = "//input[@value='Business']")
	private WebElement businessClassBox;

	@FindBy(name = "findFlights")
	private WebElement findFlighButton;

	public void checkOneway() {
		onewayRadio.click();
	}

	public void checkRoundTrip() {
		roundTripRadio.click();
	}

	public void selectTripType(String type) {
		if (type.toLowerCase().contains("round"))
			this.roundTripRadio.click();
		if (type.toLowerCase().contains("one"))
			this.onewayRadio.click();
	}

	public void selectSeatClass(String cl) {
		if (cl.toLowerCase().contains("first"))
			this.firstClassBox.click();
		if (cl.toLowerCase().contains("business"))
			this.businessClassBox.click();
		if (cl.toLowerCase().contains("economy"))
			this.economyClassBox.click();
	}

	public void passDeparting(String depFrom) {
		new Select(depBox).selectByVisibleText(depFrom);
	}

	public void passArrival(String arrTo) {
		new Select(arrBox).selectByVisibleText(arrTo);
	}

	public void checkFirstClass() {
		firstClassBox.click();
	}

	public void clickFindFlight() {
		findFlighButton.click();
	}
}
