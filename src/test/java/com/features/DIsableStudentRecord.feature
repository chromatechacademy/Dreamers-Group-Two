Feature: Disable Student Record


    @Regression @DRM-15
    Scenario: User Disables Student Record
        Given User is on the home page
        And User clicks on Student Details inside student Information Module
        And User selects "SDET" in Class Name and "Git/GitHub" section name
        And User Clicks on Search Button
        And User clicks on "Bad Student"
        When User clicks on disable button in the top right
        Then User selects "Very Loud" Reason from the drop down and enter reason notes as "Very Annoying" and hits save
        Then Student is diasbled




    @Regression @DRM-15
    Scenario: User Confirms Student Record is Disabled
        Given User clicks on Disabled Student Button inside Student Information Module
        And User Selects "SDET" in Class Name and "Git/GitHub" section name
        And User Clicks on search Button
        Then "Bad Student " is visible as diasbled





