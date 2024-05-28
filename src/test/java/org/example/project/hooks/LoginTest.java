package org.example.project.hooks;

import org.example.project.ui.pages.InventoryPage;
import org.example.project.ui.pages.LoginPage;
import org.example.project.utils.WevDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;


public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Before
    public void setUp() {
        WevDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        inventoryPage = loginPage.login("standard_user", "secret_sauce");
        assertTrue(inventoryPage.isInventoryDisplayed());
    }

    @Test
    public void testInvalidLogin() {
        loginPage.login("invalid_user", "wrong_password");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
