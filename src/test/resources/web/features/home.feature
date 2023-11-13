@Smoke
Feature: Homepage

  Background:
    Given the client is in the homepage for home feature

  Scenario Outline: successful visualization of home page with sliders
    When I click on Shop Menu
    And I click on Home menu button
    Then The Home page contains only <number> sliders
    Examples:
      | number |
      | 3      |

  Scenario Outline: successful visualization of home page with three arrivals
    When I click on Shop Menu
    And I click on Home menu button
    Then The Home page contains only <number> arrivals
    Examples:
      | number |
      | 3      |