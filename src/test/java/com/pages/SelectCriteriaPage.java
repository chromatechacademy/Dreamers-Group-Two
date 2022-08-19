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




    public SelectCriteriaPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
}


}
