package com.levelup.forestsandmonsters.features;
import static org.junit.Assert.assertEquals;


import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

public class MoveSteps {
    
    GameController gc;
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;
    int moveCount =0;
    
    int startingPositionX,startingPositionY,endingPositionX,endingPositionY;
    @Given("the character starts at position with XCoordinates {int}")
    public void givenTheCharacterStartsAtX(int startX) {
        this.startingPositionX = startX;
    }
    
    @And("starts at position with YCoordinates {int}")
    public void andTheCharacterStartsAtY(int startY) {
        this.startingPositionY = startY;
    }
    
    @And("{int} is assigned to 0")
    public void moveCountIsAssignedToZero(int moveCount) {
        this.moveCount = moveCount;
    }

    @And("the player choses to move in {string}" )
    public void moveDirection (GameController.DIRECTION direction) {
        this.direction = direction;
    }

    @When("the character moves")
    public void whenCharacterMoves() {
        System.out.println("need to add increment move method here");
    }

    @Then("the character is now at position with XCoordinates {int}")
    public void thenCharacterIsatXposition(int xCoordinates) {
       System.out.println("add details of x co-ordinate after move");
    }

    @And("YCoordinates {int}")
    public void thenCharacterIsatYposition(int yCoordinates) {
        System.out.println("add details of y co-ordinate after move");
     }

     @And("increment the {int} by 1")
    public void moveCounterIncrement(int moveCount) {
        this.moveCount++;
        System.out.println("latest move counter is :" + moveCount );
        
     }
}
