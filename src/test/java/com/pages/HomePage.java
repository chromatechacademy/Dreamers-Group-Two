package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {
    

     @FindBy(xpath = "//*[contains(text(),'Expenses')]")
     public WebElement expensesButton; 

     @FindBy(xpath = "//*[contains(text(),' Add Expense')]")
     public WebElement addExpenseButton; 

     @FindBy(xpath = "//*[contains(text(), 'Search Expense')]")
     public WebElement searchExpenseButton; 

     @FindBy(xpath = "//*[contains(text(), 'Expense Head')]")
     public WebElement expenseHeadButton; 

     @FindBy(xpath = "//*[contains(text(), 'Homework')]")
     public WebElement homeWorkButton; 

     @FindBy(xpath = "//*[contains(text(), ' Add Homework')]")
     public WebElement addHomeWorkButton; 

     


    










    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
}
}