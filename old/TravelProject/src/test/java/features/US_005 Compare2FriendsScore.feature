Feature: Compare two users' playlists
  ajouter des chansons dans les playlists de deux utilisateurs et comparer leurs scores.

  Scenario Outline: Compare two users' playlists
    Given two users : <friendName1>, <friendName2>
    And three songs : (<songName1>, <score1>), (<songName2>, <score2>), (<songName3>, <score3>) are added to the playlists
    When a user compares himself to another user
    Then the user with the highest score is returned
    
    Examples:
    | friendName1	| friendName2	| songName1	| score1	|  songName2	| score2	| songName3		| score3 		|
    | Nicolas 		| Alexy 			|	djadja 		| 1 			| test 				| 3				| test				| 3					|
    | Alexy 			| Sylvain		  | test 			| 3				|	test2				| 5 			| test3				| 3					|
