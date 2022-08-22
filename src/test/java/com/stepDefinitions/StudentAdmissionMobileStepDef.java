package com.stepDefinitions;

import java.io.IOException;

import com.pages.HomePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.When;

public class StudentAdmissionMobileStepDef {
    HomePage homePage = new HomePage();

    @When("user navigates to Bulk Delete section on Mobile Version")
    public void user_navigates_to_Bulk_Delete_section_on_Mobile_Version() throws InterruptedException, IOException {
        Thread.sleep(2000);
        homePage.BulkDeleteButtonMobile.click();

        CucumberLogUtils.getScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        
    }
}
