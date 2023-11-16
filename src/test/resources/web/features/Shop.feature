#@Smoke
Feature: Shop Page

  Background:
    Given The user is in home page URL
    And The user clicks on Shop Menu top menu link

  @VerifyItemLink
  Scenario Outline: verify shop-add to Basket-view through item link
    When The user clicks on the Add To Basket button
    And The User can view that Book in the Menu item with price
    And The user clicks on Item level View Basket link  which navigates to Basket page.
    And The user can find total and subtotal values just above the Proceed to Checkout button.
    And The user clicks on Proceed to Check out button
    And The user has the feasibility to add coupon in the payment gateway page and also he can find billing, order and additional details.
    And The user fills in the fields to complete the order, "<first_name>", "<last_name>", "<email>", "<phone>", "<address>", "<town_city>", "<postcode_zip>", "<country>", "<state>"
    And The user clicks place-order button
    Then The user navigates to Order confirmation page with order details, bank details, customer details and billing details

    Examples:
      | first_name | last_name | email                  | phone      | address       | town_city | town_city | postcode_zip | country   | state   |
      | Ludmila    | Perez     | ludmilaperez@gmail.com | 2616901712 | Rivadavia 456 | Mendoza   | 1235      | 5500         | Argentina | Mendoza |

  @VerifyBasketTax
  Scenario: verify shop-add to basket-view basket-tax functionality
    When The user clicks on the Add To Basket button
    And The User can view that Book in the Menu item with price
    And The user clicks on Item level View Basket link  which navigates to Basket page.
    And The user can find total and subtotal values just above the Proceed to Checkout button.
    Then the total always is greater than subtotal because taxes are added to the subtotal.
