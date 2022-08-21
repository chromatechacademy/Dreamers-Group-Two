package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisabledStudentsPage {
    /* Textbox Search By Keyword */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement SearchBoxByKeyword;
    /* Search Button Under Search By Keyword textbox */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement SearchButtonByKeyword;
    /*Student Name Link Finded by keyword */
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Elena')]")
    public WebElement StudentLinkDisabledPage;
    /*Enabled Button Thumbs UP */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement EnableGreenButton;

    public DisabledStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    
    }

}
