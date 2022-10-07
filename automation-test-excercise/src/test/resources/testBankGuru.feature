Feature: Automation Test Exercise form Home Credit Vietnam

  @exercise
  Scenario: Verify three functions of Demo Banking system
    Given The login page of BankGuru has been loaded
    Then I verify login page is displayed
    When I input UserID as "mngr445326" and Password as "ErYsyvE"
    And I click LOGIN button
    Then I verify log in successful
    When I click "New Customer" subtab
    And I input all information
    And I click Submit button
    Then I verify customer created successful
    When I click "New Account" subtab
    And I input "Customer id" and "Initial deposit" as "777"
    And I click Submit button
    Then I verify account generated successfully