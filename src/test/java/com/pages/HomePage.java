package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule; 

    @FindBy(xpath = "//*[contains(text(),' Student Categories')]")
    public WebElement studentCategoriesModule; 

    @FindBy(xpath = "//*[@id='category']")
    public WebElement createCategoryTextbox; 

    public HomePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
