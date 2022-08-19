package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.HomePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationModuleMobile {

    HomePage homepage = new HomePage();

    @When("user clicks on side bar button on home screen")
    public void user_clicks_on_side_bar_button_on_home_screen() throws InterruptedException {
        Thread.sleep(5000);
        homepage.sideBarButton.click();
    }


    @Then("the side box displays with following modules")
    public void the_side_box_displays_with_following_modules(String navigationModule)
            throws IOException, InterruptedException {
        Thread.sleep(3000);
        System.out.println(homepage.sideBoxMobile.getText());
        Assert.assertTrue(homepage.sideBoxMobile.getText().contentEquals(navigationModule));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
