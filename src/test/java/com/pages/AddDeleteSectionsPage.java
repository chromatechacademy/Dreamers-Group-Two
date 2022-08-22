package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class AddDeleteSectionsPage {

    //Academics Section Location
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsSection;

    // Section Module //a[normalize-space()='Sections']
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionModule;

    // New Section Name Field 
    @FindBy(xpath = "//input[@id='section']")
    public WebElement newSectionField;

    // Save New Section Name Field 
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public static WebElement SaveNewSectionBTN;


    public AddDeleteSectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }


}
