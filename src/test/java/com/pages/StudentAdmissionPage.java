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

    
    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);

    };
}
