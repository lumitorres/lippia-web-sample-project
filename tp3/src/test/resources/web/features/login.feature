Feature: Login, The user wants to log into his or her website account

  Background:
    Given the client is in the homepage for login feature
    And the client clicks on My Account Menu

  Scenario Outline: Login valid
    When Enter username <username> in username textbox
    And Enter password <password> in password textbox
    And The client clicks on login button
    Then The client successfully login to the web page with <message>
    Examples:
      | username                 | password   | message                                             |
      | ludmilatorresg@gmail.com | Lumi202064 | Hello ludmilatorresg (not ludmilatorresg? Sign out) |


  Scenario Outline: Login fail for data incorrect
    When Enter username <username> in username textbox
    And Enter password <password> in password textbox
    And The client clicks on login button
    Then Proper error must be displayed invalid <message> and prompt to enter login again
    Examples:
      | username                 | password  | message                                                                                                                              |
      | ludmila@hola             | asdkasdja | Error: The username ludmila@hola is not registered on this site. If you are unsure of your username, try your email address instead. |
      | ludmilatorresg@gmail.com | asdkasdja | Error: The password you entered for the username ludmilatorresg@gmail.com is incorrect. Lost your password?                          |

  Scenario Outline: Login fail for data empty
    And Enter username <username> in username textbox
    And Enter password <password> in password textbox
    And The client clicks on login button
    Then Proper error must be displayed invalid <message> and prompt to enter login again
    Examples:
      | username                 | password   | message                      |
      | ludmilatorresg@gmail.com |            | Error: Password is required. |
      |                          | Lumi202064 | Error: Username is required. |

#@search
#Feature: As a potential client i need to search in google to find a web site
#
#  Scenario Outline: The client search by "<prueba>"
#    Given The client is on google page
#    When The client search for word "<prueba>"
#    Then The client verify that results are shown properly
#Examples:
#    |prueba           |
#    | Crowdar Academy |
#    | Calidad         |
#    | Software        |
#    | Testing         |