#Author: alexy@abihanna-daher.dauphine.eu, nicolas.henry@dauphine.eu

Feature: US_004 Get Playlist Score

As a user,
I want to be able to get the score of my playlist

Scenario Outline: A user wants to know the score of his playlist
Given a new user <friendName>
And multiple songs (<songName1>, <score1>), (<songName2>, <score2>)
When the user searches for the score
Then the score <score> of the playlist is returned
    
Examples:
| friendName	| songName1	 	| score1 	|  songName2	|  score2	| score  |
| Nicolas 		| djadja 			| 1 			|   test 			| 3		    |  4     |
| Alexy 			| test 				| 3				|   test2			| 5  			|  8     |
