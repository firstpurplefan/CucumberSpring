package com.revit.bddtesting.pagebeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class SuperPageBean implements InitializingBean{
	@Autowired
	WebDriver driver;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		PageFactory.initElements(driver, this);
	}
}
