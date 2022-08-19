Feature: Student Categories


@Smoke @DRM-20 @shomiruddin94 @Regression
Scenario: Add student category 
Given User is on the chromatech website 
When User enters username "general@teacher.com"
And User enters password "123456"
And User clicks sign in 
And User clicks Student Information
And User clicks Student Categories
And User enters Category "Selenium"
And User clicks save 
Then Student Category is added 

@Smoke @DRM-20 @shomiruddin94 @Regression
Scenario: Delete Student Category 
Given User is on the chromatech website 
When User enters username "general@teacher.com"
And User enters password "123456"
And User clicks sign in 
And User clicks Student Information
And User clicks Student Categories
And User deletes Category "Selenium"
Then Student Category is deleted 