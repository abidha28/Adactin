package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class SelectHotel extends Utility {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement select;

	public WebElement getSelect() {
		return select;
	}

	@FindBy(id = "continue")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}

	@FindBy(id = "cancel")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
}
