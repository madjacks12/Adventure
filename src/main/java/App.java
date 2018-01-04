/**
 * Created by Guest on 1/4/18.
 */
import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Good morning student.  Time to get to school.");
        System.out.println("Your alarm has just gone off.  Do you: get up or press alarm?");

        try {
            String firstChoice = bufferedReader.readLine();
            if (firstChoice.equals("get up")) {
                System.out.println("The sun is and so are you.");
            } else if (firstChoice.equals("press alarm")) {
                System.out.println("Sleep is important to a healthy and fullfilled life. the alarm will go off in five minutes.");
            } else {
                System.out.println("We don't recognize the choice, please choose get up or press alarm");
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
