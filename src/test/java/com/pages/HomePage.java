package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {


    /* Student Information sub tabs */
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[1]/ul[1]/li")
    public List<WebElement> studentInformationBox;
    // Academics Tab
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement AcademicsLink;
    // Class sub Tab
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement ClassLink;
    /** Income Module */

    //Student Information
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationLink;

    //Fees Collection
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    //Income 
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    //Expenses
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    //Academics
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    //Human Resources
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    //Homework
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeWorkModule;

    //Reports
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
    /**Student Details Link */
    @FindBy(xpath = "(//*[@href='https://chroma.mexil.it/student/search'])[2]")
    public WebElement studentDetails;
    /*Disable Students Link */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement DisabledStudentLink;


    /* This method will get name of all student information sub tabs */
    public List<String> getStudentInformationMenu() {
        List<String> studentInformationMenuTabs = new ArrayList<>();
        for (WebElement studentInfoTab : studentInformationBox) {
            studentInformationMenuTabs.add(studentInfoTab.getText());
        }
        return studentInformationMenuTabs;
    }

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
