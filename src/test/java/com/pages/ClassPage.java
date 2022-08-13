package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class ClassPage {

    @FindBy(xpath = "//input[@id='class']")

    public WebElement classInputSection;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")

    public WebElement saveButton;

    @FindBy(xpath = "//div[@id='DataTables_Table_0_wrapper']")

    public WebElement classList;

    @FindBy(xpath = "//label[normalize-space()='CIA Triad']")

    public WebElement ciaTriadSection;

    public WebElement classSectionsDynamicXPATH(String newClass) {

        return WebDriverUtils.driver.findElement(
                By.xpath("//*[contains(text(),'" + newClass + "')]/following-sibling::td/a[2]"));

    }

    public ClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
