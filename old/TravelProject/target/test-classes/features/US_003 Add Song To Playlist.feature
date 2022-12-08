#Author: alexy.abi-hanna-daher@dauphine.eu, nicolas.henry@dauphine.eu

Feature: US_003 Add a Song to a Playlist

As a user, 
I would like to be able to add a song to my playlist.

Scenario Outline: Add a song to a playlist
 Given a user <friendName>
 And a song <songName> with a score <score>
 When the user adds the song in his playlist
 Then the playlist contains the song.
  
    Examples:
    | friendName	| songName	| score		| 
    | Nicolas 		| djadja 		| 1 			| 
    | Alexy 			| test 			| 3				|	
     


