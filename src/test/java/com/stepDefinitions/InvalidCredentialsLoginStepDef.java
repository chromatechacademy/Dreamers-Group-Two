package com.stepDefinitions;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidCredentialsLoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("a user is on the chromatech website")
    public void a_user_is_on_the_chromatech_website() {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

    }

    @When("a user enters invalid credentials such as username {string} and password {string}")
    public void a_user_enters_invaalid_credentials_such_as_username_and_password(String string, String string2)
            throws InterruptedException {
        loginPage.usernameTextBox.sendKeys("test@testmail.com");
        loginPage.passwordTextBox.sendKeys("Happy123!");
        loginPage.signInButton.click();
    }

    @Then("a user should see message {string}")
    public void a_user_should_see_message(String expectedPageTitle) {
        String actualPageTitle = loginPage.invalidUsernameOrPasswordMessage.getText();
        Assert.assertTrue(expectedPageTitle.contentEquals(actualPageTitle));
        CucumberLogUtils.logScreenShot();

    }
}
