Feature: Student Admissions

    
    Scenario Outline: Student Admissions
        Given a teacher or admin is on CTSMS login webpage
        When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
        And a teacher or admin clicks on Student Information
        And a teacher or admin clicks on Student Admissions
        And a teacher or admin admits student with the information "<admissionNo>","<rollNumber>","<studentClass>","<section>","<firstName>","<lastName>","<gender>","<dateOfBirth>","<category>","<email>","<admissionDate>","<bloodGroup>","<asOfDate>","<mobileNumber>","<height>","<weight>"
        And selects Mother for guardian
        And enters guardian information "<fatherName>","<fatherPhone>","<fatherOccupation>", "<motherName>","<motherPhone>","<motherOccupation>","<guardianName>","<guardianRelation>","<guardianEmail>","<guardianPhone>","<guardianOccupation>","<guardianAddress>"

        Examples:
            | admissionNo | rollNumber | studentClass | section              | firstName | lastName | gender | dateOfBirth | category       | email                      | admissionDate | bloodGroup | asOfDate   | mobileNumber | height | weight | fatherName | fatherPhone  | fatherOccupation | motherName | motherPhone  | motherOccupation | guardianName | guardianRelation | guardianEmail | guardianPhone | guardianOccupation | guardianAddress    |
            | 123456      | 2468       | SDET         | Testing Fundamentals | Lauren    | Flores   | Female | 10/12/1995  | Testing sample | laurenflores23@hotmail.com | 08/01/2022    | A+         | 08/13/2022 | 703-875-9686 | 5'3    | 160    | Leon       | 571-911-5874 | Chef             | Rosalia    | 703-968-5412 | Chef             | Rosalia      | Mother           | TestingEmail  | 703-985-8547  | Chef               | Testing Address Dr |
