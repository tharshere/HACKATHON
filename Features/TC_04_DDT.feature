Feature: Form validation with Data Driven

  @regression
  Scenario Outline: Validation of Form with invalid Mail
    Given the user navigates to Giftcard page
    And the user selects Birthday/Aniversary occasion
    And user enters the amount "5000" in amount section
    And user selects month and date
    Then user clicks next Button
    And user enters the invalid "<row_index>" from excel in the form
    Then user clicks the submit button

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
