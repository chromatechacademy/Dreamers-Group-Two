package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDef {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    /** Open browser with URL */
    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

    }

    /** Entering username */
    @When("user enters valid username in Username box")
    public void user_enters_valid_username_in_Username_box() {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);

    }

    /** Entering password */
    @When("user enters valid password in Password box")
    public void user_enters_valid_password_in_Password_box() {
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);

    }

    /** Signing in */
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signInButton.click();

    }

    /** Navigating to Income module */
    @When("user clicks on the Income module")
    public void user_clicks_on_the_Income_module() {
        homePage.incomeModule.click();

    }

    /**
     * Asserting the test reqirements
     * 
     * @throws IOException
     */
    @Then("the Income module have to display the following")
    public void the_Income_module_have_to_display_the_following(String docString) throws IOException {
        Assert.assertTrue(homePage.incomeModuleMenu.getText().contentEquals(docString));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
