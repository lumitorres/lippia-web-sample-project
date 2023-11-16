#@Smoke
Feature: My Account

  Background:
    Given The user is in home page URL
    And The user clicks on My Account Menu
    And The user verify LogOut

  @LoginSuccessful
  Scenario Outline: My Accounts - Log Out
    When The user enter case changed username "<username>"
    And The user enter case changed password "<password>"
    And The user clicks on login button
    And The user must successfully login to the web page
    And The user clicks on My Account Menu
    And The user clicks on logout link
    Then The user user successfully comes out from the site

    Examples:
      | username                 | password   |
      | ludmilatorresg@gmail.com | Lumi202064 |

  @LoginAndAccountDetails
  Scenario Outline: My Account -Account details
    When The user enter case changed username "<username>"
    And The user enter case changed password "<password>"
    And The user clicks on login button
    And The user must successfully login to the web page
    And The user clicks on My Account Menu
    And The user clicks on Account details
    Then The user ser view account details where he can change his password also "<username>"

    Examples:
      | username                 | password   |
      | ludmilatorresg@gmail.com | Lumi202064 |








