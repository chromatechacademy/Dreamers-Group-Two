package com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
    
LoginPage LoginPage = new LoginPage();

@Given("a teacher or admin is on CTSMS login webpage")
public void a_teacher_or_admin_is_on_CTSMS_login_webpage() {
    
    WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
}

@When("a teacher or admin is logging in with username {string} and password {string}")
public void a_teacher_or_admin_is_logging_in_with_username_and_password(String username, String password) {
     CommonUtils.waitForVisibility(LoginPage.usernameTextBox);

     LoginPage.usernameTextBox.sendKeys(username);
     LoginPage.passwordTextBox.sendKeys(password);
     LoginPage.signInButton.click();

}

@Then("a teacher or admin should be successfully logged-in and the webpage title is {string}")
public void a_teacher_or_admin_should_be_successfully_logged_in_and_the_webpage_title_is(String expectedPageTitle) {
  
    String actualPageTitle = WebDriverUtils.driver.getTitle();

    Assert.assertTrue(actualPageTitle.contentEquals(expectedPageTitle));

}

}
