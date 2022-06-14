@Alerts

  Feature: Handle all alerts
    Scenario: User handle all alerts
      Given user goes to demoqa webpage
      And User clicks Alerts, Frame&Windows button
      Then User clicks Alerts
      And User clicks Click me button for see alert
      And User verify You clicked a button and accept alert
      Then User clicks Click me button for  alert will appear after 5 seconds
      Then User verify This alert appeared after 5 seconds and accept alert
      And User clicks Click me button for confirm box will appear
      And User accept the alert and verify You selected Ok
      And User clicks Click me button for prompt box will appear
      Then User enters a name and accept the alert
      And User verify the alert text
      Then Close the application
