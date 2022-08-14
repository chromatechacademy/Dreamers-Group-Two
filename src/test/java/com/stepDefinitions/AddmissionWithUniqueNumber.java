package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.BulkDeletePage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddmissionWithUniqueNumber {

    /** Instantiating of the objects of pages */

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    /** Link to Website URL */

    @Given("user is the CTSMS login page")
    public void user_is_the_CTSMS_login_page() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
    }

    @When("user enters {string} username in the Username")
    public void user_enters_username_in_the_Username(String username) {
        loginPage.usernameTextBox.sendKeys(username);
    }

    @When("user enters {string} password in the Password")
    public void user_enters_password_in_the_Password(String password) {
        loginPage.passwordTextBox.sendKeys(password);
    }

    @When("user clicks on SignIn button")
    public void user_clicks_on_SignIn_button() {
        loginPage.signInButton.click();
    }

    @When("user navigates to Student Information Module")
    public void user_navigates_to_Student_Information_Module() {
        homePage.studentInformation.click();
        CommonUtils.waitForVisibility(homePage.studentInformation);
    }

    @When("user navigates to Student Admission Section")
    public void user_navigates_to_Student_Admission_Section() {
        homePage.studentAdmission.click();
        CommonUtils.waitForVisibility(homePage.studentAdmission);
    }

    @When("user enters unique admission number {string} in Admission No textbox")
    public void user_enters_unique_admission_number_in_Admission_No_textbox(String uniqueAdmissionNumber) {
        studentAdmissionPage.admissionNumber.sendKeys(uniqueAdmissionNumber);

    }

    @When("user selects SDET option in Class module")
    public void user_selects_SDET_option_in_Class_module() {
        CommonUtils.waitForClickability(studentAdmissionPage.classSelection);
        studentAdmissionPage.classSelection.click();

    }

    @When("user selects API Testing option in Section module")
    public void user_selects_API_Testing_option_in_Section_module() {
        CommonUtils.waitForVisibility(studentAdmissionPage.sectionSelection);
        studentAdmissionPage.sectionSelection.click();

    }

    @When("user enter {string} in First Name module")
    public void user_enter_in_First_Name_module(String firstNameOfStudent) {
        studentAdmissionPage.firstName.sendKeys(firstNameOfStudent);
    }

    @When("user selects Male option in Gender module")
    public void user_selects_Male_option_in_Gender_module() {
        studentAdmissionPage.gender.click();

    }

    @When("user enters {string} in Date of birth section")
    public void user_enters_in_Date_of_birth_section(String dob) {
        studentAdmissionPage.dateOfBirth.sendKeys(dob);
    }

    @When("user clicks on Father option")
    public void user_clicks_on_Father_option() {
        studentAdmissionPage.guardianElement.click();

    }

    @When("user enters {string} in Guardian name section")
    public void user_enters_in_Guardian_name_section(String nameOfGuardian) {
        studentAdmissionPage.guardianName.sendKeys(nameOfGuardian);
    }

    @When("user enters {string} in Gurdian phone")
    public void user_enters_in_Gurdian_phone(String phoneNumber) throws InterruptedException, IOException {
        studentAdmissionPage.guardianPhoneNumber.sendKeys(phoneNumber);
        Thread.sleep(1000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on save button on the Student Admission page")
    public void user_clicks_on_save_button_on_the_Student_Admission_page() {
        studentAdmissionPage.saveButton.click();
    }

    @When("user enters uniques admission number {string}")
    public void user_enters_uniques_admission_number(String uniqueAdmissionNumber) {
        studentAdmissionPage.admissionNumber.sendKeys(uniqueAdmissionNumber);
    }

    @When("user clicks again on save button")
    public void user_clicks_again_on_save_button() {
        studentAdmissionPage.saveButton.click();
    }

    @Then("user is not able to admit new student and {string} should displays on Student Admission page")
    public void user_is_not_able_to_admit_new_student_and_should_displays_on_Student_Admission_page(
            String invalidAdmissionNumber) throws IOException {

        Assert.assertTrue(studentAdmissionPage.notUniqueAdmssionNumber.getText().contentEquals(invalidAdmissionNumber));
        CommonUtils.waitForVisibility(studentAdmissionPage.notUniqueAdmssionNumber);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("user navigates to Bulk Delete section of Student Information module")
    public void user_navigates_to_Bulk_Delete_section_of_Student_Information_module() {
        homePage.bulkDelete.click();
    }

    @Then("user selects SDET option in class section in Bulk Delete module")
    public void user_selects_SDET_option_in_class_section_in_Bulk_Delete_module() {
        CommonUtils.waitForClickability(bulkDeletePage.classBulkDelete);
        bulkDeletePage.classBulkDelete.click();

    }

    @Then("user selects API Testing option in Section of Bulk Delete module")
    public void user_selects_API_Testing_option_in_Section_of_Bulk_Delete_module() {
        CommonUtils.waitForClickability(bulkDeletePage.sectionBulkDelete);
        bulkDeletePage.sectionBulkDelete.click();
    }

    @Then("user clicks on Search button")
    public void user_clicks_on_Search_button() throws IOException {
        bulkDeletePage.searchButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("user selects student with unique admission number {string}")
    public void user_selects_student_with_unique_admission_number(String uniqueAdmissionNumber) {
        bulkDeletePage.bulkDeleteSectionDynamicXPATH(uniqueAdmissionNumber).click();

    }

    @Then("user clicks on Delete button")
    public void user_clicks_on_Delete_button() throws InterruptedException {
        bulkDeletePage.deleteButton.click();
        Thread.sleep(1000);
        CommonUtils.acceptAlert();

    }

    @Then("student with unique admission number {string} shall not be displayed on class List")
    public void student_with_unique_admission_number_shall_not_be_displayed_on_class_List(String uniqueAdmissionNumber)
            throws IOException {
        CommonUtils.waitForVisibility(bulkDeletePage.classList);
        Assert.assertFalse(bulkDeletePage.classList.getText().contentEquals(uniqueAdmissionNumber));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
