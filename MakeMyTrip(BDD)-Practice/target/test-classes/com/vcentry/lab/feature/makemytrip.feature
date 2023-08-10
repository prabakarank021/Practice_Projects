@validRoundtrip
Feature: make my trip flight ticket booking

Background:
Given open browser
When load url

Scenario: validate the roundtrip from chennai to delhi flight ticket booking
When click roundtrip option
When select from city as "Chennai"
And select to city as "delhi"
When select departure date as "May 10 2023"
And select return date as "May 25 2023"
When select no.of traveller and ticket class
And click the search button
Then close the popup module
When select the highest price Departure flight
And select the highest price return flight
When click the booknow button
And click the confirm button
When verify complete page text as "Complete your booking"