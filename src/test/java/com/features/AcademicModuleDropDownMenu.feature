Feature: Academics module dropdown menu

@Vlad @DRM-8 @Smoke @Regression

Scenario: Academics module to include the dropdown menu
    Given user is on login page
    When user enters valid username in the Username Box
    And user enters valid password in the Password Box
    And user clicks on Sign In button
    And user navigates and clicks on Academics module
    Then the Academics module has to display the following
        """
        Class Timetable
        Teachers Timetable
        Assign Class Teacher
        Promote Students
        Subject Group
        Subjects
        Class
        Sections
        """