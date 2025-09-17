package com.btechnotes.pages;

import org.openqa.selenium.WebDriver;

public class HomesPage {
	private WebDriver driver;

	// Constructor
	public HomesPage(WebDriver driver) {
		this.driver = driver;
	}

	// Page Actions
	public void printTitle() {
		String titleName = driver.getTitle();
		System.out.println("Title of the page is: " + titleName);
	}

	// Optional: method to return title
	public String getTitleName() {
		return driver.getTitle();
	}
}
