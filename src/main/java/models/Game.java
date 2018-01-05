package models;


public class Game {
    public String answerOne;
//    public String answerTwo;
//    public String answerThree;
//    public String answerFour;
//    public String answerFive;
//    public String answerSix;


    public String output;
    public Integer input;
    public String[] choiceOne = {"get up", "press alarm"};

    public String getOutput() {
        return output;
    }

    public Integer getInput() {
        return input;
    }

    public Game(String answerOne) {
        this.answerOne = answerOne;
//        this.answerTwo = answerTwo;
//        this.answerThree = answerThree;
//        this.answerFour = answerFour;
//        this.answerFive = answerFive;
//        this.answerSix = answerSix;

    }
    public String getAnswerOne() {
        return answerOne;
    }
//    public String getAnswerTwo() {
//        return answerTwo;
//    }
//    public String getAnswerThree() {
//        return answerThree;
//    }
//    public String getAnswerFour() {
//        return answerFour;
//    }
//    public String getAnswerFive() {
//        return answerFive;
//    }
//    public String getAnswerSix() {
//        return answerSix;
//    }

//    public String startUp(String input){
//            if (input.equals("Let's Start")) {
//                return "Let's Start";
//            } else if (input.equals("Bye.")) {
//                return "Bye.";
////                playingGame = false;
//            } else {
//                return "Please enter Yes or No.";
//            }
////    public String firstDecision() {
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
