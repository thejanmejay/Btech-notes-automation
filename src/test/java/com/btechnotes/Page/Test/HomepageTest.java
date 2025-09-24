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
        homePage.printTitle();
        Assert.assertEquals(
            homePage.getTitleName(),
            "B.Tech Notes Hub - Your Academic Success Partner",
            "Home page title does not match!"
        );
    }

    @Test(groups = { "HomePage" })
    public void testBrowseNotes() {
        HomesPage homePage = new HomesPage(driver);
        homePage.browseNotes();
        Assert.assertTrue(
            driver.getCurrentUrl().contains("/notes"),
            "Browse Notes did not navigate to Notes page!"
        );
    }

    @Test(groups = { "HomePage" })
    public void testLearnMore() {
        HomesPage homePage = new HomesPage(driver);
        homePage.learnMore();
        Assert.assertTrue(
            driver.getCurrentUrl().contains("Btech-notes"),
            "Learn More page navigation failed!"
        );
    }

    @Test(groups = { "HomePage" })
    public void testStartBrowsingNote() {
        HomesPage homePage = new HomesPage(driver);
        homePage.startBrowsingNote();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("notes.html"));
        Assert.assertTrue(
            driver.getCurrentUrl().contains("/notes.html"),
            "Start Browsing Notes did not navigate correctly!"
        );
    }

    // Footer tests
    @Test(groups = { "Footer" })
    public void testFooterHome() {
        HomesPage homePage = new HomesPage(driver);
        homePage.clickFooterHome();
        Assert.assertTrue(
            driver.getCurrentUrl().endsWith("index.html") || driver.getCurrentUrl().contains("Btech-notes"),
            "Footer Home navigation failed!"
        );
    }

    @Test(groups = { "Footer" })
    public void testFooterBrowseNotes() {
        HomesPage homePage = new HomesPage(driver);
        homePage.clickFooterBrowseNotes();
        Assert.assertTrue(
            driver.getCurrentUrl().contains("/notes.html"),
            "Footer Browse Notes navigation failed!"
        );
    }

    @Test(groups = { "Footer" })
    public void testFooterUploadGuidelines() {
        HomesPage homePage = new HomesPage(driver);
        homePage.clickFooterUploadGuidelines();
        Assert.assertTrue(
            driver.getCurrentUrl().contains("upload-guidelines.html"),
            "Footer Upload Guidelines navigation failed!"
        );
    }

    @Test(groups = { "Footer" })
    public void testFooterContactUs() {
        HomesPage homePage = new HomesPage(driver);
        homePage.clickFooterContactUs();
        Assert.assertTrue(
            driver.getCurrentUrl().contains("contact.html"),
            "Footer Contact Us navigation failed!"
        );
    }
}
