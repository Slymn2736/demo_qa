@Widgets

Feature: Hover the boxes
  Scenario: Hover and verify the boxes
    Given user goes to demoqa webpage
    And user clicks widgets button
    Then user clicks tool tips button
    And user hover over the Hover me to see button
    Then verify You Hovered Over the button is displayed
    Then user hover over the Hover me to see text field
    Then verify You hovered the text field is displayed
    Then Close the application