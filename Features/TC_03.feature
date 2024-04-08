Feature: Giftcard validation with inputs

  @regression
  Scenario: Validation of Giftcard is navigated
    Then the user successfully navigating to the Giftcard page

  @regression
  Scenario: Validation of birthday/Aniversary inGiftcard validation
    Given the user successfully navigating to the Giftcard page
    Then the user selects Birthday/Aniversary occasion

  @smoke
  Scenario: Validation of Giftcard validation with valid inputs
    Given the user navigates to Giftcard page
    And the user selects Birthday/Aniversary occasion
    And user enters the amount "5000" in amount section
    And user selects month and date
    Then user clicks next Button

  @regression
  Scenario: Validation of Giftcard validation with invalid inputs
    Given the user navigates to Giftcard page
    And the user selects Birthday/Aniversary occasion
    And user enters the amount "500" in amount section
    And user selects month and date
    Then user clicks next Button

  @regression
  Scenario: Validation of Giftcard validation navigates to next page
    Given the user navigates to Giftcard page
    Then the user selects Birthday/Aniversary occasion
    And user select amount input
    Then user clicks next Button
    Then user should check form page

  @regression
  Scenario: Validation of Giftcard validation with invalid inputs
    Given the user navigates to Giftcard page
    Then the user selects Birthday/Aniversary occasion
    Then user enters the preferred "-127sadfjva" in sections and selects valid inputs
    Then user clicks next Button
