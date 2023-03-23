package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class ForgotPassword extends Utility{
	public ForgotPassword() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "emailadd_recovery")
	private WebElement recovery;

	public WebElement getRecovery() {
		return recovery;
	}

	@FindBy(id = "Submit")
	private WebElement emailPass;

	public WebElement getEmailPass() {
		return emailPass;
	}

	@FindBy(id = "Reset")
	private WebElement reset;

	public WebElement getReset() {
		return reset;
	}
}
