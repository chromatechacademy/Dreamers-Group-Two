package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionLink;

    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextBox;

    @FindBy(xpath = "//input[@name='roll_no']")
    public WebElement rollNumberTextBox;

    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement studentClass;

    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthTextBox;

    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement categoryDropDown;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='admission_date']")
    public WebElement admissionDateTextBox;

    @FindBy(xpath = "//td[@class='day'][normalize-space()='1']" )
    public WebElement admissionDateSelectElement;

    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath = "//input[@name='measure_date']")
    public WebElement asOfDateTextBox;

    @FindBy(xpath = "//*[@id='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//*[@id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    @FindBy(xpath = "//*[@id='custom_fields[students][3]']")
     public WebElement weightTextBox;

    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherSelectionRadio;

    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement fatherNameTextBox;

    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement fatherPhoneTextBox;

    @FindBy(xpath = "//input[@name='father_occupation']")
    public WebElement fatherOccupation;

    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement motherNameTextBox;

    @FindBy(xpath = "//input[@name='mother_phone']")
    public WebElement motherPhoneTextBox;

    @FindBy(xpath = "//input[@name='mother_occupation']")
    public WebElement motherOccupationTextBox;

    @FindBy(xpath = "//input[@name='guardian_name']")
    public WebElement guardianNameTextBox;

    @FindBy(xpath = "//input[@name='guardian_email']")
    public WebElement guardianEmailTextBox;

    @FindBy(xpath = "//input[@name='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    @FindBy(xpath = "//input[@name='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    @FindBy(xpath = "//textarea[@name='guardian_address']")
    public WebElement guardianAddressTextBox;


    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);

    };
}
