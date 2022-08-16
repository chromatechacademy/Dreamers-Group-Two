Feature: Student Admissions

    @Lauren @DRM-12 @Smoke
    Scenario Outline: Student Admissions
        Given a teacher or admin is on CTSMS login webpage
        When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
        And a teacher or admin clicks on Student Information
        And a teacher or admin clicks on Student Admissions
        And a teacher or admin admits student with the information "<admissionNo>","<rollNumber>","<studentClass>","<section>","<firstName>","<lastName>","<gender>","<dateOfBirth>","<category>","<email>","<admissionDate>","<bloodGroup>","<asOfDate>","<mobileNumber>","<height>","<weight>"
        And selects Mother for guardian
        And enters guardian information "<fatherName>","<fatherPhone>","<fatherOccupation>", "<motherName>","<motherPhone>","<motherOccupation>","<guardianName>","<guardianRelation>","<guardianEmail>","<guardianPhone>","<guardianOccupation>","<guardianAddress>"
        Then student is successfully admitted and user sees "Record Saved Successfully"
        And user deletes student record with class "<studentClass>" and section "<section>" and admission no "<admissionNo>"

        Examples:
            | admissionNo | rollNumber | studentClass | section              | firstName | lastName | gender | dateOfBirth | category       | email                      | admissionDate | bloodGroup | asOfDate   | mobileNumber | height | weight | fatherName | fatherPhone  | fatherOccupation | motherName | motherPhone  | motherOccupation | guardianName | guardianRelation | guardianEmail | guardianPhone | guardianOccupation | guardianAddress    |
            | 223456      | 2468       | SDET         | Testing Fundamentals | Lauren    | Flores   | Female | 10/12/1995  | Testing sample | laurenflores23@hotmail.com | 08/01/2022    | A+         | 08/13/2022 | 7038759686 | 5'3    | 160    | Leon       | 571-911-5874 | Chef             | Rosalia    | 703-968-5412 | Chef             | Rosalia      | Mother           | TestingEmail  | 7039858547  | Chef               | Testing Address Dr |
