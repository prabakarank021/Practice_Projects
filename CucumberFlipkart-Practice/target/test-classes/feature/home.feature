@runApp
Feature: Title of your feature
  I want to use this template for my feature file

  @openBrowser @search @switch
  Scenario: To open flipkart page
    Given open browser as "chrome"
    When enter url as "https://www.flipkart.com/"
    And close popup button

  @search @switch
  Scenario: Search a mobile phone
    When enter input as "mobiles"
    And get product name
    And get product price
    And click first product

  @switch
  Scenario: After click first product
    When switch to next window

  @compareProduct
  Scenario: Comparing two product details
    When get current product name
    And get current product price
    And comparing product details

  @addToCart
  Scenario: Add to cart
    When add the product to the add to cart section
    And remove the product from add to cart
    Then check if add to cart is empty
