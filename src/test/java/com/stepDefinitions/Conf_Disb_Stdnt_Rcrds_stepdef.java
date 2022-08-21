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
import cucumber.api.junit.Cucumber;

public class Conf_Disb_Stdnt_Rcrds_stepdef {

    WebDriverUtils driver = new WebDriverUtils();
    LoginPage loginPage = new LoginPage();
    HomePage homepage = new HomePage();
    SelectCriteriaPage selectCriteriaPage = new SelectCriteriaPage();

    //****User clicks on "Disabled Student" Button inside Student "Information" Module****//
       
        @Given("User clicks on Disabled Student Button inside Student Information Module")
            public void user_clicks_on_Disabled_Student_Button_inside_Student_Information_Module()  throws InterruptedException {
                WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
                loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
                loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
                loginPage.signInButton.click();
                homepage.studentInformationButton.click();
                Thread.sleep(1000);
                homepage.disabledStudentsButton.click();

    }
    //****User Selects "SDET" in Class Name and "Git/GitHub" section name****//
        
        @Given("User Selects {string} in Class Name and {string} section name")
            public void user_Selects_in_Class_Name_and_section_name(String SDET, String string2) throws InterruptedException {
                CommonUtils.selectDropDownValue(SDET, selectCriteriaPage.classDropDown);
                Thread.sleep(2000);
                CommonUtils.selectDropDownValue(selectCriteriaPage.sectionDropDown, "15");

    }
    //****User Clicks on search Button****//
        
        @Given("User Clicks on search Button")
             public void user_Clicks_on_search_Button() throws InterruptedException {
                CommonUtils.waitForVisibility(selectCriteriaPage.leftSearchButton);
                selectCriteriaPage.leftSearchButton.click();

    }
    //**** "BAD STUDENT" is visible as diasbled****//

        @Then("{string} is visible as diasbled")
             public void is_visible_as_diasbled(String string) throws IOException {
                CucumberLogUtils.logScreenShot();
                CucumberLogUtils.logExtentScreenshot();

    }
}