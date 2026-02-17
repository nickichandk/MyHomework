package Lesson08;
//import java.util.Random;
//import java.util.Scanner;



public class GuessNumberApp {
    public static void main(String []args) {

        User user = new User();
        Game game = new Game();

        System.out.println("Enter your guess of the random generated number:" + " ");

        while(true){
            int guess = user.getUser();
            String check = game.checkGuess(guess);

            System.out.println(check);

            if(game.ifCorrect(guess)){
                break;
            }
        }

        user.closeS();










        /* Scanner scan = new Scanner(System.in);
        Random randNum = new Random();

        int noob = randNum.nextInt(100) + 1;

        System.out.println("Guess the random number that has just been generated.");
        int guess = Integer.valueOf(scan.nextLine());

        while(true){
            if(guess<noob){
                System.out.println("too low");
                guess = Integer.valueOf(scan.nextLine());
            }else if(guess>noob){
                System.out.println("too high");
                guess = Integer.valueOf(scan.nextLine());
            }else if(guess==noob){
                System.out.println("correct");
                break;
            }
        }
    }*/

    }
}
