package org.example.project.ui.steps;

import org.example.project.ui.pages.InventoryPage;
import org.example.project.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;


public class Helper {
    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    public Helper(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        this.inventoryPage = new InventoryPage(driver);
    }

    public Object getCurrentPage() {
        if (isLoginPage()) {
            return loginPage;
        } else if (isInventoryPage()) {
            return inventoryPage;
        }
        return null; // sau aruncă o excepție, în funcție de cum vrei să tratezi această situație
    }

    private boolean isLoginPage() {
        // logică pentru a determina dacă pagina curentă este pagina de login
        return driver.getCurrentUrl().contains("index.html");
    }

    private boolean isInventoryPage() {
        // logică pentru a determina dacă pagina curentă este pagina de inventar
        return driver.getCurrentUrl().contains("inventory.html") && inventoryPage.isInventoryDisplayed();
    }
}
