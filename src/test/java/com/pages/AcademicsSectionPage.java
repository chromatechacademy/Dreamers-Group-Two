package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class AcademicsSectionPage {

    // Sections link
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsLink;

    // Sections text box
    @FindBy(xpath = "//input[@name='section']")
    public WebElement sectionsTextBox;

    // Sections save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement sectionsSaveButton;

    // USE THIS METHOD TO IDENTIFY THE SECTION NAME IN SECTIONS PAGE TABLE @param
    // classSection @return
    public WebElement classSectionsDynamicXPATH(String classSection) {

        return WebDriverUtils.driver.findElement(
                By.xpath("//tr/td[contains(text(),'" + classSection + "')]/following-sibling::td/a[2]"));

    }

public WebElement dynamicSectionXpath(String newSection) {
    return WebDriverUtils.driver.findElement(By.xpath("//td[contains(text(),'" + newSection + "')]/following-sibling::td/a[2]"));

}

    public AcademicsSectionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
