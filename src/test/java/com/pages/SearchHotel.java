package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class SearchHotel extends Utility{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}

	@FindBy(id = "room_nos")
	private WebElement roomNums;

	public WebElement getRoomNums() {
		return roomNums;
	}

	@FindBy(id = "datepick_in")
	private WebElement dateIn;

	public WebElement getDateIn() {
		return dateIn;
	}

	@FindBy(id = "datepick_out")
	private WebElement dateOut;

	public WebElement getDateOut() {
		return dateOut;
	}

	@FindBy(id = "adult_room")
	private WebElement adultsperRoom;

	public WebElement getAdultsperRoom() {
		return adultsperRoom;
	}

	@FindBy(id = "child_room")
	private WebElement childsperRoom;

	public WebElement getChildsperRoom() {
		return childsperRoom;
	}
	
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(id="Reset")
	private WebElement reset;

	public WebElement getReset() {
		return reset;
	}
}
