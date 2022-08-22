Feature: HomeWork Module

  
    @Smoke  @DRM-10
    Scenario: Homework module displaying sub categorie
        Given a user is on the homepage
        When user clicks on "Homework" in the side dashboard 
        Then "Homework" tab displays subcatogory "Add Homework"
    