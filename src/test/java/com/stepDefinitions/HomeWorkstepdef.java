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

public class HomeWorkstepdef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WebDriverUtils driver = new WebDriverUtils();

    @Given("a user is on the homepage")
    public void a_user_is_on_the_homepage() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
    }

    @When("user clicks on {string} in the side dashboard")
    public void user_clicks_on_in_the_side_dashboard(String string) throws InterruptedException {
        homePage.homeWorkButton.click();
        Thread.sleep(3000);

    }

    @Then("{string} tab displays {string}")
    public void tab_displays(String string, String string2) throws IOException {
        Assert.assertEquals(homePage.addHomeWorkButton.getText(), "Add Homework");
        CucumberLogUtils.logExtentScreenshot();
    }
}
