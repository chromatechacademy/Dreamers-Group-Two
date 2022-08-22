package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.BulkDeletePage;
import com.pages.HomePage;
import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPAge;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.JavascriptUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddMultipleStudents {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPAge studentDetailsPAge = new StudentDetailsPAge();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();
    HomePage homePage = new HomePage();

    @When("user enters the following data {string}, {string}, {string}, {string}, {string}")
    public void user_enters_the_following_data(String admissionNo, String firstName, String dob, String guardianName,
            String guardianPhone) throws InterruptedException {

        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        CommonUtils.waitForClickability(studentAdmissionPage.classSelection);
        studentAdmissionPage.classSelection.click();
        CommonUtils.waitForClickability(studentAdmissionPage.sectionSelection);
        studentAdmissionPage.sectionSelection.click();
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        CommonUtils.waitForClickability(studentAdmissionPage.gender);
        studentAdmissionPage.gender.click();
        studentAdmissionPage.dateOfBirthTextBox.sendKeys(dob);
        studentAdmissionPage.guardianElement.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
        Thread.sleep(1000);

    }

    @When("user navigates to Student Information Module of Home Page")
    public void user_navigates_to_Student_Information_Module_of_Home_Page() throws InterruptedException {
        homePage.studentInformationLink.click();
        Thread.sleep(2000);
    }

    @When("user clicks on Student Details section of Home page")
    public void user_clicks_on_Student_Details_section_of_Home_page() {
        homePage.studentDetailsElement.click();
    }

    @When("user clicks on SDET option of the Student Details class")
    public void user_clicks_on_SDET_option_of_the_Student_Details_class() {
        CommonUtils.waitForClickability(studentDetailsPAge.classSelectioElement);
        studentDetailsPAge.classSelectioElement.click();
    }

    @When("user clicks on right Search button")
    public void user_clicks_on_right_Search_button() {
        studentDetailsPAge.searchFilterButton.click();

    }

    @Then("students with admission numbers {string}, {string}, {string} have to be displayed")
    public void students_with_admission_numbers_have_to_be_displayed(String studentOne, String studentTwo,
            String studentThree) throws IOException {
        JavascriptUtils.scrollIntoView(studentDetailsPAge.studentThreeDynamicXPATH(studentThree));
        JavascriptUtils.drawRedBorder(studentDetailsPAge.studentOneDynamicXPATH(studentOne));
        JavascriptUtils.drawRedBorder(studentDetailsPAge.studentTwoDynamicXPATH(studentTwo));
        JavascriptUtils.drawRedBorder(studentDetailsPAge.studentThreeDynamicXPATH(studentThree));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("user selects students with unique admission numbers {string}, {string}, {string}")
    public void user_selects_students_with_unique_admission_numbers(String uniqueAdmissionNoOne,
            String uniqueAdmissionNoTwo, String uniqueAdmissionNoThree) throws IOException {
        bulkDeletePage.bulkDeleteDynamicXpath(uniqueAdmissionNoOne).click();
        bulkDeletePage.bulkDeleteDynamicXpath(uniqueAdmissionNoTwo).click();
        bulkDeletePage.bulkDeleteDynamicXpath(uniqueAdmissionNoThree).click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("students with unique admission number {string}, {string}, {string} shall not be displayed on class List")
    public void students_with_unique_admission_number_shall_not_be_displayed_on_class_List(String studentOne,
            String studentTwo, String studentThree) throws IOException {
        CommonUtils.waitForVisibility(bulkDeletePage.classList);
        Assert.assertFalse(bulkDeletePage.classList.getText().contentEquals(studentOne));
        Assert.assertFalse(bulkDeletePage.classList.getText().contentEquals(studentTwo));
        Assert.assertFalse(bulkDeletePage.classList.getText().contentEquals(studentThree));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
