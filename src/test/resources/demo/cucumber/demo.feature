Feature: Working with a List
  Scenario: Appending to a List
    Given I have a List with no elements
    When I append an element "Hello"
    Then it should have 1 elements
    And that element should be "Hello"
