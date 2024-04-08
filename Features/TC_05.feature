Feature: Confirm Detail section

  @smoke
  Scenario Outline: Validating the displayed inputs with Excel inputs
    Given the user navigates to Giftcard page
    And the user selects Birthday/Aniversary occasion
    And user enters the amount "5000" in amount section
    And user selects month and date
    Then user clicks next Button
    And user enters the valid "<row_index>" from excel in the form
    Then user clicks the submit button
    Then validate the input provided with the inputs in Details section

    Examples: 
      | row_index |
      |         2 |
