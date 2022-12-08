#Author: marina.kayrouz@dauphine.eu, zahra.ayache@dauphine.eu, alexy@abihanna-daher.dauphine.eu, nicolas.henry@dauphine.eu

Feature: US_006 Entertain a client
 
As a client,
I want to be able to listen to music when travelling.
  
Scenario Outline: Listen to music when travelling
Given the creation of a client using the <clientName> 
And the client <travels> by choosing a <country> 
And the client chooses a song by using the <songName>
Then the client can listen to <music>

Examples: 
| clientName  | country     | travels                        |  songName | music                           |
| Sam         | Afghanistan | Id: 1, Country: Afghanistan    |  Rock     | This song: Rock is being played |
