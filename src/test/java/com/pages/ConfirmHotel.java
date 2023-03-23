package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class ConfirmHotel extends Utility{
	public ConfirmHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Search Hotel")
	private WebElement searchHotel;

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	@FindBy(linkText = "Booked Itinerary")
	private WebElement itinerary;

	public WebElement getItinerary() {
		return itinerary;
	}

	@FindBy(id = "order_id_text")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id = "search_hotel_id")
	private WebElement go;

	public WebElement getGo() {
		return go;
	}

	@FindBy(name = "ids[]")
	private WebElement checkBox;

	public WebElement getCheckBox() {
		return checkBox;
	}

	@FindBy(name = "cancelall")
	private WebElement cancelAll;

	public WebElement getCancelAll() {
		return cancelAll;
	}

	@FindBy(linkText = "Logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
