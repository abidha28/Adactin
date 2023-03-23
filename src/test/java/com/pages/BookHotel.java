package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Utility;

public class BookHotel extends Utility {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(name = "last_name")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(name = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(name = "cc_num")
	private WebElement creditCard;

	public WebElement getCreditCard() {
		return creditCard;
	}

	@FindBy(name = "cc_type")
	private WebElement CreditCardType;

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	@FindBy(name = "cc_exp_month")
	private WebElement expMonth;

	public WebElement getExpMonth() {
		return expMonth;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement expYear;

	public WebElement getExpYear() {
		return expYear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement ccvNum;

	public WebElement getCcvNum() {
		return ccvNum;
	}

	@FindBy(name = "book_now")
	private WebElement bookNow;

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(name = "cancel")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
}
