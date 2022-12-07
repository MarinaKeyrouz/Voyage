Feature: User adds song to playlist
	As a user,
	I want to be able to add a song to my playlist
	
  Scenario Outline: A user adds a song to his playlist
    Given a user : <friendName>
    And a song <songName> with a score <score>
    When the user adds the song in his playlist
    Then the playlist contains the song <songName>

    Examples:
    | friendName	| songName	| score		| songName  |
    | Nicolas 		| djadja 		| 1 			| djadja    |
    | Alexy 			| test 			| 3				| test      |
