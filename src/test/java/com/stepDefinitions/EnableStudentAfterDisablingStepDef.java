package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.DisabledStudentsPage;
import com.pages.HomePage;
import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.JavascriptUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnableStudentAfterDisablingStepDef {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    HomePage homePage = new HomePage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    DisabledStudentsPage disabledStudentPage = new DisabledStudentsPage();

    // *Creating a New Student Record */
    @When("a teacher or admin admits student with the information {string},{string},{string},{string},{string},{string},{string}")
    public void a_teacher_or_admin_admits_student_with_the_information(String admissionNo, String student_class,
            String section,
            String firstName, String lastName, String gender, String dateOfBirth) throws InterruptedException {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        CommonUtils.selectDropDownValue(student_class, studentAdmissionPage.studentClass);
        Thread.sleep(2000);
        CommonUtils.waitForVisibility(studentAdmissionPage.sectionDropDown);
        CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropDown);
        Thread.sleep(2000);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropDown);
        JavascriptUtils.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        Thread.sleep(2000);
    }

    @When("enters guardian information {string},{string}")
    public void enters_guardian_information(String guardianName, String guardianPhone) throws InterruptedException {
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
        Thread.sleep(2000);

    }

    @When("a teacher or admin clicks on Save button")
    public void a_teacher_or_admin_clicks_on_Save_button() throws InterruptedException, IOException {
        studentAdmissionPage.saveButton.click();
        Thread.sleep(2000);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    // *Search Student We have just created by admission number*/
    @When("a teacher or admin clicks on Student Details")
    public void a_teacher_or_admin_clicks_on_Student_Details() {
        homePage.studentDetails.click();
    }

    @When("a teacher or admin searches by keyword {string}")
    public void a_teacher_or_admin_searches_by_keyword(String keyword) throws InterruptedException, IOException {
        studentDetailsPage.SearchByKeywordTextBox.sendKeys(keyword);
        studentDetailsPage.SearchByKeyWordButton.click();
        Thread.sleep(2000);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    // *Disabling the Student */
    @Then("a teacher or admin clicks on Student Name")
    public void a_teacher_or_admin_clicks_on_Student_Name() throws InterruptedException {
        studentDetailsPage.StudentLink.click();
        Thread.sleep(2000);

    }

    @Then("a teacher or admin disables the Student Record")
    public void a_teacher_or_admin_disables_the_Student_Record() throws InterruptedException, IOException {
        studentDetailsPage.DisableRedButton.click();
        Thread.sleep(2000);
        CommonUtils.acceptAlert();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        Thread.sleep(2000);
        CommonUtils.selectDropDownValue("Very Loud", studentDetailsPage.DropDownReason);
        Thread.sleep(2000);
        studentDetailsPage.SaveButtonDisableStudentPopUp.click();
        Thread.sleep(2000);
    }

    // *The Student is disabled and has a Disabled reason */
    @Then("Disable Reason is displayed on the Student Record")
    public void disable_Reason_is_displayed_on_the_Student_Record() throws InterruptedException, IOException {
        Assert.assertTrue(studentDetailsPage.DisableReasonText.isDisplayed());
        Thread.sleep(2000);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    // *Search the disabled student */
    @When("a teacher or admin clicks on Disabled Students")
    public void a_teacher_or_admin_clicks_on_Disabled_Students() {
        homePage.DisabledStudentLink.click();

    }

    @When("a teacher or admin searches by keyword {string} on Disabled Student Page")
    public void a_teacher_or_admin_searches_by_keyword_on_Disabled_Student_Page(String keyword)
            throws InterruptedException, IOException {
        disabledStudentPage.SearchBoxByKeyword.sendKeys(keyword);
        disabledStudentPage.SearchButtonByKeyword.click();
        Thread.sleep(2000);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("a teacher or admin clicks on Student Name on Disabled Student Page")
    public void a_teacher_or_admin_clicks_on_Student_Name_on_Disabled_Student_Page() {
        disabledStudentPage.StudentLinkDisabledPage.click();

    }

    @Then("a teacher or admin enables the Student Record")
    public void a_teacher_or_admin_enables_the_Student_Record() throws InterruptedException, IOException {
        disabledStudentPage.EnableGreenButton.click();
        CommonUtils.acceptAlert();
        Thread.sleep(2000);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("enabled student {string} is displayed on the Student Details page")
    public void enabled_student_is_displayed_on_the_Student_Details_page(String keyword)
            throws InterruptedException, IOException {
        homePage.studentDetails.click();
        studentDetailsPage.SearchByKeywordTextBox.sendKeys(keyword);
        studentDetailsPage.SearchByKeyWordButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(studentDetailsPage.EnabledStudentExist.isDisplayed());
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
