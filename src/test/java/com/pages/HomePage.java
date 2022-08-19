package com.pages;


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
    
    /** Income Module */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;
    /** Dropdown menu in Income Module */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement incomeModuleMenu;
    /** Human Resource Module */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;
    /** Dropdown Menu in Human Resourse Module */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement humanResourceModuleMenu;
    /** Academics Module */
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;
    /** Class section of Academics Module */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classModule;

    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule; 

    @FindBy(xpath = "//a[normalize-space()='Search Due Fees']")
    public WebElement searchDueFeesModule; 

    @FindBy(xpath = "//select[@id='feegroup_id']")
    public WebElement feeGroupDropdown; 

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }


}
