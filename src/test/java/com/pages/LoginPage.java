package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class LoginPage extends Utility{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}

	@FindBy(id = "password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(linkText = "Forgot Password?")
	private WebElement forgotpass;

	public WebElement getForgotpass() {
		return forgotpass;
	}

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(linkText = "New User Register Here")
	private WebElement newRegister;

	public WebElement getNewRegister() {
		return newRegister;
	}
}
