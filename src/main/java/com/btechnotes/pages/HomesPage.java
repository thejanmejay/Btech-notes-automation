package com.btechnotes.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class HomesPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By browseNotesBtn = By.xpath("//a[@class='btn btn-primary']");
    private By learnMoreBtn = By.xpath("(//a[normalize-space()='Learn More'])[1]");
    private By startBrowsingNoteBtn = By.xpath("//a[normalize-space()='Start Browsing Notes']");
    private By footerHomeBtn = By.xpath("//ul[@class='footer-links']//li//a[@href='index.html'][normalize-space()='Home']");
    private By footerBrowseNotesBtn = By.xpath("//ul[@class='footer-links']//li//a[@href='notes.html'][normalize-space()='Browse Notes']");
    private By footerUploadGuidelinesBtn = By.xpath("//ul[@class='footer-links']//li//a[@href='upload-guidelines.html'][normalize-space()='Upload Guidelines']");
    private By footerContactUsBtn = By.xpath("//a[normalize-space()='Contact Us']");

    // Constructor
    public HomesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Common safe click method
    private void safeClick(By locator, String elementName) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
            element.click();
            System.out.println(elementName + " clicked");
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            System.out.println(elementName + " clicked with JS fallback");
        }
    }

    // Page Actions
    public void printTitle() {
        System.out.println("Title of the page is: " + driver.getTitle());
    }

    public String getTitleName() {
        return driver.getTitle();
    }

    public void browseNotes() {
        safeClick(browseNotesBtn, "Browse Notes Button");
    }

    public void learnMore() {
        safeClick(learnMoreBtn, "Learn More Button");
    }

    public void startBrowsingNote() {
        safeClick(startBrowsingNoteBtn, "Start Browsing Notes Button");
    }

    // Footer Actions
    public void clickFooterHome() {
        safeClick(footerHomeBtn, "Footer Home Button");
    }

    public void clickFooterBrowseNotes() {
        safeClick(footerBrowseNotesBtn, "Footer Browse Notes Button");
    }

    public void clickFooterUploadGuidelines() {
        safeClick(footerUploadGuidelinesBtn, "Footer Upload Guidelines Button");
    }

    public void clickFooterContactUs() {
        safeClick(footerContactUsBtn, "Footer Contact Us Button");
    }
}
