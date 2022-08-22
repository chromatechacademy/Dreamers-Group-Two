Feature: Expense Module

   @Regression  @DRM-7
    Scenario: User veryfing "AddExpense", "Search Expense", "Expense Head" Subcatogries inside "Expenses" module
        Given a user is on the home page
        When user clicks on "Expenses" on the side dashboard 
        Then "Expenses" tab displays "AddExpense", "Search Expense", "Expense Head" 
    
