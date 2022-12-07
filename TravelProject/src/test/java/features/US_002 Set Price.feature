#Author: marina.kayrouz@dauphine.eu, zahra.ayache@dauphine.eu


Feature: US_002 Set Price

As an agent, 
I would like to be able to set the price for a new travel.

Scenario Outline: Set the price 
Given a travel  
And the travel contains a Country
And the Country contains <countryName> and <travelModes> 
When the agent set the <price>
Then the <price> should be updated. 
  
Examples: 
| countryName    | travelModes | price |
| Afghanistan    | AIRPLANE    | 1000  |
| Lebanon        | CAR         | 700   |
  
  
     

