package com.stepDefinitions;

import java.io.IOException;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SelectCriteriaPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Disb_Stdnt_Rcrds_stepdef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    SelectCriteriaPage selectCriteriaPage = new SelectCriteriaPage();
    WebDriverUtils driver = new WebDriverUtils();

    // **** User Logs in with valid credentials and placed in the home page ****//

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
    }

    // **** User clicks on Student Details inside student Information Module ****//

    @Given("User clicks on Student Details inside student Information Module")
    public void user_clicks_on_Student_Details_inside_student_Information_Module() {
        CommonUtils.waitForVisibility(homePage.studentInformationButton);
        homePage.studentInformationButton.click();
        CommonUtils.waitForVisibility(homePage.studentDetailsButton);
        homePage.studentDetailsButton.click();

    }

    // **** User selects "SDET"" in Class Name and "Git/Github" section name ****//

    @Given("User selects {string} in Class Name and {string} section name")
    public void user_selects_in_Class_Name_and_section_name(String SDET, String String) throws InterruptedException {
        CommonUtils.selectDropDownValue(SDET, selectCriteriaPage.classDropDown);
        Thread.sleep(1000);
        CommonUtils.selectDropDownValue(selectCriteriaPage.sectionDropDown, "15");
        CommonUtils.waitForClickability(selectCriteriaPage.leftSearchButton);
    }

    // **** User Clicks on Search Button ****//

    @Given("User Clicks on Search Button")
    public void user_Clicks_on_Search_Button() throws InterruptedException {
        selectCriteriaPage.leftSearchButton.click();

    }

    // **** "User clicks on "Bad Student" ****//

    @Given("User clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
        selectCriteriaPage.student.click();

    }

    /// **** User clicks on disable button in the top right and accepts alert ****//

    @When("User clicks on disable button in the top right")
    public void user_clicks_on_disable_button_in_the_top_right() {
        selectCriteriaPage.disableButton.click();
        CommonUtils.acceptAlert();

    }

    /// **** User selects "Very Loud" Reason from the drop down and enter reason
    /// notes as "Very Annoying" and hits save ****//

    @Then("User selects {string} Reason from the drop down and enter reason notes as {string} and hits save")
    public void user_selects_Reason_from_the_drop_down_and_enter_reason_notes_as_and_hits_save(String reason,
            String note) throws InterruptedException {
        CommonUtils.selectDropDownValue(reason, selectCriteriaPage.reasonDropDown);
        selectCriteriaPage.notesBox.sendKeys(note);
        Thread.sleep(3000);
        selectCriteriaPage.dissableStudentSaveButton.click();

    }

    // **** Student is deleted ****//
    @Then("Student is diasbled")
    public void student_is_diasbled() throws IOException {
    CucumberLogUtils.logExtentScreenshot();
    CucumberLogUtils.logScreenShot();

    }

}