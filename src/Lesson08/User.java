package Lesson08;
import java.util.Scanner;

public class User {
    /* We can also initialize the scanner immediately at declaration if we want, like this:
    private Scanner scan = new Scanner(System.in);
    */


    private Scanner scan;

    public int getUser(){
    //Here we initialize/make the scanner object inside the method
        this.scan = new Scanner(System.in);
        return Integer.valueOf(scan.nextLine());

    }

    public void closeS(){
        this.scan.close();

    }










}
