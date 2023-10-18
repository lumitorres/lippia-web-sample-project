Feature: Shop

  Background:
    Given The client is in the homepage for shop feature

  Scenario Outline: abcd
    When I Click on Shop Menu
    And I select sort by <sorting_choice> from sorting dropdown menu
    Then See sorted products by <sorting_choice>
    Examples:
      | sorting_choice             |
      | Sort by popularity         |
      | Sort by average rating     |
#      | Sort by newness            |
#      | Sort by price: low to high |
#      | Sort by price: high to low |
