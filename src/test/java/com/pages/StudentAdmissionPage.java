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






















    public StudentAdmissionPage(){

     PageFactory.initElements(WebDriverUtils.driver, this); 
    };
}
