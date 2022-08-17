package com.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import com.pages.HomePage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class studentInformationModuleStepDef {

    HomePage homePage = new HomePage();

    @When("a teacher or admin clicks on Student Information menu on the left navigation section")
    public void a_teacher_or_admin_clicks_on_Student_Information_menu_on_the_left_navigation_section()
            throws InterruptedException {
        homePage.studentInformationLink.click();
        Thread.sleep(4000);
        CucumberLogUtils.logScreenShot();

    }

    @Then("a teacher or admin can see the following menu")
    public void a_teacher_or_admin_can_see_the_following_menu(DataTable studentInformationMenu) throws IOException {
        List<String> expectedModules = studentInformationMenu.asList();
        List<String> actualModules = homePage.getStudentInformationMenu();
        Assert.assertEquals(actualModules, expectedModules);
        CucumberLogUtils.logExtentScreenshot();
    }
}