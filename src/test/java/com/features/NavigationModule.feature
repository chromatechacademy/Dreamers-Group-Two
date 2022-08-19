Feature: MOBILE - Navigation modules

    @Vlad @DRM24 @Smoke @Regression 
    Scenario: Navigation modules to be displayed on portal (homepage)

        Given user is on login page
        When user enters "general@teacher.com" username in the Username
        And user enters "123456" password in the Password
        And user clicks on Sign In button
        And user clicks on side bar button on home screen
        Then the side box displays with following modules
            """
            Student Information
            Fees Collection
            Income
            Expenses
            Academics
            Human Resource
            Homework
            Reports
            """