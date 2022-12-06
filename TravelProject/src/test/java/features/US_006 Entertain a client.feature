#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Entertain a client

As a client, 
I would like to be entertained when I travel by listening to music.

Scenario Outline: Entertain the client by offering him the choice to listen to music
Given the creation of a client using the <clientName> 
When the client travels by choosing a <country> that creates a <travel> instance
Then the client can listen to music by choosing his <song> .
  
    Examples: 
      | clientName  | country     | travel                        | song                            |
      | Sam         | Afghanistan | Id: 1, Country: Afghanistan   | This song: Rock is being played |
