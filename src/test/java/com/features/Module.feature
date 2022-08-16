Feature: CTSMS Navigation Modules

    @lauren
    Scenario: Navigation Modules
        Given a teacher or admin is on CTSMS login webpage
        When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
        Then a teacher or admin should be successfully logged-in and the webpage title is "Chroma Tech Academy"
        And the module display with "Student Information","Fees Collection","Income","Expenses","Academics","Human Resource","Homework","Reports"
