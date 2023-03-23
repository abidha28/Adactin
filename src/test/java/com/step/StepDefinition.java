package com.step;

import org.openqa.selenium.WebDriver;

import com.base.Utility;
import com.pages.BookHotel;
import com.pages.ConfirmHotel;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Utility {
	WebDriver driver;
	LoginPage l;
	SearchHotel s;
	SelectHotel s1;
	BookHotel b;
	ConfirmHotel c;

	@Given("User is on Adactin Page")
	public void user_is_on_adactin_page() {
		browserLaunch("https://adactinhotelapp.com/");
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String user, String pass) {
		l = new LoginPage();
		l.getUser().sendKeys(user);
		l.getPass().sendKeys(pass);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		l.getLogin().click();
	}

	@Given("User enters {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and_and_and_and_and(String loc, String hotel, String type, String num,
			String dateIn, String dateOut, String adult, String child) {
		s = new SearchHotel();
		dropDown(s.getLocation(), loc);
		dropDown(s.getHotels(), hotel);
		dropDown(s.getRoomType(), type);
		dropDown(s.getRoomNums(), num);
		s.getDateIn().sendKeys(dateIn);
		s.getDateOut().sendKeys(dateOut);
		dropDown(s.getAdultsperRoom(), adult);
		dropDown(s.getChildsperRoom(), child);
	}

	@Given("User Click on Submit button")
	public void user_click_on_submit_button() {
		s.getSearch().click();
	}

	@Given("User click on radio button")
	public void user_click_on_radio_button() {
		s1 = new SelectHotel();
		s1.getSelect().click();

	}

	@Then("User click continue")
	public void user_click_continue() {
		s1.getConfirm().click();
	}
	
	@When("User enters the details {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_the_details_and_and_and_and_and_and_and(String fname, String lname, String add, String credit, String type, String month, String year, String ccv) {
		b = new BookHotel();
		b.getFirstName().sendKeys(fname);
		b.getLastName().sendKeys(lname);
		b.getAddress().sendKeys(add);
		b.getCreditCard().sendKeys(credit);
		dropDown(b.getCreditCardType(), type);
		dropDown(b.getExpMonth(), month);
		dropDown(b.getExpYear(), year);
		b.getCcvNum().sendKeys(ccv);
	}

	@Then("click booknow button")
	public void click_booknow_button() {
		b.getBookNow().click();
	}

	@Then("User Logout the webpage")
	public void user_logout_the_webpage() {
		c = new ConfirmHotel();
		c.getLogout().click();
	}
}
