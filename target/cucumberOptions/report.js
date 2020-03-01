$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/cl/features/CreateAccount.feature");
formatter.feature({
  "name": "Create Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create User Account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Navigate to site",
  "keyword": "Given "
});
formatter.step({
  "name": "I open Signin",
  "keyword": "When "
});
formatter.step({
  "name": "I put a mail to create a new user account and confirm",
  "keyword": "Then "
});
formatter.step({
  "name": "I put the title \u003cTITLE\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put the first name \u003cFIRST_NAME\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put the last name \u003cLAST_NAME\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I see my mail",
  "keyword": "And "
});
formatter.step({
  "name": "I put the password \u003cPASSWORD\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I select my date of birth \u003cDAY_OF_BIRTH\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my address \u003cADDRESS_FIRST_NAME\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my address \u003cADDRESS_LAST_NAME\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my company \u003cCOMPANY\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my address \u003cADDRESS\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my address cont \u003cADDRESS_CONT\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my city \u003cCITY\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I select my state \u003cSTATE\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my zipcode \u003cZIPCODE\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my country \u003cCOUNTRY\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put some additional information \u003cADDITIONAL_INFORMATION\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put home phone \u003cHOME_PHONE\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put mobile phone \u003cMOBILE_HOME\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I put my alias \u003cALIAS\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I register my account",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TITLE",
        "FIRST_NAME",
        "LAST_NAME",
        "PASSWORD",
        "DAY_OF_BIRTH",
        "ADDRESS_FIRST_NAME",
        "ADDRESS_LAST_NAME",
        "COMPANY",
        "ADDRESS",
        "ADDRESS_CONT",
        "CITY",
        "STATE",
        "ZIPCODE",
        "COUNTRY",
        "ADDITIONAL_INFORMATION",
        "HOME_PHONE",
        "MOBILE_HOME",
        "ALIAS"
      ]
    },
    {
      "cells": [
        "\"Mr.\"",
        "\"FirstName\"",
        "\"LastName\"",
        "\"123456\"",
        "\"26-06-1986\"",
        "\"Address F\"",
        "\"Address L\"",
        "\"Company\"",
        "\"Adressss\"",
        "\"Address cont\"",
        "\"New York\"",
        "\"New York\"",
        "\"00000\"",
        "\"United State\"",
        "\"Notes\"",
        "\"4443333\"",
        "\"33334444\"",
        "\"alias\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create User Account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to site",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.navigate_to_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Signin",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.i_open_Signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put a mail to create a new user account and confirm",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationSteps.i_put_a_mail_to_create_a_new_user_account_and_confirm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put the title \"Mr.\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_put_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put the first name \"FirstName\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_put_the_first_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put the last name \"LastName\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_put_the_last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my mail",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_see_my_mail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put the password \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_put_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select my date of birth \"26-06-1986\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_select_my_date_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my address \"Address F\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_put_my_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my address \"Address L\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccountSteps.i_put_my_address(String)"
});
