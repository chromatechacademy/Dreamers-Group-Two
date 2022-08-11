package com.stepDefinitions;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.IncomeModule;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleTest {

    LoginPage loginPage = new LoginPage();
    IncomeModule income = new IncomeModule();

    @Given("user is on login page and logged in with valid credetials and is on home pame")
    public void user_is_on_login_page_and_logged_in_with_valid_credetials_and_is_on_home_pame() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
        

    }

    @When("user clicks on the Income module")
    public void user_clicks_on_the_Income_module() {
        income.incomeModule.click();

    }

    @Then("the Income module have to display {string}, {string}, {string}")
    public void the_Income_module_have_to_display(String string, String string2, String string3) throws IOException {
        String actualResults = income.incomeModuleMenu.getText();
        
        String expectedResult1 = "Add Income";
        String expectedResult2 = "Search Income";
        String expectedResult3 = "Income Head";
        
        Assert.assertTrue(actualResults.contains(expectedResult1));
        Assert.assertTrue(actualResults.contains(expectedResult2));
        Assert.assertTrue(actualResults.contains(expectedResult3));

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
       


    }
}