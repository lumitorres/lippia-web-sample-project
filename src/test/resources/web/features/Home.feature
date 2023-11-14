Feature: Home Page

  Background:
    Given The user is in home page URL

  @Smoke
  Scenario: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    When The user click on the image in the Arrivals
    And The user click on the Add To Basket button which adds that book to your basket
    And The User can view that Book in the Menu item with price
    And The user click on View Basket button
    And The user click on Proceed to Check out button
    Then The user has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.
