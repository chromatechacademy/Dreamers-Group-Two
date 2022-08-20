package com.stepDefinitions;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SelectCriteriaPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DisableStudentRecordstepdef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    SelectCriteriaPage selectCriteriaPage = new SelectCriteriaPage();
    WebDriverUtils driver = new WebDriverUtils();
    

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
    }

    @Given("User clicks on Student Details inside student Information Module")
    public void user_clicks_on_Student_Details_inside_student_Information_Module() {
        CommonUtils.waitForVisibility(homePage.studentInformationButton);
        homePage.studentInformationButton.click();
        CommonUtils.waitForVisibility(homePage.studentDetailsButton);
        homePage.studentDetailsButton.click();

    }

    @Given("User selects {string} in Class Name and {string} section name")
    public void user_selects_in_Class_Name_and_section_name(String SDET, String String) throws InterruptedException {
        CommonUtils.selectDropDownValue(SDET, selectCriteriaPage.classDropDown);
        Thread.sleep(1000);
        CommonUtils.selectDropDownValue(selectCriteriaPage.sectionDropDown, "15");
        CommonUtils.waitForClickability(selectCriteriaPage.leftSearchButton);
    }

    @Given("User Clicks on Seatch Button")
    public void user_Clicks_on_Seatch_Button() throws InterruptedException {
        // CommonUtils.waitForClickability(selectCriteriaPage.leftSearchButton);
        selectCriteriaPage.leftSearchButton.click();
        // Thread.sleep(3000);
    }

    @Given("User clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
        selectCriteriaPage.student.click();
        //Thread.sleep(3000);
    }

    

    @When("User clicks on disable button in the top right")
    public void user_clicks_on_disable_button_in_the_top_right() {
        selectCriteriaPage.disableButton.click();
         CommonUtils.acceptAlert();
         
        
    }

    @Then("User selects {string} Reason from the drop down and hits save")
    public void user_selects_Reason_from_the_drop_down_and_hits_save(String string) throws InterruptedException {
        CommonUtils.selectDropDownValue(string, selectCriteriaPage.reasonDropDown);
        selectCriteriaPage.dissableStudentSaveButton.click();
        Thread.sleep(3000);
    }

    @Then("Student is deleted")
    public void student_is_deleted() {
        

    }

}