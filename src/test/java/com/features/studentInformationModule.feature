Feature: Student Information Module

@Smoke @Regression @Elena @DRM-4
Scenario: Verify Student Information module contains correct modules 
Given a teacher or admin is on CTSMS login webpage
When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
When a teacher or admin clicks on Student Information menu on the left navigation section 
Then a teacher or admin can see the following menu
|Student Details|Student Admission|Disabled Students|Bulk Delete|Student Categories|Student House|Disable Reason|
