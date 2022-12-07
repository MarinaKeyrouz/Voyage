Feature: Entertain a client
  As a client,
  I want to be able to listen to music while on a trip
  
  Scenario Outline: Entertain a client
    Given a new client : <name>
    And a playlist
    And a song <songName>, <score>
    When a user subscribe to a playlist
    Then the song <songName> is in the client playlist
    
    Examples:
    | name				| songName 		| score 	| songName	|
    | Nicolas 		| djadja 			| 1				| djadja 		|
    | Marina 			| test				| 2 			| test			|
