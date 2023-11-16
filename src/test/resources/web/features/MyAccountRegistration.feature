Feature: My  account registration


  Background:
    Given The user is in home page URL
    And The user clicks on My Account Menu

  Scenario Outline: Registration with empty data
    When The user enter "<email>" in Email Address TextBox
    And The user enter "<password>" in password TextBox
    And The user clicks on register button
    Then Registration must fail with a warning "<message>"

    Examples:
      | email                     | password | message                                      |
      | ludmilatorresg1@gmail.com |          | Error: Please enter an account password.     |
      |                           |          | Error: Please provide a valid email address. |

