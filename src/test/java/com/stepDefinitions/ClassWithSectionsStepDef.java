package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pages.ClassPage;
import com.pages.HomePage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;

public class ClassWithSectionsStepDef {

    ClassPage classPage = new ClassPage();
    HomePage homePage = new HomePage();

    @Then("{string} class is displayed with folowing sections")
    public void class_is_displayed_with_folowing_sections(String classSdet, String sectionSdet) {
        Assert.assertTrue(classPage.sectionsInClassListDynamicXpath(classSdet).getText().contentEquals(sectionSdet));
    }

    @Then("{string}  class is displayed with the folowing sections")
    public void class_is_displayed_with_the_folowing_sections(String classSecurity, String sectionSecurity)
            throws IOException {
        Assert.assertTrue(
                classPage.sectionsInClassListDynamicXpath(classSecurity).getText().contentEquals(sectionSecurity));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}