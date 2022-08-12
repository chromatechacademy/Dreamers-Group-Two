package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
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

    /** Open browser with URL 
     * @throws IOException*/

    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Entering username 
     * @throws IOException*/
    @When("user enters valid username in Username box")
    public void user_enters_valid_username_in_Username_box() throws IOException {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Entering password 
     * @throws IOException*/
    @When("user enters valid password in Password box")
    public void user_enters_valid_password_in_Password_box() throws IOException {
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Signing in 
     * @throws IOException*/
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() throws IOException {
        loginPage.signInButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Navigating to Income module 
     * @throws InterruptedException*/
    @When("user clicks on the Income module")
    public void user_clicks_on_the_Income_module() throws InterruptedException {
        homePage.incomeModule.click();
        Thread.sleep(3000);
        

    }

    /**
     * Asserting the test reqirements
     * 
     * @throws IOException
     */
    @Then("the Income module have to display the following")
    public void the_Income_module_have_to_display_the_following(String incomeModuleLinks) throws IOException {
        Assert.assertTrue(homePage.incomeModuleMenu.getText().contentEquals(incomeModuleLinks));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
