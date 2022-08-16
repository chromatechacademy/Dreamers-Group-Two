package com.stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModulesStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Then("the module display with {string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_module_display_with(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports)
            throws IOException {
        Assert.assertEquals(homePage.studentInformationLink.getText(), studentInformation);
        Assert.assertEquals(homePage.feesCollectionModule.getText(), feesCollection);
        Assert.assertEquals(homePage.incomeModule.getText(), income);
        Assert.assertEquals(homePage.expensesModule.getText(), expenses);
        Assert.assertEquals(homePage.academicsModule.getText(), academics);
        Assert.assertEquals(homePage.humanResourceModule.getText(), humanResource);
        Assert.assertEquals(homePage.homeWorkModule.getText(), homework);
        Assert.assertEquals(homePage.reportsModule.getText(), reports);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
