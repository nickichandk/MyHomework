package Tamagotchi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TestTamagotchi {
    Random random = new Random();
    private Scanner scan;
    private AnimalCreator creator;

    public TestTamagotchi(Scanner scan, AnimalCreator creator){
        this.scan = scan;
        this.creator = creator;
    }

    public ArrayList<BaseClass> collectItems(){
        System.out.println("---Hello, and welcome to Tamagotchi World!!!---");
        System.out.println("What kind of animal would you like as your pet? ");

        Animal type = InputValidation.promptAnimalType(scan);

        ArrayList<BaseClass> baseItems = new ArrayList<>();

        System.out.println("Perfect - Now what will the name of your " + type + " be? ");
        String name = scan.nextLine();

        int energy = random.nextInt(5, 11);
        System.out.println("The energy level of " + name + " is " + energy + "⚡️");

        baseItems.add(creator.create(type, name, energy, scan));

        System.out.println();
        System.out.println("Here is you animals information: ");
        return baseItems;

    }








}
