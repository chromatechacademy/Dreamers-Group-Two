Feature: Ability to add and delete sections

@Progression 
 Scenario: CTSMS - Ability to add and delete sections
        Given the teacher is located on the CTSMS login webpage
        When the teacher uses username "general@teacher.com" and password "123456" and by expanding the Academics tab
        And the teacher clicks on Academic section
        And navigates to Sections module
        And enters the new section By entering "New Section Name" in Add Section folder and Clicks Save
        And the teacher deletes the Newly created section "New Section Name"
