package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class BulkDeletePage {

    /** Class SDET of Bulf Delete Page */
    @FindBy(xpath = "//option[@value='9']")
    public WebElement classBulkDelete;

    /** Section API Testing of Bulk Delete Page */
    @FindBy(xpath = "//option[@value='14']")
    public WebElement sectionBulkDelete;

    /** Search button */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /**
     * Dynamic XPATH for checkbox before Admission NO. Concatenated with Admission
     * number forsaw in feature file
     */

    public WebElement bulkDeleteSectionDynamicXPATH(String uniqueAdmissionNumber) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(),'" + uniqueAdmissionNumber + "')]/preceding-sibling::td/input[@type='checkbox']"));

    }

    /** Delete button */
    @FindBy(xpath = "//button[@id='load']")
    public WebElement deleteButton;

    /** Class List with admitted students */

    @FindBy(xpath = "//div[@id='DataTables_Table_0_wrapper']")
    public WebElement classList;

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
