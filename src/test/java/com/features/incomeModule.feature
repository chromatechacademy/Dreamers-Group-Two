Feature: Income Module

@IncomeModuleTest
Scenario: Income Module Assertion

# In the following scenario, the Income Module of ChromaTech website have to be tested by asserting the iclusion of:
# - Add Income
# - Search Income
# - Income Head

Given user is on login page and logged in with valid credetials and is on home pame
When user clicks on the Income module
Then the Income module have to display "<Add Income>", "<Search Income>", "<Income Head>"