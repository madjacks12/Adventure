/**
 * Created by Guest on 1/4/18.
 */
import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        boolean PlayingGame = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (PlayingGame){
                System.out.println("Good morning student.  Time to get to school.");
                System.out.println("Your alarm has just gone off.  Do you: get up or press alarm?");
                Game newGame = new Game("a");
                String playerChoice = bufferedReader.readLine();
                newGame.startUp();
            }


    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
