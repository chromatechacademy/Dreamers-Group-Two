Feature: Human Resource Menu

    # In the following scenario, the Human Resources Module of ChromaTech website have to be tested by veryfing the iclusion of:
    # - Add Income
    # - Search Income
    # - Income Head
    @DRM2-09
    Scenario: Human Resources Menu Verification
        Given user is on loginpage
        When user enters valid username in Username textbox
        And user enters valid password in Password textbox
        And user navigates and clicks on sign in button
        And user clicks on the Human Resouces module
        Then the Human Resources have to display the following
            """
            Staff Directory
            Staff Attendance
            Payroll
            Approve Leave Request
            Apply Leave
            Leave Type
            Teachers Rating
            Department
            Designation
            """
