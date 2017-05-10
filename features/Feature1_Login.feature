Feature: Login

  Background: User has an account of Mercury Travel
    Given I am a user of Book Flight
    And I am on the login page

  Scenario Outline: I entered the correct username and password
    When I enter username as <username>
    And I enter password as <password>
    Then I should be logged in

    Examples: Username and password table
      | username  | password  |
      | "adfads"  | "adfads"  |
      | "mercury" | "mercury" |