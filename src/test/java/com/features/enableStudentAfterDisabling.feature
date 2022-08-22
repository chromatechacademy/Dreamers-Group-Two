Feature: Ability to enable student records after disabling
    Background:
        Given a teacher or admin is on CTSMS login webpage
        When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
        And a teacher or admin clicks on Student Information

    @Smoke @Regression @Elena @DRM-16 

    Scenario Outline: Adding New Student
        And a teacher or admin clicks on Student Admissions
        And a teacher or admin admits student with the information "<admissionNo>","<student_class>","<section>","<firstName>","<lastName>","<gender>","<dateOfBirth>"
        And selects Mother for guardian
        And enters guardian information "<guardianName>","<guardianPhone>"
        And a teacher or admin clicks on Save button

        Examples:
            | admissionNo | student_class | section     | firstName | lastName | gender | dateOfBirth | guardianName | guardianPhone |
            | 25031989    | SDET          | API Testing | Elena     | Ivanova  | Female | 01/01/2000  | Mom          | 000-111-1234  |

    @Smoke @Regression @Elena @DRM-16 
    Scenario: Student to be disabled
        And a teacher or admin clicks on Student Details
        And a teacher or admin searches by keyword "25031989"
        Then a teacher or admin clicks on Student Name
        And a teacher or admin disables the Student Record
        Then Disable Reason is displayed on the Student Record

    @Smoke @Regression @Elena @DRM-16
    Scenario: Student to be enabled
        And a teacher or admin clicks on Disabled Students
        And a teacher or admin searches by keyword "25031989" on Disabled Student Page
        Then a teacher or admin clicks on Student Name on Disabled Student Page
        And a teacher or admin enables the Student Record
        Then enabled student "25031989" is displayed on the Student Details page

    @Smoke @Regression @Elena @DRM-16 
    Scenario: Student to be deleted
        And user navigates to Bulk Delete section of Student Information module
        And user selects SDET option in class section in Bulk Delete module
        And user clicks on Search button
        And user selects student with unique admission number "25031989"
        And user clicks on Delete button









