package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class NewRegister extends Utility {
	public NewRegister() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "re_password")
	private WebElement confirmPass;

	public WebElement getConfirmPass() {
		return confirmPass;
	}

	@FindBy(id = "full_name")
	private WebElement fullName;

	public WebElement getFullName() {
		return fullName;
	}

	@FindBy(id = "email_add")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "captcha")
	private WebElement captcha;

	public WebElement getCaptcha() {
		return captcha;
	}

	@FindBy(id = "captcha-form")
	private WebElement captchaForm;

	public WebElement getCaptchaForm() {
		return captchaForm;
	}

	@FindBy(id = "tnc_box")
	private WebElement checkBox;

	public WebElement getCheckBox() {
		return checkBox;
	}

	@FindBy(id = "Submit")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}

	@FindBy(id = "Reset")
	private WebElement resetDetails;

	public WebElement getResetDetails() {
		return resetDetails;
	}
}
