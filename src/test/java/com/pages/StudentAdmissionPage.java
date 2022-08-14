package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumber;

    @FindBy(xpath = "//select[@id='class_id']//option[@value='9'][normalize-space()='SDET']")
    public WebElement classSelection;

    @FindBy(xpath = "//option[@value='14']")
    public WebElement sectionSelection;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//option[@value='Male']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@value='father']")
    public WebElement guardianElement;

    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianName;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumber;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement notUniqueAdmssionNumber;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }
}
