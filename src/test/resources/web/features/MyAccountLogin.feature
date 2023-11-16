# @Smoke
Feature: MY ACCOUNT - LOGIN

  Background:
    Given The user is in home page URL
    And The user clicks on My Account Menu

  Scenario Outline: Login-Handles case sensitive
    When The user enter case changed username "<username>"
    And The user enter case changed password "<password>"
    And The user clicks on login button
    Then Login must fail saying incorrect username or password "<username>"

    Examples:
      | username                 | password   |
      | ludmilatorresg@gmail.com | lumi202064 |

  Scenario Outline: Login-Authentication
    When The user enter case changed username "<username>"
    And The user enter case changed password "<password>"
    And The user clicks on login button
    And The user clicks on logout link
    And The user clicks back button
    Then The user must not be logged into their account "<isLoggedIn>", but rather a general web page must be visible.

    Examples:
      | username                 | password   | isLoggedIn |
      | ludmilatorresg@gmail.com | Lumi202064 | false      |







