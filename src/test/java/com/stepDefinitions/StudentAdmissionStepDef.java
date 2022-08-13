package com.stepDefinitions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.web.CommonUtils;

import cucumber.api.java.en.When;

public class StudentAdmissionStepDef {

    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

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
    public void a_teacher_or_admin_admits_student_with_the_information(String admissionNo, String rollNumber, String studentClass, String section, String firstName, String lastName, String gender, String dateOfBirth, String category, String email, String admissionDate, String bloodGroup, String asOfDate, String mobileNUmber, String height, String weight) throws InterruptedException {
       studentAdmissionPage.admissionNoTextBox.sendKeys(admissionNo);
       studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
       CommonUtils.selectDropDownValue(studentClass, studentAdmissionPage.studentClass);
       Thread.sleep(3000);
       CommonUtils.waitForVisibility(studentAdmissionPage.sectionDropDown);
       CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropDown);
       Thread.sleep(3000);
       
    }

    
}
