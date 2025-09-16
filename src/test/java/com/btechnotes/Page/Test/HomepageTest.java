package com.btechnotes.Page.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.btechnotes.pages.HomesPage;

public class HomepageTest extends BaseTest {

	@Test(groups = { "HomePage" })
	public void testHomePageTitle() {
		HomesPage homePage = new HomesPage(driver);

		// Print title via page method
		homePage.printTitle();

		// Assertion
		Assert.assertEquals(homePage.getTitleName(), "B.Tech Notes Hub - Your Academic Success Partner",
				"Home page title does not match!");
	}
}