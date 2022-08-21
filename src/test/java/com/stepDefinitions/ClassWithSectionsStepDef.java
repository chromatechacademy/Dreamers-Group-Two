package com.stepDefinitions;

import com.pages.ClassPage;
import com.pages.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassWithSectionsStepDef {

    ClassPage classPage = new ClassPage();
    HomePage homePage = new HomePage();

    @When("a teacher or admin clicks on Academics tab on the left vertical sections")
    public void a_teacher_or_admin_clicks_on_Academics_tab_on_the_left_vertical_sections() {
        homePage.AcademicsLink.click();
    }

    @When("a teacher or admin clicks on Class tab")
    public void a_teacher_or_admin_clicks_on_Class_tab() {
        
    homePage.ClassLink.click();
    }

    @Then("SDET class is displayed with folowing sections")
    public void sdet_class_is_displayed_with_folowing_sections(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("Cyber Security  class is displayed with the folowing sections")
    public void cyber_Security_class_is_displayed_with_the_folowing_sections(
            io.cucumber.datatable.DataTable dataTable) {

    }
}