package com.revit.bddtesting.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Repository;

import com.revit.bddtesting.models.LoginPage;

/**
 * HomePage class. This is a page model including the web elements on this page.
 */
@Repository("loginPageBean")
public class LoginPageBean extends SuperPageBean implements LoginPage{
	@FindBy(name = "userName")
	private WebElement usernameBox;

	@FindBy(name = "password")
	private WebElement passwordBox;

	@FindBy(name = "login")
	private WebElement loginButton;
	
	public void passUsername(String username) {
		usernameBox.sendKeys(username);
	}

	public void passPassword(String password) {
		passwordBox.sendKeys(password);
	}

	public void clickLogin() {
		loginButton.click();
	}

	/**
	 * Login with a pair of given username and password
	 * 
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		this.passUsername(username);
		this.passPassword(password);
		this.clickLogin();
	}
}
