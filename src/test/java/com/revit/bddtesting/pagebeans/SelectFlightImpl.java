package com.revit.bddtesting.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Repository;

import com.revit.bddtesting.models.SelectFlight;

/**
 * SelectFlight class. This is a page model including the web elements on this
 * page.
 */
@Repository("selectFlightBean")
public class SelectFlightImpl extends SuperPageBean implements SelectFlight {
	@FindBy(name = "reserveFlights")
	private WebElement selectFlightsButton;

	@FindBy(name = "fromPort")
	private WebElement fromPortValue;

	@FindBy(name = "toPort")
	private WebElement toPortValue;

	@FindBy(name = "servClass")
	private WebElement servClassValue;

	public void clickSelectFlight() {
		selectFlightsButton.click();
	}

	public String readFromPort() {
		return fromPortValue.getAttribute("value");
	}

	public String readToPort() {
		return toPortValue.getAttribute("value");
	}

	public String readServClass() {
		return servClassValue.getAttribute("value");
	}
}
