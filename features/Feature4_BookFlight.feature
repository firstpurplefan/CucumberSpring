Feature: Book Flight

  Background: User has selected flights
    Given I have selected flights
    And I am on the booking flight page

  Scenario Outline: I entered the billing details
    When I enter the first name as <firstname>
    And I enter the last name as <lastname>
    And I enter the credit card number as <creditcard>
    And I <weatherTicketLess> need a ticketless bill
    And I click on purchase button
    Then I should be on the comfirmation page

    Examples: Billing details table
      | firstname | lastname | creditcard         | weatherTicketLess |
      | "RevIT"   | "RevIT"  | "1234123412341234" | do                |
      | "RevIT1"  | "RevIT1" | "4567456745674567" | donot             |
