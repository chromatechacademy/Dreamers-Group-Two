package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {


    //student admission
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionLink;

    //Admission no text
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextBox;


    //Roll Number text 
    @FindBy(xpath = "//input[@name='roll_no']")
    public WebElement rollNumberTextBox;

    //Student Class text
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement studentClass;

    //Section
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    //First name text
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    //Last name text
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    // Gender 
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    //Date of birth
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthTextBox;

    //Category
    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement categoryDropDown;

    //Email text
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    //Admission Date text
    @FindBy(xpath = "//input[@name='admission_date']")
    public WebElement admissionDateTextBox;

    //Admission date
    @FindBy(xpath = "//td[@class='day'][normalize-space()='1']" )
    public WebElement admissionDateSelectElement;

    //Blood group
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    //As of date text
    @FindBy(xpath = "//input[@name='measure_date']")
    public WebElement asOfDateTextBox;

    //Mobile number text
    @FindBy(xpath = "//*[@id='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    //Height text
    @FindBy(xpath = "//*[@id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    //Weight text
    @FindBy(xpath = "//*[@id='custom_fields[students][3]']")
     public WebElement weightTextBox;

    //Selects mother
    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherSelectionRadio;

    //Father name text
    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement fatherNameTextBox;

    //Father phone text
    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement fatherPhoneTextBox;

    //Father occupation text
    @FindBy(xpath = "//input[@name='father_occupation']")
    public WebElement fatherOccupation;

    //Mother name text
    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement motherNameTextBox;

    //Mother phone text
    @FindBy(xpath = "//input[@name='mother_phone']")
    public WebElement motherPhoneTextBox;

    //Mother occupation text
    @FindBy(xpath = "//input[@name='mother_occupation']")
    public WebElement motherOccupationTextBox;

    //Guardian name text
    @FindBy(xpath = "//input[@name='guardian_name']")
    public WebElement guardianNameTextBox;

    //Guardian email text
    @FindBy(xpath = "//input[@name='guardian_email']")
    public WebElement guardianEmailTextBox;

    //Guardian phone text
    @FindBy(xpath = "//input[@name='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    //Guardian occupation text
    @FindBy(xpath = "//input[@name='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    //Guardian address text
    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public WebElement guardianAddressTextBox;

    //Click save
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement successMessage;

    


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
