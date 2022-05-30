Feature: to validate the Product added to the Cart and removed functionality of Flipkart application

  Background: 
    Given the user should be in Flipkart page

  Scenario: to validate the  Product added to the Cart and removed functionlity
    When the user has to enter the Product name in serach box and search the product
    And the user has to click any product & Add to the cart
    And the user has to click Place Order button & Login to the application
    And the user has to Select Address & Select Payment option
    And the user has to click Remove the product from the cart
    Then the user should navigate to the Empty Add to the cart page
