@Interactions

Feature: Drag and Drop to the box
  Scenario: Interactions activities
    Given user goes to demoqa webpage
    And user clicks Interactions button
    Then user clicks droppable button
    And user drag and drop drag me box to the drop me box
    Then user verify Dropped!
    Then Close the application



