Feature: Get Playlist Score
 	A user wants the score of his playlist

  Scenario Outline: a user wants to know the score of his playlist
    Given a new user <friendName>
    And multiple songs (<songName1>, <score1>), (<songName2>, <score2>)
    When the user searches for the score
    Then the score of the playlist is returned
    
    Examples:
    | friendName	| songName1	| score1	|  songName2	| score2	|
    | Nicolas 		| djadja 		| 1 			| test 				| 3				|
    | Alexy 			| test 			| 3				|	test2				| 5 			|
