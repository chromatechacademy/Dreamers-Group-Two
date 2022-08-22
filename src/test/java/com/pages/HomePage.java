package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    // Student Information
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationLink;

    // Student Details 
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsElement;

    // Fees Collection
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    // Income
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    // Expenses
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    // Academics
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    // Academics dropdown menu
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement academicsModuleMenu;

    // Human Resources
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    // Homework
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeWorkModule;

    // Reports
    @FindBy(xpath = "//span[normalize-space()='Reports']")
    public WebElement reportsModule;

    /** Dropdown menu in Income Module */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement incomeModuleMenu;

    /** Dropdown Menu in Human Resourse Module */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement humanResourceModuleMenu;

    /** Class section of Academics Module */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classModule;
    /** Student Information module */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformation;
    /** Student Admission section of Student Information module */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmission;
    /** Bulk Delete module of Student Information */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;
    /** Sidebox Menu of the Home Page */
    @FindBy(xpath = "//section[@id='sibe-box']")
    public WebElement sideBox;
    /** "Hamburger" button which expands Sidebox Menu */
    @FindBy(xpath = "//a[@role='button']")
    public WebElement sideBarButton;
    /** Mobile version of Sidebox menu of the Home Page */
    @FindBy(xpath = "//ul[@class='sidebar-menu verttop']")
    public WebElement sideBoxMobile;

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
