Feature: Adding and Deleting Classes

    Background: Login and navigate to class section
        Given user is one the CTSMS login page
        When user enters valid username in the Username Box
        And user enters valid password in the Password Box
        And user clicks on Sign In button
        And navigates to Academics module
        And user navigates to Class section



    @Vlad @DRM2-18 @Smoke
    Scenario: CTSMS - Adding Class
        And user adds class "DREAMERS GROUP 2"
        And user clicks on CIA Triad section
        And user clicks on save button
        Then class "DREAMERS GROUP 2" has to be appeared in Class List section


    @DRM2-18 @Vlad @Smoke
    Scenario: CTSMS - Deleting Class
        And user clicks on delete option of class "DREAMERS GROUP 2"
        Then class "DREAMERS GROUP 2" has to be deleted from Class List section

