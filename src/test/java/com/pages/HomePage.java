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
   
       public HomePage() {
           PageFactory.initElements(WebDriverUtils.driver, this);
       }
    
}
