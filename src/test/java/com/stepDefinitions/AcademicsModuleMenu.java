package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.AcademicsSectionPage;
import com.pages.HomePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsModuleMenu {

    /** Instantiating of the objects of pages */

    HomePage homePage = new HomePage();

    /** Clicking on Academics module */

    @When("user navigates and clicks on Academics module")
    public void user_navigates_and_clicks_on_Academics_module() {

        homePage.academicsModule.click();

    }

    @Then("the Academics module has to display the following")
    public void the_Academics_module_has_to_display_the_following(String academicsModuleMenu) throws IOException {
        CommonUtils.waitForVisibility(homePage.academicsModuleMenu);
        Assert.assertTrue(homePage.academicsModuleMenu.getText().contentEquals(academicsModuleMenu));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
