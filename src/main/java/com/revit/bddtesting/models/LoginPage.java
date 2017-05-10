package com.revit.bddtesting.models;

public interface LoginPage {
	public void passUsername(String username);

	public void passPassword(String password);

	public void clickLogin();
}
