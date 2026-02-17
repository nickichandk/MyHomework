package Lesson08;
import java.util.Random;

public class Game {
    private Random rand = new Random();
    private int Rnum = rand.nextInt(100) + 1;

    /*public Game() {
        this.Rnum = rand.nextInt(100) + 1;

    }
    */

    public String checkGuess(int guess){
        if(guess < Rnum){
            return "too low";
        }else if(guess > Rnum){
            return "too high";
        }else{
            return "correct";
        }
    }

    public boolean ifCorrect(int guess){
        return guess == Rnum;
    }




}
