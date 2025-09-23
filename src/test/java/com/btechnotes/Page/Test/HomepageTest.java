package com.btechnotes.Page.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.btechnotes.pages.HomesPage;

public class HomepageTest extends BaseTest {

	@Test(groups = { "HomePage" }, priority = 1)
	public void testHomePageTitle() {
		HomesPage homePage = new HomesPage(driver);

		// Print title via page method
		homePage.printTitle();

		// Assertion
		Assert.assertEquals(homePage.getTitleName(), "B.Tech Notes Hub - Your Academic Success Partner",
				"Home page title does not match!");
	}

	@Test(groups = { "HomePage" })
	public void testBrowseNotes() {
		HomesPage homePage = new HomesPage(driver);
		homePage.BrowseNotes();

		Assert.assertTrue(driver.getCurrentUrl().contains("/notes"), "Browse Notes did not navigate to Notes page!");
	}

	@Test(groups = { "HomePage" })
	public void testLearnMore() {
		HomesPage homePage = new HomesPage(driver);
		homePage.LearnMore();

		// Example assertion: page contains expected content after Learn More
		Assert.assertTrue(driver.getPageSource().contains("/Btech-notes"), "Learn More page content not displayed!");
	}

	@Test(groups = { "HomePage" })
	public void testStartBrowsingNote() {
		HomesPage homePage = new HomesPage(driver);
		homePage.StartBrowsingNote();

		Assert.assertTrue(driver.getCurrentUrl().contains("/notes.html"),
				"Start Browsing Notes did not navigate correctly!");
	}
	@Test(groups = { "HomePage" })
	public void testFooterHome() {
		HomesPage homePage = new HomesPage(driver);
		homePage.FooterHome();
		Assert.assertTrue(driver.getCurrentUrl().contains("Btech-notes/"));

	}
}
