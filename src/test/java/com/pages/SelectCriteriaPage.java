package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class SelectCriteriaPage {

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement leftSearchButton;


    @FindBy(xpath = "//*[contains(text(),'Bad Student')]")
    public WebElement student;

    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableButton;

    @FindBy(xpath = "//select[@name='reason']")
    public WebElement reasonDropDown;

     @FindBy(css = "body > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
    public WebElement dissableStudentSaveButton;


    public SelectCriteriaPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
