package Tamagotchi;
import java.util.Scanner;

public class AnimalCreator {

    public AnimalCreator(){
    }

    public BaseClass create(Animal type, String name, int energy, Scanner scan){

        switch(type){
            case Sveinur:
                System.out.println("Hits: ");
                int hits = Integer.valueOf(scan.nextInt());
                return new Sveinur(name, energy, hits);

            case Steen:
                System.out.print("Crying time: ");
                int cry = Integer.valueOf(scan.nextLine());
                return new Steen(name, energy, cry);

            default:
                throw new IllegalArgumentException("Unhandled animal type:" + type);

        }

    }

}
