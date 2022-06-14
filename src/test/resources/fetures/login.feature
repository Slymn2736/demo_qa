@LoginPage

Feature: Login the webpage
  Scenario: User login the page
    Given User goes to webpage
    And User clicks the User Name box and enters a valid User Name
    And User clicks the password box and enters a valid password
    And User clicks the login button
    Then Close the application