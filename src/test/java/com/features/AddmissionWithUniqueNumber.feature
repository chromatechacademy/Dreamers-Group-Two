Feature: Admission with unique number

    @DRM2-13 @Progression @Vlad
    Scenario: CTSMS - Student Admission unique admission number
        Given user is on login page
        When user enters "general@teacher.com" username in the Username
        And user enters "123456" password in the Password
        And user clicks on SignIn button
        And user navigates to Student Information Module
        And user navigates to Student Admission Section
        And user enters unique admission number "554433" in Admission No textbox
        And user selects SDET option in Class module
        And user selects API Testing option in Section module
        And user enter "Luke" in First Name module
        And user selects Male option in Gender module
        And user enters "01/01/2000" in Date of birth section
        And user clicks on Father option
        And user enters "Bill" in Guardian name section
        And user enters "111111111" in Gurdian phone
        And user clicks on save button on the Student Admission page
        And user enters uniques admission number "554433"
        And user clicks again on save button
        Then user is not able to admit new student and "The Admission No field must contain a unique value." should displays on Student Admission page
        And user navigates to Bulk Delete section of Student Information module
        And user selects SDET option in class section in Bulk Delete module
        And user clicks on Search button
        And user selects student with unique admission number "554433"
        And user clicks on Delete button
        Then student with unique admission number "554433" shall not be displayed on class List
