package com.stepDefinitions;

import com.pages.AcademicsSectionPage;
import com.pages.AddDeleteSectionsPage;
import com.pages.LoginPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddDeleteSectionSteps {

    LoginPage loginPage = new LoginPage();
    AddDeleteSectionsPage addDeleteSection = new AddDeleteSectionsPage();
    AcademicsSectionPage academicsSectionPage = new AcademicsSectionPage();

    @Given("the teacher is located on the CTSMS login webpage")
    public void the_teacher_is_located_on_the_CTSMS_login_webpage() {

        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");

    }

    @When("the teacher uses username {string} and password {string} and by expanding the Academics tab")
    public void the_teacher_uses_username_and_password_and_by_expanding_the_Academics_tab(String username, String password) {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }

    @When("the teacher clicks on Academic section")
    public void the_teacher_clicks_on_Academic_section() {

        addDeleteSection.academicsSection.click();

    }

    @When("navigates to Sections module")
    public void navigates_to_Sections_module() throws InterruptedException {
        Thread.sleep(500);
        addDeleteSection.sectionModule.click();

    }

    @When("enters the new section By entering {string} in Add Section folder and Clicks Save")
    public void enters_the_new_section_By_entering_in_Add_Section_folder_and_Clicks_Save(String NewSection)
            throws InterruptedException {

        addDeleteSection.newSectionField.sendKeys(NewSection);
        AddDeleteSectionsPage.SaveNewSectionBTN.click();
        Thread.sleep(2000);

    }

    @When("the teacher deletes the Newly created section {string}")
    public void the_teacher_deletes_the_Newly_created_section(String NewSection) throws InterruptedException {

        academicsSectionPage.dynamicSectionXpath(NewSection).click();
        Thread.sleep(2000);
        CommonUtils.acceptAlert();

    }

}
