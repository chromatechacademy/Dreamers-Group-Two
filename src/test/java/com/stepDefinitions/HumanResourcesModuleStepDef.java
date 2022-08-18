package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HumanResourcesModuleStepDef {

    /** Instatiation of the objects of the pages */
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    /**
     * Open browser with URL
     * 
     * @throws IOException
     */
    /**  */
    @Given("user is on loginpage")
    public void user_is_on_loginpage() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Entering username into username textbox */
    @When("user enters valid username in Username textbox")
    public void user_enters_valid_username_in_Username_textbox() throws IOException {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        /** Screenshots confirming username added into username textbox */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Entering password into password textbox */
    @When("user enters valid password in Password textbox")
    public void user_enters_valid_password_in_Password_textbox() throws IOException {
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        /** Screenshots confirming password added into password textbox */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Clicking on sign in button */
    @When("user navigates and clicks on sign in button")
    public void user_navigates_and_clicks_on_sign_in_button() throws IOException {
        loginPage.signInButton.click();
    }

    /** Clicking on Human Resource module on home page */
    @When("user clicks on the Human Resouces module")
    public void user_clicks_on_the_Human_Resouces_module() {
        homePage.humanResourceModule.click();

        CommonUtils.waitForVisibility(homePage.incomeModule);

    }

    /** Verifying dropdown menu of the Human Resource module */
    @Then("the Human Resources have to display the following")
    public void the_Human_Resources_have_to_display_the_following(String humanResourcesMenuText) throws IOException {
        /** Asserting test requirements */
        Assert.assertTrue(homePage.humanResourceModuleMenu.getText().contentEquals(humanResourcesMenuText));
        /**
         * Screenshots confirming that dropdown menu of the Human Resource module
         * corresponds to test requirements
         */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
