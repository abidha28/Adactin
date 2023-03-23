package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;

	public static void browserLaunch(String url) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get(url);
	}

	public static void typeText(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void click(WebElement ref) {
		ref.click();
	}

	public static void dropDown(WebElement ref, String value) {
		Select s = new Select(ref);
		s.selectByVisibleText(value);
	}

	public static void alert(WebElement ref) {
		ref.click();
		driver.switchTo().alert().accept();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void printUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void getTitle() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://adactinhotelapp");
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void quit() {
		driver.quit();
	}
}
