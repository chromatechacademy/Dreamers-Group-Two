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

    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchFilterButton;

    /** Confirmation Alert */
    @FindBy(xpath = "//div[@student='alert alert-success text-left']")
    public WebElement confirmationEditAlert;

    /** Student name on Student Details page */
    @FindBy(xpath = "//h3[@class='profile-username text-center']")
    public WebElement studentName;

    /** SDET class selection */
    @FindBy(xpath = "//select[@autocomplete='off']//option[@value='9']")
    public WebElement classSelectioElement;

    /** Dynamic xpath of edit option */
    public WebElement studentDetaisEditDynamicXPATH(String uniqueAdmissionNumber) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(),'" + uniqueAdmissionNumber + "')]/following-sibling::td/a[2]"));
    }

    /** Dynamice xpath for student name with unique addmission number */
    public WebElement studentDetaisNameDynamicXPATH(String uniqueAdmissionNumber) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(),'" + uniqueAdmissionNumber + "')]/following-sibling::td/a"));
    }

    /** Dynamice xpath for student one */
    public WebElement studentOneDynamicXPATH(String studentOne) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(),'" + studentOne + "')]"));

    }

    /** Dynamice xpath for student two */
    public WebElement studentTwoDynamicXPATH(String studentTwo) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(), '" + studentTwo + "')]"));

    }

    /** Dynamice xpath for student three */
    public WebElement studentThreeDynamicXPATH(String studentThree) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(), '" + studentThree + "')]"));

    }

    public StudentDetailsPAge() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
