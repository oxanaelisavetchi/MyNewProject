package org.example.project.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class CommonPage {

    WebDriver driver;
    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void clickElement(By locator) {
        findElement(locator).click();
    }

    public void enterText(By locator, String text) {
        findElement(locator).sendKeys(text);
    }


//    public abstract void enterTextInField(String text, String fieldName);
}
