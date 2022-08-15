package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    /* Student Information Tab */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationLink;

    /* Student Information sub tabs */
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[1]/ul[1]/li")
    public List<WebElement> studentInformationBox;

    /* This method will get name of all student information sub tabs */
    public List<String> getStudentInformationMenu() {
        List<String> studentInformationMenuTabs = new ArrayList<>();
        for (WebElement studentInfoTab : studentInformationBox) {
            studentInformationMenuTabs.add(studentInfoTab.getText());
        }
        return studentInformationMenuTabs;
    }

    public HomePage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
