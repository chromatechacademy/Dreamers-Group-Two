package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

       /** Income Module */
       @FindBy(xpath = "//span[normalize-space()='Income']")
       public WebElement incomeModule;
   
       @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
       public WebElement incomeModuleMenu;

       @FindBy(xpath = "//span[normalize-space()='Human Resource']")
       public WebElement humanResourceModule;

       @FindBy (xpath = "//ul[@class='treeview-menu menu-open']")
       public WebElement humanResourceModuleMenu;
   
       public HomePage() {
           PageFactory.initElements(WebDriverUtils.driver, this);
       }
    
}
