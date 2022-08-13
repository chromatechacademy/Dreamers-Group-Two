package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.constants.ApplicationConstants;
import com.pages.ClassPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAndDeleteClasses {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ClassPage classPage = new ClassPage();

    @Given("user is one the CTSMS login page")
    public void user_is_one_the_CTSMS_login_page() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("user enters valid username in the Username Box")
    public void user_enters_valid_username_in_the_Username_Box() {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);

    }

    @When("user enters valid password in the Password Box")
    public void user_enters_valid_password_in_the_Password_Box() {
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_Sign_In_button() {

        loginPage.signInButton.click();
    }

    @When("navigates to Academics module")
    public void navigates_to_Academics_module() {

        homePage.academicsModule.click();
        CommonUtils.waitForVisibility(homePage.academicsModule);

    }

    @When("user navigates to Class section")
    public void user_navigates_to_Class_section() {
        homePage.classModule.click();
        CommonUtils.waitForVisibility(homePage.classModule);
    }

    @When("user adds class {string}")
    public void user_adds_class(String newClass) throws IOException {
        classPage.classInputSection.sendKeys(newClass);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("user clicks on CIA Triad section")
    public void user_clicks_on_CIA_Triad_section() throws IOException {
        classPage.ciaTriadSection.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        CommonUtils.waitForVisibility(classPage.classList);
        classPage.saveButton.click();

    }

    @Then("class |{string} has to be appeared in Class List section")
    public void class_has_to_be_appeared_in_Class_List_section(String newClass) throws IOException {

        Assert.assertTrue(classPage.classList.getText().contains(newClass));
        CommonUtils.waitForVisibility(classPage.classList);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("user clicks on delete option of class {string}")
    public void user_clicks_on_delete_option_of_class(String newClass) throws InterruptedException {
        CommonUtils.waitForVisibility(classPage.classList);
        classPage.classSectionsDynamicXPATH(newClass).click();
        Thread.sleep(3000);
        CommonUtils.acceptAlert();

    }

    @Then("class {string} has to be deleted from Class List section")
    public void class_has_to_be_deleted_from_Class_List_section(String newClass) throws IOException {
        Assert.assertFalse(classPage.classList.getText().contains(newClass));

        CommonUtils.waitForVisibility(classPage.classList);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
