package org.example.project.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    /*
    constructor clasei,care se ocupa de initializare fildurilor classei
     */
    public WebDriver driver;
    public LogoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "bm-burger-bars")
    public WebElement burger;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logout;

/*
metoda pentru apasarea butonului meniu
 */
//public void entryMenu() { userMenu.click();
//}
/*
metoda pentru apasarea butonului logout
 */
    public void userLogout() {logout.click();}

    public void checkLogoutIsDisplayed() {
        logout.isDisplayed();

    }
}
