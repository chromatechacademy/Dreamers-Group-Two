package com.stepDefinitions;

import java.io.IOException;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SampleStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage(); 

    @Given("this step can be used to specify a pre-condition")
    public void this_step_can_be_used_to_specify_a_pre_condition() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys("keysToSend");
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("User clicks fees collection")
    public void user_clicks_fees_collection() {
        homePage.feesCollectionModule.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User clicks search due fees")
    public void user_clicks_search_due_fees() {
        homePage.searchDueFeesModule.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User selects fees group {string}")
    public void user_selects_fees_group(String courseFee) {
        CommonUtils.selectDropDownValue(courseFee, homePage.feeGroupDropdown);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
