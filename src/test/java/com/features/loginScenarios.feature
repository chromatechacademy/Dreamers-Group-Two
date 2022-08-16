Feature: Login Scenarios

@Smoke @Regression @DRM-1
Scenario: Login with valid credentials
Given a teacher or admin is on CTSMS login webpage
When a teacher or admin is logging in with username "general@teacher.com" and password "123456"
Then a teacher or admin should be successfully logged-in and the webpage title is "Chroma Tech Academy"