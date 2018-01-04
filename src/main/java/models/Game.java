package models;


public class Game {
    private String output;
    public boolean PlayingGame = true;
    public String input = null;
    //    public String playerChoiceOne = input;
    public String[] startGame = {"Yes", "No"};
    public String[] choiceOne = {"get up", "press alarm"};
    public String playerChoice = input;

    public Game(String output) {
        this.output = "a";
        //this.input = playerChoice;
    }

    public String getOutput() {
        return output;
    }

    public String getInput() {
        return input;
    }

    public String startUp() {
        for (Integer i = 0; i < startGame.length; i++) {
            if (input.equals(startGame[0])) {
                return "Let's Start";
            } else if (input.equals(startGame[1])) {
                return "Bye.";
//                playingGame = false;
            } else {
                return "Please enter Yes or No.";

            }
        } return "fail";
//    public String firstDecision() {
//      for (Integer i = 0; i < choiceOne.length; i++) {
//          if (input.equals(choiceOne[0])) {
//              return "The sun is and so are you.";
//          } else if (input.equals(choiceOne[1])) {
//              return "Sleep is important to a healthy and fullfilled life. the alarm will go off in five minutes.";
//          } else {
//              return "We don't recognize the choice, please choose get up or press alarm.";
//          }
//      }
//        this.output = test;
//    }
    }
}