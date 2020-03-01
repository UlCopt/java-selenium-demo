Feature: Create Account

  Scenario Outline: Create User Account
    Given Navigate to site
    When I open Signin
    Then I put a mail to create a new user account and confirm
    And I put the title <TITLE>
    And I put the first name <FIRST_NAME>
    And I put the last name <LAST_NAME>
    And I see my mail
    And I put the password <PASSWORD>
    And I select my date of birth <DAY_OF_BIRTH>
    And I put my address <ADDRESS_FIRST_NAME>
    And I put my address <ADDRESS_LAST_NAME>
    And I put my company <COMPANY>
    And I put my address <ADDRESS>
    And I put my address cont <ADDRESS_CONT>
    And I put my city <CITY>
    And I select my state <STATE>
    And I put my zipcode <ZIPCODE>
    And I put my country <COUNTRY>
    And I put some additional information <ADDITIONAL_INFORMATION>
    And I put home phone <HOME_PHONE>
    And I put mobile phone <MOBILE_HOME>
    And I put my alias <ALIAS>
    And I register my account

    Examples:
      | TITLE | FIRST_NAME | LAST_NAME     |  PASSWORD |DAY_OF_BIRTH  |ADDRESS_FIRST_NAME|ADDRESS_LAST_NAME|COMPANY    |    ADDRESS|ADDRESS_CONT     |CITY          |STATE           |ZIPCODE|COUNTRY         |ADDITIONAL_INFORMATION |HOME_PHONE|MOBILE_HOME|ALIAS|
      | "Mr." |  "FirstName"|   "LastName" |  "123456" | "26-06-1986" | "Address F"      |"Address L"      | "Company" | "Adressss"| "Address cont"  | "New York"   | "New York"     |"00000"| "United State" |"Notes"                | "4443333"| "33334444"| "alias"|