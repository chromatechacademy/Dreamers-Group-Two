package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class ClassPage {
    
    public ClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
