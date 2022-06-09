package com.levelup.forestsandmonsters.features;


import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class StartGameSteps {

    GameController gc;
    String playerName;
    int startX, startY;

    @Given("the player has selected to start the game")
    public void givenPlayerStartsGame() {
       System.out.println("Add details of start game");
    }

    @And("the map is initialized {int}")
    public void andMapIsInitiatialized(String startX, String startY) {
        System.out.println("Add details of map Initialization");
    }

    @And("the starting position is with XCoordinates {int} and with YCoordinates {int}")
    public void startingPositionIsXCoordinatesAndYCoordinates(String startX, String startY) {
        System.out.println("Add details of X,Y coordinates for starting position");
    }

    @When("the player enters the character name {string}")
    public void playerEntersCharacterName(String playerName) {
        System.out.println("Add details of Character Name");
    }

    @Then("the game starts")
    public void gameStarts() {
        System.out.println("Add details of Game Starts");
    }


}
