Feature: Invalid Credentials Login attempt


@Progression
Scenario: A User should not be able to login with invalid credentials
Given a user is on the chromatech website
When a user enters invalid credentials such as username "test@testmail.com" and password "Happy123!"
Then a user should see message "Invalid Username or Password"

