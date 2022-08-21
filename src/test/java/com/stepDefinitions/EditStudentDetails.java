package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPAge;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStudentDetails {
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPAge studentDetailsPAge = new StudentDetailsPAge();

    @When("user clicks on Student Details section of Student Information Module")
    public void user_clicks_on_Student_Details_section_of_Student_Information_Module() {
        studentAdmissionPage.studentDetails.click();

    }

    @When("user clicks in Search Button")
    public void user_clicks_in_Search_Button() {
        studentDetailsPAge.searchButton.click();

    }

    @When("user clicks on Edit option of the student with admission number {string}")
    public void user_clicks_on_Edit_option_of_the_student_with_admission_number(String uniqueAdmissionNo)
            throws IOException {
        studentDetailsPAge.studentDetaisEditDynamicXPATH(uniqueAdmissionNo).click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user changes the First name to {string}")
    public void user_changes_the_First_name_to(String newName) throws IOException {
        CommonUtils.sendKeys(studentAdmissionPage.firstNameTextBox, newName);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following {string} displays on page")
    public void the_following_displays_on_page(String confirmationAlert) throws IOException {
        Assert.assertTrue(studentDetailsPAge.confirmationEditAlert.getText().contentEquals(confirmationAlert));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
}
