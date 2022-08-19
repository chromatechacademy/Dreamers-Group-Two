Feature: Income Module



    # In the following scenario, the Income Module of ChromaTech website have to be tested by asserting the iclusion of:
    # - Add Income
    # - Search Income
    # - Income Head
    @DRM2-06 @Vlad @Smoke @Regression
    Scenario: Income Module Assertion
        Given user is on login page
        When user enters valid username in Username box
        And user enters valid password in Password box
        And user clicks on sign in button
        And user clicks on the Income module
        Then the Income module have to display the following
            """
            Add Income
            Search Income
            Income Head
            """
