package com.btechnotes.Page.Test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        Assert.assertEquals(
            homePage.getTitleName(),
            "B.Tech Notes Hub - Your Academic Success Partner",
            "Home page title does not match!"
        );
    }

    @Test(groups = { "HomePage" }, priority = 2)
    public void testBrowseNotes() {
        HomesPage homePage = new HomesPage(driver);
        homePage.browseNotes(); // renamed for Java convention

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/notes"),
            "Browse Notes did not navigate to Notes page!"
        );
    }

    @Test(groups = { "HomePage" }, priority = 3)
    public void testLearnMore() {
        HomesPage homePage = new HomesPage(driver);
        homePage.learnMore();

        // Better to validate via URL or title rather than page source
        Assert.assertTrue(
            driver.getCurrentUrl().contains("Btech-notes"),
            "Learn More page navigation failed!"
        );
    }

    @Test(groups = { "HomePage" }, priority = 4)
    public void testStartBrowsingNote() {
        HomesPage homePage = new HomesPage(driver);
        homePage.startBrowsingNote();

        // Wait until the URL contains expected path
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean navigated = wait.until(ExpectedConditions.urlContains("notes.html")); // update with actual URL part

        Assert.assertTrue(navigated, "Start Browsing Notes did not navigate correctly!");
    }


    @Test(groups = { "HomePage" }, priority = 5)
    public void testFooterHome() {
        HomesPage homePage = new HomesPage(driver);
        homePage.footerHome();

        Assert.assertTrue(
            driver.getCurrentUrl().endsWith("index.html") || driver.getCurrentUrl().contains("Btech-notes"),
            "Footer Home navigation failed!"
        );
    }
}
