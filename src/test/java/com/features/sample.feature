Feature: Sample


    # NOTE: YOU DO NOT NEED TO FOLLOW THE BELOW RULES BY FORCE, REMEMBER,
    #THE MAIN GOAL OF WRITING CUCUMBER SCENARIOS IS TO MAKE THE SCENARIO MAKE SENSE

    #WRITE YOUR SCENARIOS IN THIRD PERSON POINT OF VIEW(THE USERS POINT OF VIEW - NOT YOURS)
    @SampleRun
    Scenario: Sample scenario
       Given a teacher or admin is on CTSMS login webpage
       When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
       And User clicks fees collection 
       And User clicks search due fees
       And User selects fees group "10"
    

    #USE SCENARIOS/SCENARIO OUTLINES TO HARDCODE
    Scenario: Example of hardcoding in scenario
        Given user is on the home page
        When user logs in with username "general@teacher.com" and password "123456"
        Then page displays with title "sample title"

    #PERFORM DATA DRIVEN TESTING USING A SCENARIO OUTLINE
    #EXECUTE THE SAME TEST CASE WITH DIFFERENT SETS OF DATA
    Scenario Outline: Sample of scenario outline - login with different usernames and passwords
        Given user is on the home page
        When users logs in with username "<username>" and password "<password>"
        Then page displays with title "sample title"

            | username             | password |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |



