Feature: Classes SDET and Cyber Security should be displayed with sections

    @Smoke @Regression @Elena @DRM-11 
    Scenario: Verify SDET and Cyber Security classes contain correct sections

        Given a teacher or admin is on CTSMS login webpage
        When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
        And navigates to Academics module
        And user navigates to Class section
        Then "SDET" class is displayed with folowing sections
            """
            Testing Fundamentals
            SDLC Methodologies
            Selenium Test Automation
            Cucumber Fundamentals
            API Testing
            Git/GitHub
            Java 11 for Cool People
            Mobile Test Automation
            Accessibility Testing
            Database Testing
            """
        And "Cyber Security"  class is displayed with the folowing sections
            """
            Networking Fundamentals
            Linux Fundamentals
            CIA Triad
            Penetration Testing/Ethical Hacking
            """