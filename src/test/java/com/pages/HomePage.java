package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {


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

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }


}
