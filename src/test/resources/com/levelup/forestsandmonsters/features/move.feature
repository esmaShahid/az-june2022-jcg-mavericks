Feature: Move in a direction
I want to move my character. If they attenmpt to move past a boundary, the move results in no chnage in position.
Scenario Outline: Move in a direction
Given the character starts at position with XCoordinates <startingPositionX>
And starts at YCoordinates <staw at position with XCoordinates <srtingPositionY>
And the player choses to move in <direction>
when the character moves
Then the chanracter is now at position with XCoordinates <ebdingPositionX>
And YCoordinates <endingPositionY>
Examples:
  | startingPositionX | startingPositionY | direction | endingPositionX | endingPositionY |
  | 0 | 0 | NORTH | 0 | 1 |
  | 0 | 0 | SOUTH | 0 | 0 |
