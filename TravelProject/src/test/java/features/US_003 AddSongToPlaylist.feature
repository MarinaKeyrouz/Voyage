Feature: User adds song to playlist
	A user wants to add a song to his playlist
	
  Scenario Outline: un utilisateur ajoute une chanson dans sa playlist
    Given a user : <friendName>
    And a song <songName> with a score <score>
    When the user adds the song in his playlist
    Then the playlist contains the song

    Examples:
    | friendName	| songName	| score		|
    | Nicolas 		| djadja 		| 1 			|
    | Alexy 			| test 			| 3				|	
