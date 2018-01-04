package models;


/**
 * Created by Guest on 1/4/18.
 */
public class Game {
    private String output;

  public Game(String test) {
        this.output = test;
    }
    public String getOutput(){
      return output;
    }
    public Integer speedHurry(Integer speed){
        Integer speed = 5;
        Integer speedHurry = 2 * speed;
    }

}
