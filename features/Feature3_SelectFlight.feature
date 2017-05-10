Feature: Select Flight

  Background: Logged-in user has found flights
    Given I have found flights
    And I am on the select flight page

  Scenario: I selected flight and go on
    When I click select flight
    Then I should be on book flight page
