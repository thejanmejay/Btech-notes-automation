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
    private static By startBrowsingNoteBtn = By.xpath("//a[normalize-space()='Start Browsing Notes']");
    private By footerHomeBtn = By.xpath("//ul[@class='footer-links']//li//a[@href='index.html'][normalize-space()='Home']");

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
        String titleName = driver.getTitle();
        System.out.println("Title of the page is: " + titleName);
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


    public void footerHome() {
        safeClick(footerHomeBtn, "Footer Home Button");
    }
}
