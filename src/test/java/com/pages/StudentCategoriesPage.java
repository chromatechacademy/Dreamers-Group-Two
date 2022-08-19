package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentCategoriesPage {

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement saveCategoryBtn; 

    @FindBy(xpath = "//*[contains(text(),'Selenium')]")
    public WebElement studentCategoryAdded; 

    @FindBy(xpath = "//td[contains(text(), 'Selenium')]/following-sibling::*/following-sibling::*/a[2]")
    public WebElement studentCategoryDelete;

    @FindBy(xpath = "//*[contains(text(),'Record Delete Successfully')]")
    public WebElement deleteSuccessfulMsg; 


    public StudentCategoriesPage(){
        PageFactory.initElements(WebDriverUtils.driver, this); 
    }
    
}
