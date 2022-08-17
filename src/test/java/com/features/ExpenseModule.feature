Feature: Expense Module

   @Smoke @ExpenseModule @DRM-7
    Scenario: User Clicking on Expenses
        Given a user is on the home page
        When user clicks on 'Expenses' on the side dashboard 
        Then "Expenses" tab displays "AddExpense", "Search Expense", "Expense Head"
    
    