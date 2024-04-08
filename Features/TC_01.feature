Feature: Display items name and price in bookshelves page

  @regression
  Scenario: Validation with invalid input
    Given the user is on Bookshelves page
    When the user enters the invalid input as search "Bwqdvnjibvoiqbvb1232"

  @smoke
  Scenario: Successfull page navigation with valid input
    When the user enters the input as search "Bookshelves with price below 15000"
    And user close the authentication popup
    And user set the catogory
    And user set price in dropdown
    Then user get the first three items name and price in console

  @regression
  Scenario: Handling popups
    And user close the authentication popup

  @regression
  Scenario: Handling dropdowns
    And user set the catogory
    And user set price in dropdown

  @regression
  Scenario: Fetching item name and details
    And user set the catogory
    And user set price in dropdown
    Then user get the first three items name and price in console
