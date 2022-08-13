package com.stepDefinitions;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentCategoriesPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentCategoriesStepDef {

    LoginPage loginPage = new LoginPage(); 
    HomePage homePage = new HomePage(); 
    StudentCategoriesPage studentCategoriesPage = new StudentCategoriesPage(); 
    

    @Given("User is on the chromatech website")
    public void user_is_on_the_chromatech_website() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        loginPage.usernameTextBox.sendKeys(username);
        
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        loginPage.passwordTextBox.sendKeys(password);
        
    }

    @When("User clicks sign in")
    public void user_clicks_sign_in() {
        loginPage.signInButton.click();
        
    }

    @When("User clicks Student Information")
    public void user_clicks_Student_Information() {
        
        homePage.studentInformationModule.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @When("User clicks Student Categories")
    public void user_clicks_Student_Categories() {
        homePage.studentCategoriesModule.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @When("User enters Category {string}")
    public void user_enters_Category(String category) {
        homePage.createCategoryTextbox.sendKeys(category);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @When("User clicks save")
    public void user_clicks_save() {
        studentCategoriesPage.saveCategoryBtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    @Then("Student Category is added")
    public void student_Category_is_added() {
       studentCategoriesPage.studentCategoryAdded.isDisplayed(); 
        
    }

}
