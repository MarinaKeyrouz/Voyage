#Author: marina.kayrouz@dauphine.eu, zahra.ayache@dauphine.eu

Feature: US_000 Country Creation

As an agent, 
I would like to be able to create a new country of destination and its travel modes.

Scenario: Create a new country and travel modes associated
Given the creation of a country using the name <countryName>  
And an agent enters the travel modes using <travelModes>
When the agent validates that the entries are correct
Then the country and the travel modes are saved and available for the client to choose from.
  
Examples: 
| countryName    | travelModes |
| Afghanistan    | airplane    | 
#| Albania      | airplane  
#| Algeria      | airplane, bus
  
  
     
