Feature: Move in a direction
I want to move my character. If they attenmpt to move past a boundary, the move results in no chnage in position.
Scenario Outline: Move in a direction
Given the character starts at position with XCoordinates <startingPositionX>
And starts at YCoordinates <staw at position with XCoordinates <srtingPositionY>
And <startMoveCount> is assigned to 0
And the player choses to move in <direction>
When the character moves
Then the chanracter is now at position with XCoordinates <ebdingPositionX>
And YCoordinates <endingPositionY>
And increment the <endMoveCount> by 1
Examples:
  | startingPositionX | startingPositionY | startMoveCount | direction | endingPositionX | endingPositionY | endMoveCount |
  | 0 | 0 | 0 | NORTH | 0 | 0 | 1 |
  | 0 | 0 | 0 | SOUTH | 1 | 0 | 1 |
