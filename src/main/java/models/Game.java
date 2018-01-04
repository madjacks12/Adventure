package models;


public class Game {
    private String output;
    public boolean playingGame = true;
    public String input = " ";
    public String playerChoiceOne = input;
    public String [] startGame = {"Yes", "No"};
    public String [] choiceOne = {"get up", "press alarm"};

    public Game(String output) {
        this.output = "a";
    }
    public String getOutput() {
        return output;
    }
}

//    public String startUp(){
//        for (Integer i = 0; i < choiceOne.length; i++) {
//            if (input.equals(startGame[0])) {
//                return "Let's Start";
//            } else if (input.equals(startGame[1])) {
//                return "Bye.";
//                playingGame = false;
//            } else {
//                return "Please enter Yes or No.";
//            }
//        }
//
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





