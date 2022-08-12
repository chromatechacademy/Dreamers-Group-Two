Feature: Income Module

<<<<<<< HEAD
    @Progression
    Scenario: Income Module Assertion

        # In the following scenario, the Income Module of ChromaTech website have to be tested by asserting the iclusion of:
        # - Add Income
        # - Search Income
        # - Income Head

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
=======
@IncomeModuleTest
Scenario: Income Module Assertion

# In the following scenario, the Income Module of ChromaTech website have to be tested by asserting the iclusion of:
# - Add Income
# - Search Income
# - Income Head

Given user is on login page and logged in with valid credetials and is on home pame
When user clicks on the Income module
Then the Income module have to display "<Add Income>", "<Search Income>", "<Income Head>"
>>>>>>> d092d9c39aaf36422690565650eab7c2d3877e0d
