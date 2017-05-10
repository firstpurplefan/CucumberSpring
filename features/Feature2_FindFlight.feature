Feature: Find Flight

  Background: User has logged in.
    Given I am a logged-in user
    And I am on the find flight page

  Scenario Outline: I entered the searching conditions
    When I select trip type as <triptype>
    And I enter departure city as <dep>
    And I enter arrival city as <arr>
    And I select seat class as <seatclass>
    And I click find flight button
    Then I should be on select flight page
    And The departure city should be <dep>
    And The arrival city should be <arr>
    And The seat class should be <seatclass>
    Examples: Trip details table
      | triptype     | dep      | arr      | seatclass       |
      | "Round Trip" | "Sydney" | "London" | "First"         |
      | "One Way"    | "London" | "Sydney" | "Economy Class" |
