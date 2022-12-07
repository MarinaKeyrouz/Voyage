#Author: marina.kayrouz@dauphine.eu, zahra.ayache@dauphine.eu

Feature: US_001 Choosing a country

As a client, 
I would like to be able to travel to a country.

Scenario Outline: Choose a country
Given a country and a client 
And the country contains a <countryName> and its <travelModes>
And the client contains a <clientName> 
When the client create a travel instance using the <countryDest>
Then a <travel> instance is created.
  
Examples: 
| clientName | countryName    | travelModes | countryDest  | travel                        |
| Sam        | Afghanistan    | AIRPLANE    | Afghanistan  | Id: 1, Country: Afghanistan   |
     

