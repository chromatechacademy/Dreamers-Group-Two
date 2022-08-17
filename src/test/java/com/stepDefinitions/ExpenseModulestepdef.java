package com.stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
import cucumber.api.java.lu.wann;
import io.appium.java_client.AppiumBy.ByClassName;

public class ExpenseModulestepdef {

  LoginPage loginPage = new LoginPage();
  HomePage homePage = new HomePage();
  WebDriverUtils driver = new WebDriverUtils();

  @Given("a user is on the home page")
  public void a_user_is_on_the_home_page() {

    WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
    loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
    loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
    loginPage.signInButton.click();
  }

  @When("user clicks on {string} on the side dashboard")
   public void user_clicks_on_on_the_side_dashboard(String string) throws InterruptedException {
    CommonUtils.waitForVisibility(homePage.expensesButton);
    homePage.expensesButton.click();
    Thread.sleep(3000);
  }

  @Then("{string} tab displays {string}, {string}, {string}")
  public void tab_displays(String string, String string2, String string3, String string4) throws IOException {
    Assert.assertEquals(homePage.addExpenseButton.getText(), "Add Expense");
    Assert.assertEquals(homePage.searchExpenseButton.getText(), "Search Expense");
    Assert.assertEquals(homePage.expenseHeadButton.getText(), "Expense Head");
    CucumberLogUtils.logExtentScreenshot();
  }
}
