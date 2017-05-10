package com.revit.bddtesting.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import com.revit.bddtesting.models.BookFlight;
import com.revit.bddtesting.models.FindFlight;
import com.revit.bddtesting.models.LoginPage;
import com.revit.bddtesting.models.SelectFlight;

@ContextConfiguration("classpath:cucumber.xml")
@DirtiesContext
@TestExecutionListeners(listeners = DirtiesContextTestExecutionListener.class)
public class StepDef {
	@Autowired
	WebDriver driver;

	@Autowired
	LoginPage login;

	@Autowired
	FindFlight findFlight;

	@Autowired
	SelectFlight selectFlight;

	@Autowired
	BookFlight bookFlight;
}
