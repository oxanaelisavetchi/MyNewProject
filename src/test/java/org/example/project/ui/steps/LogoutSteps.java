package org.example.project.ui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class LogoutSteps {

    @Given("user enters {string} and {string}")
    public void userEntersAnd(String string, String string2) {
        String url = "https://www.saucedemo.com/v1/inventory.html";

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/inventory.html");



    }
    @When("user navigated to the left sidebar")
    public void userNavigatedToTheLeftSidebar() {
        System.out.println("Inside Step - user navigated to the left sidebar");




    }
    @And("user clicks the logout button")
    public void userClicksTheLogoutButton() {
        System.out.println("Inside Step - user clicks the logout button");




    }
    @Then("user is logout from swag labs")
    public void userIsLogoutFromSwagLabs() {
        System.out.println("Inside Step - user is logout from swag labs");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/index.html");

    }

}
