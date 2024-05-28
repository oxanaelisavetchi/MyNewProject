package org.example.project.ui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.example.project.ui.pages.InventoryPage;
import org.example.project.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSteps {

    @Given("User should navigate to swag labs login page")
    public void userShouldNavigateToSwagLabsLoginPage() {
        // Implementarea pentru navigarea către pagina de login
        // Exemplu: commonSteps.userIsOnLoginPage();
    }

    @When("User enter the {string} and {string}")
    public void userEnterTheUsernameAndPassword(String username, String password) {
        // Implementarea pentru introducerea username-ului și a parolei
        // Exemplu: commonSteps.userLogsIn(username, password);
    }

    @When("User click the login button")
    public void userClickTheLoginButton() {
        // Implementarea pentru clic pe butonul de login
        // Exemplu: commonSteps.clickLoginButton();
    }

    @Then("User should navigate to Swag Labs home page")
    public void userShouldNavigateToSwagLabsHomePage() {
        // Implementarea pentru verificarea navigării pe pagina de home
        // Exemplu: assertTrue(commonSteps.inventoryPageIsDisplayed());
    }
}
