Feature: Display all headers in any one sub-menu

  @regression
  Scenario: Validating the presence of Headers
    Given the user scrolls up to Header

  @regression
  Scenario: Validating the sub-Headers
    Then the user clicks on Living storage
    Given the user scrolls up to Header

  @regression
  Scenario: Validating the sub-Headers
    Then the user clicks on table section
    Given the user scrolls up to Header

  @smoke
  Scenario: Extracting the items under sub-headers
    Given the user scrolls up to Header
    Then the user clicks on Living storage
    Then the user extracts all items under living storage

  @regression
  Scenario: Navigating the headers in Bookshelves section
    Given the user is on Bookshelves page
    And click each and every headers are navigating
