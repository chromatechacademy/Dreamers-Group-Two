package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationLink;

    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeWorkModule;

    @FindBy(xpath = "//span[normalize-space()='Reports']")
    public WebElement reportsModule;

   

public HomePage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
