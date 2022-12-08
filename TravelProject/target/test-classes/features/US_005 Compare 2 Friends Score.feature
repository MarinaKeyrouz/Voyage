Feature: Compare two users' playlists
  As a user,
  I want to be able to compare the score of another friend with my score
  
  Scenario Outline: Compare two users' playlists
    Given two users : <friendName1>, <friendName2>
    And three songs : (<songName1>, <score1>), (<songName2>, <score2>), (<songName3>, <score3>) the first song is added to the first friend and the rest are added to the second
    When a user compares himself to another user
    Then the user <winner> with the highest score is returned
    
    Examples:
    | friendName1	| friendName2	| songName1	| score1	|  songName2	| score2	| songName3		| score3	| winner   |
    | Nicolas 		| Alexy 			| djadja 		| 1 			| test 				| 3				| test				| 3		 		| Alexy    |
    | Alexy 			| Sylvain			| test 			| 3				| test2				| 5 			| test3				| 3		 		| Sylvain  |
