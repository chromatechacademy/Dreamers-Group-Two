Feature: Student Categories


@Progression
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


#Given user is on homepage (How to automate)
