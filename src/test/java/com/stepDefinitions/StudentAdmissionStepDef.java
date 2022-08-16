package com.stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.pages.BulkDeletePage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.web.CommonUtils;
import com.web.JavascriptUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDef {

    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @When("a teacher or admin clicks on Student Information")
    public void a_teacher_or_admin_clicks_on_Student_Information() {
        homePage.studentInformationLink.click();

    }

    @When("a teacher or admin clicks on Student Admissions")
    public void a_teacher_or_admin_clicks_on_Student_Admissions() {
        CommonUtils.waitForVisibility(studentAdmissionPage.studentAdmissionLink);
        studentAdmissionPage.studentAdmissionLink.click();

    }

    @When("a teacher or admin admits student with the information {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void a_teacher_or_admin_admits_student_with_the_information(String admissionNo, String rollNumber,
            String studentClass, String section, String firstName, String lastName, String gender, String dateOfBirth,
            String category, String email, String admissionDate, String bloodGroup, String asOfDate,
            String mobileNUmber, String height, String weight) throws InterruptedException {
        studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonUtils.selectDropDownValue(studentClass, studentAdmissionPage.studentClass);
        Thread.sleep(3000);
        CommonUtils.waitForVisibility(studentAdmissionPage.sectionDropDown);
        CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropDown);
        Thread.sleep(3000);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropDown);
        JavascriptUtils.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        CommonUtils.selectDropDownValue(category, studentAdmissionPage.categoryDropDown);
        studentAdmissionPage.emailTextBox.sendKeys(email);
        JavascriptUtils.selectDateByJS(studentAdmissionPage.admissionDateTextBox, admissionDate);
        CommonUtils.selectDropDownValue(bloodGroup, studentAdmissionPage.bloodGroupDropDown);
        JavascriptUtils.selectDateByJS(studentAdmissionPage.asOfDateTextBox, asOfDate);
        studentAdmissionPage.mobileNumberTextBox.sendKeys(mobileNUmber);
        studentAdmissionPage.heightTextBox.sendKeys(height);
        studentAdmissionPage.weightTextBox.sendKeys(weight);

    }

    @When("selects Mother for guardian")
    public void selects_Mother_for_guardian() {
        studentAdmissionPage.motherSelectionRadio.click();

    }

    @When("enters guardian information {string},{string},{string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void enters_guardian_information(String fatherName, String fatherPhone, String fatherOccupation,
            String motherName,
            String motherPhone, String motherOccupation, String guardianName, String guardianRelation,
            String guardianEmail, String guardianPhone,
            String guardianOccupation, String guardianAddress) throws InterruptedException {

        studentAdmissionPage.fatherNameTextBox.sendKeys(fatherName);
        studentAdmissionPage.fatherPhoneTextBox.sendKeys(fatherPhone);
        studentAdmissionPage.fatherOccupation.sendKeys(fatherOccupation);
        studentAdmissionPage.motherNameTextBox.sendKeys(motherName);
        studentAdmissionPage.motherPhoneTextBox.sendKeys(motherPhone);
        studentAdmissionPage.motherOccupationTextBox.sendKeys(motherOccupation);
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianEmailTextBox.sendKeys(guardianEmail);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
        studentAdmissionPage.guardianOccupationTextBox.sendKeys(guardianOccupation);
        studentAdmissionPage.guardianAddressTextBox.sendKeys(guardianAddress);
        JavascriptUtils.scrollIntoView(studentAdmissionPage.saveButton);
        studentAdmissionPage.saveButton.click();
        Thread.sleep(5000);

    }

    @Then("student is successfully admitted and user sees {string}")
    public void student_is_successfully_admitted_and_user_sees(String successMessage) throws InterruptedException {
        Thread.sleep(3000);
        CommonUtils.waitForVisibility(studentAdmissionPage.successMessage);
        Assert.assertTrue(studentAdmissionPage.successMessage.getText().contentEquals(successMessage));
        
    }

    @Then("user deletes student record with class {string} and section {string} and admission no {string}")
    public void user_deletes_student_record_with_class_and_section_and_admission_no(String className, String selectionName,
            String admissionNo) throws InterruptedException {
                CommonUtils.waitForVisibility(bulkDeletePage.bulkDeleteLink);
                bulkDeletePage.bulkDeleteLink.click();
                Thread.sleep(3000);
                CommonUtils.waitForVisibility(bulkDeletePage.classNameDropDown);
                CommonUtils.selectDropDownValue(className, bulkDeletePage.classNameDropDown);
                Thread.sleep(3000);
                CommonUtils.selectDropDownValue(selectionName, bulkDeletePage.sectionNameDropDown);
                bulkDeletePage.searchButton.click();
                Thread.sleep(1000);
                bulkDeletePage.bulkDeleteDynamicXpath(admissionNo).click();
                bulkDeletePage.deleteButton.click();
                CommonUtils.acceptAlert();
                Thread.sleep(3000);
                

    }
}
