package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {
    /** Andmission No textbox */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumber;
    /** SDET class selection of Student Admission Page */
    @FindBy(xpath = "//select[@id='class_id']//option[@value='9'][normalize-space()='SDET']")
    public WebElement classSelection;
    /** API Testing selection of Student Admission Page */
    @FindBy(xpath = "//option[@value='14']")
    public WebElement sectionSelection;
    /** First Name textbox */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;
    /** Option 'Male' of the Gender selection */
    @FindBy(xpath = "//option[@value='Male']")
    public WebElement gender;
    /** Date of birth text box */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirth;
    /** Farther radio button of Guardian options selection */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement guardianElement;
    /** Guardian name textbox */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianName;
    /** Guardian Phone Number textbox */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumber;
    /** Save button of Student admission page */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;
    /**
     * The warning message below Admission No textbox. Appears only if entering the
     * admission number of student that has been already admitted
     */

    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement notUniqueAdmssionNumber;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }
}
