#Author: marina.kayrouz@dauphine.eu, zahra.ayache@dauphine.eu, alexy@abihanna-daher.dauphine.eu, nicolas.henry@dauphine.eu

Feature: US_007 Subscribe to a playlist
 
As a client,
I want to be able to subscribe to a playlist.
  
Scenario Outline: Subscribe to a playlist
Given a client c1 named <clientName> with a playlist having the songs: <song1>, <song2>, <song3> 
And another client c2 named <clientName2>
When c1 subscribe to the playlist of c2
Then the playlist of c2 is in the <playlist> of c1
    
Examples:
| clientName  | clientName2 | song1  | song2     | song3         | playlist	                            |
| Nicolas 		| Marina 			| djadja | Scientist | Viva la vida	 | [djadja, Scientist, Viva la vida] 		|
