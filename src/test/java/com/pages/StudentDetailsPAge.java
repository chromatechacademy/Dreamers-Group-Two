package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentDetailsPAge {

    /** Right Search button */

    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchButton;

    /** Confirmation Alert */
    @FindBy(xpath = "//div[@student='alert alert-success text-left']")
    public WebElement confirmationEditAlert;

    /** Dynamic xpath of student */
    public WebElement studentDetaisEditDynamicXPATH(String uniqueAdmissionNumber) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(),'" + uniqueAdmissionNumber + "')]/following-sibling::td/a[2]"));
    }

    public StudentDetailsPAge() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
