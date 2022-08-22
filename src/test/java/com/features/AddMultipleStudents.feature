Feature: Adding multiple students

    @Vlad @DRM-19 @Smoke @Regression

    Scenario Outline: CTSMS - An user should be able to add multiple students in one session
        Given user is on login page
        When user enters "general@teacher.com" username in the Username
        And user enters "123456" password in the Password
        And user clicks on SignIn button
        And user navigates to Student Information Module
        And user navigates to Student Admission Section
        And user enters the following data "<Admission No>", "<First Name>", "<DOB>", "<Guardian Name>", "<Guardian Phone>"
        And user clicks on save button on the Student Admission page



        Examples:

            | Admission No | First Name | DOB        | Guardian Name | Guardian Phone |
            | 9999         | Bob        | 04/01/2000 | Bill          | 12345          |
            | 9998         | Rob        | 04/02/2000 | Tim           | 23456          |
            | 9997         | Nick       | 01/01/2000 | Eric          | 345667         |

    
    @Vlad @DRM-19 @Smoke @Regression
    Scenario: Search and Delete Students
        Given user is on login page
        When user enters "general@teacher.com" username in the Username
        And user enters "123456" password in the Password
        And user clicks on SignIn button
        And user navigates to Student Information Module of Home Page
        And user clicks on Student Details section of Home page
        And user clicks on SDET option of the Student Details class
        And user clicks on right Search button
        Then students with admission numbers "9999", "9998", "9997" have to be displayed
        And user navigates to Bulk Delete section of Student Information module
        And user selects SDET option in class section in Bulk Delete module
        And user clicks on Search button
        And user selects students with unique admission numbers "9999", "9998", "9997"
        And user clicks on Delete button
        Then students with unique admission number "9999", "9998", "9997" shall not be displayed on class List