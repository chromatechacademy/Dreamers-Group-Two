package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

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

   

public HomePage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
