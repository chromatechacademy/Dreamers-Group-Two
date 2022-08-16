package com.stepDefinitions;

import com.pages.ClassPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassWithSectionsStepDef {

    ClassPage classPage = new ClassPage();


    @When("a teacher or admin clicks on Academics tab on the left vertical sections")
    public void a_teacher_or_admin_clicks_on_Academics_tab_on_the_left_vertical_sections() {

    }

    @When("a teacher or admin clicks on Class tab")
    public void a_teacher_or_admin_clicks_on_Class_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("SDET class is displayed with folowing sections")
    public void sdet_class_is_displayed_with_folowing_sections(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("Cyber Security  class is displayed with the folowing sections")
    public void cyber_Security_class_is_displayed_with_the_folowing_sections(
            io.cucumber.datatable.DataTable dataTable) {

    }
}