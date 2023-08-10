@order
Feature: Validate e-com app with order placement

Background: Open browser, url and close button
Given open browser
When enter url
Then close register page

@search
Scenario: Search mobile
Then enter mobile name as "samsung"
And verify the list of contents

@place
Scenario: Place order
Then enter mobile name as "iphone"
When get first product name and price
Then click first product link
Then verify the first product name and price in details page
And click add to cart