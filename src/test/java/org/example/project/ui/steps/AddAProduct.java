package org.example.project.ui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAProduct {

    WebDriver driver = null;

    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("Inside Step - browser is open");
        System.getProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();




    }
    @And("user is on main page")
    public void userIsOnMainPage() {
        System.out.println("Inside Step - user is on main page");
        System.getProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");



    }
    @When("user selects the product {string}")
    public void userSelectsTheProduct(String productName) {
        System.out.println("Inside Step - user selects the product");
        driver.findElement(By.name("inventory_item_name")).sendKeys(productName);
        driver.findElement(By.name("inventory_item_name")).submit();




    }
    @And("user clicks on {string} button")
    public void userClicksOnButton(String string) {
        System.out.println("Inside Step - user clicks on {string} button");
       driver.findElement(By.className("tn_primary btn_inventory")).sendKeys("ADD TO CART");




    }
    @Then("the product is added to the cart")
    public void the_product_is_added_to_the_cart() {
        System.out.println("Inside Step - the product is added to the cart");



    }

}
