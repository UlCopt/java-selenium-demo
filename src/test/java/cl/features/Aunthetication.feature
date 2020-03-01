Feature: Create Account

  Scenario Outline: Create User Account
    Given Navigate to site
    When Select Authentication
    Then I put the mail <MAIL>


    Examples:
      | MAIL      |
      | "asdasdAd"|