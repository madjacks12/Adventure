/**
 * Created by Guest on 1/4/18.
 */
import models.Game;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean playingGame = true;

        Game answerOne = new Game("The sun is and so are you. Do you get dressed or get hit by a bus?");
        Game answerTwo = new Game("Sleep is important to a healthy and fullfilled life. the alarm will go off in five minutes.");
        Game answerThree = new Game("you win!");
        Game answerFour = new Game("The sun is and so are you.");
        Game answerFive = new Game("The sun is and so are you.");


        while (playingGame) {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Good morning student.  Time to get to school.");
            System.out.println("Your alarm has just gone off.  Do you: get up or press alarm?");


            try {
                String playerChoice = bufferedReader.readLine();

                if (playerChoice.equals("get up")) {
                    System.out.print(answerOne.getAnswerOne());
                } else if (playerChoice.equals("press alarm")) {
                    System.out.print(answerTwo.getAnswerOne());
                } else {
                    System.out.print("figure it out!");
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
