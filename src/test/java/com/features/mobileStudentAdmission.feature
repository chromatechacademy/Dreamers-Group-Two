Feature: Verify a Chroma Tech faculty member is able to admit student via a mobile device

    Background:
        Given a teacher or admin is on CTSMS login webpage
        When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
        And user clicks on side bar button on home screen
        And a teacher or admin clicks on Student Information

    @Smoke @Regression @Elena @DRM-23 
    Scenario Outline: Adding New Student

        And a teacher or admin clicks on Student Admissions
        And a teacher or admin admits student with the information "<admissionNo>","<student_class>","<section>","<firstName>","<lastName>","<gender>","<dateOfBirth>"
        And selects Mother for guardian
        And enters guardian information "<guardianName>","<guardianPhone>"
        And a teacher or admin clicks on Save button

        Examples:
            | admissionNo | student_class | section     | firstName | lastName | gender | dateOfBirth | guardianName | guardianPhone |
            | 25031989    | SDET          | API Testing | Elena     | Ivanova  | Female | 01/01/2000  | Mom          | 000-111-1234  |


    @Smoke @Regression @Elena @DRM-23 
    Scenario: Student to be deleted
        And user navigates to Bulk Delete section on Mobile Version
        And user selects SDET option in class section in Bulk Delete module
        And user clicks on Search button
        And user selects student with unique admission number "25031989"
        And user clicks on Delete button