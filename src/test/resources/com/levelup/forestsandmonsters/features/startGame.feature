Feature: StartGame
![Gamer](images/gamerErin.png)

I want to start the game

Scenario Outline:: Start Game for player
    Given the player has selected to start the game
    And the map is initialized
    And the starting position is with XCoordinates <startingPositionX> and with YCoordinates <startingPositionY>
    When the player enters the character name <playerName>
    Then the game starts
    Examples:
        | playerName   | startingPositionX | startingPositionY   |
        | "Kathy"         | 8                 | 3                   |
        | ""              | 5                 | 9                   |

