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

    /** Instantiating of the objects of pages */

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ClassPage classPage = new ClassPage();

    /** Link to Website URL */

    @Given("user is one the CTSMS login page")
    public void user_is_one_the_CTSMS_login_page() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        /** Screenshots of Login Page */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Entering username in username textbox */
    @When("user enters valid username in the Username Box")
    public void user_enters_valid_username_in_the_Username_Box() {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);

    }

    /** Entering password in password textbox */
    @When("user enters valid password in the Password Box")
    public void user_enters_valid_password_in_the_Password_Box() {
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
    }

    /** Clicking on sign in button */
    @When("user clicks on Sign In button")
    public void user_clicks_on_Sign_In_button() {

        loginPage.signInButton.click();
    }

    /** Clicking on Academics Module
     * @throws InterruptedException */
    @When("navigates to Academics module")
    public void navigates_to_Academics_module() throws InterruptedException {

        homePage.academicsModule.click();
        /** Initiating a method that allows webpage fully loaded */
        CommonUtils.waitForVisibility(homePage.academicsModule);
        Thread.sleep(3000);
    

    }

    /** Navigating and clicking on Class Section 
     * @throws InterruptedException */
    @When("user navigates to Class section")
    public void user_navigates_to_Class_section() throws InterruptedException {
        homePage.classModule.click();
        /** Initiating a method that allows webpage fully loaded */
        CommonUtils.waitForVisibility(homePage.classModule);
        Thread.sleep(5000);
    }

    /** Adding the new class into Input TextBox */
    @When("user adds class {string}")
    public void user_adds_class(String newClass) throws IOException {
        classPage.classInputSection.sendKeys(newClass);
        /** Screenshots confirming text in Input TextBox */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Clicking on CIA Triad section in class section */
    @When("user clicks on CIA Triad section")
    public void user_clicks_on_CIA_Triad_section() throws IOException {
        classPage.ciaTriadSection.click();
        /** Schreenshots confirming CIA Triad section is checked */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /** Clicking on save button */
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        CommonUtils.waitForVisibility(classPage.classList);
        classPage.saveButton.click();

    }

    /**
     * Verifying the new class added into class section
     * 
     * @throws IOException
     */
    @Then("class {string} has to be appeared in Class List section")
    public void class_has_to_be_appeared_in_Class_List_section(String newClass) throws IOException {

        /** Asserting the new class is in class section */
        Assert.assertTrue(classPage.classList.getText().contains(newClass));
        CommonUtils.waitForVisibility(classPage.classList);
        /** Screenshots with new class added into class section */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    /** Clicking on delete option for new class */
    @When("user clicks on delete option of class {string}")
    public void user_clicks_on_delete_option_of_class(String newClass) throws InterruptedException {
        CommonUtils.waitForVisibility(classPage.classList);
        classPage.classSectionsDynamicXPATH(newClass).click();
        Thread.sleep(3000);
        /** Calling method for accepting popup deletion confirmation alert */
        CommonUtils.acceptAlert();

    }

    /** Veryfing that recently added class deeleted from class list section */
    @Then("class {string} has to be deleted from Class List section")
    public void class_has_to_be_deleted_from_Class_List_section(String newClass) throws IOException {
        /**
         * Asserting that new class successfully deleted from class list by calling
         * AssertFalse method
         */
        Assert.assertFalse(classPage.classList.getText().contains(newClass));

        CommonUtils.waitForVisibility(classPage.classList);
        /** Screenshots confirming that recently added class has been deleted */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
