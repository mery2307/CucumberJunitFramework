package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.Assertion;
import pages.Dashboard;
import pages.LoginPage;
import utils.BaseUI;
import utils.ConfigurationReader;
import utils.Driver;

public class LoginSteps extends BaseUI {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    Dashboard dashboard = new Dashboard();

    @Given("user goes to sign in page")
    public void Mery() {
        driver.get(ConfigurationReader.getProperty("loginURL"));

    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
     waitAndSendKeys(loginPage.email, username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        waitAndSendKeys(loginPage.password, password);

    }
    @When("user enters clicks on sign in button")
    public void user_enters_clicks_on_sign_in_button() {
        waitAndClick(loginPage.singInButton);

    }
    @Then("verify user signed in successfully")
    public void verify_user_signed_in_successfully() {
        waitUntilVisible(20, dashboard.welcomeSing);
        Assertions.assertTrue(dashboard.welcomeSing.isDisplayed());
        waitAndClick(dashboard.singOutB);
    }


}
