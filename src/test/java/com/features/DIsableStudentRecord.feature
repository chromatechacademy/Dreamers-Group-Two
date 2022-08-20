Feature: Disable Student Record


    @DRM-15
    Scenario: User disables student record
        Given User is on the home page
        And User clicks on Student Details inside student Information Module
        And User selects "SDET" in Class Name and "Git/GitHub" section name
        And User Clicks on Seatch Button
        And User clicks on "Bad Student"
        When User clicks on disable button in the top right
        Then User selects "Very Loud" Reason from the drop down and hits save
        Then Student is deleted

