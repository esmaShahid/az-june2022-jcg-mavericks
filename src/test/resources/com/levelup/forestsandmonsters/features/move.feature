Feature: Move in a direction
I want to move my character. If they attempt to move past a boundary, the move results in no change in position.
Scenario Outline: Move in a direction
Given the character starts at position with XCoordinates <startingPositionX>
And starts at position with YCoordinates <startingPositionY>
And <moveCount> is assigned to 0
And the player choses to move in <direction>
When the character moves
Then the character is now at position with XCoordinates <endingPositionX>
And YCoordinates <endingPositionY>
And increment the <moveCount> by 1
Examples:
  | startingPositionX | startingPositionY | moveCount | direction | endingPositionX | endingPositionY | moveCount |
  | 0 | 0 | 0 | NORTH | 0 | 0 | 1 |
  | 0 | 0 | 0 | SOUTH | 1 | 0 | 1 |
