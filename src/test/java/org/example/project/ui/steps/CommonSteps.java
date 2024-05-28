package org.example.project.ui.steps;

import org.example.project.ui.pages.InventoryPage;
import org.example.project.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    public CommonSteps(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    public void userLogsIn(String username, String password) {
        inventoryPage = loginPage.login(username, password);
    }

    public boolean inventoryPageIsDisplayed() {
        return inventoryPage.isInventoryDisplayed();
    }
}
