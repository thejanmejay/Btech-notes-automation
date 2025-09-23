package com.btechnotes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

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

    public String getTitleName() {
        return driver.getTitle();
    }

    public void BrowseNotes() {
        WebElement browseNotesBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        browseNotesBtn.click();
        System.out.println("Browse Notes Button Clicked");
    }

    public void LearnMore() {
        WebElement learnMoreBtn = driver.findElement(By.xpath("(//a[normalize-space()='Learn More'])[1]"));
        learnMoreBtn.click();
        System.out.println("Learn More Button Clicked");
    }

    public void StartBrowsingNote() {
        WebElement startBrowsingNotesBtn =
                driver.findElement(By.xpath("//a[normalize-space()='Start Browsing Notes']"));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", startBrowsingNotesBtn);
        startBrowsingNotesBtn.click();
        System.out.println("Start Browsing Notes Button Clicked");
    }
    
    
}
