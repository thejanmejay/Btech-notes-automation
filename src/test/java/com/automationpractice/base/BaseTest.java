package com.automationpractice.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.automationpractice.utils.DriverFactory;

public class BaseTest {
	protected WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setUp(@Optional("chrome") String browser) {
	    driver = DriverFactory.initDriver(browser);
	    driver.get("https://thejanmejay.github.io/Btech-notes/");
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
