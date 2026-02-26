package Tamagotchi;
import java.util.Scanner;

public class InputValidation {

    public static Animal promptAnimalType(Scanner scan){
        while(true){
            System.out.print("Choose one of the following types of animals: ");
            Animal[] types = Animal.values();
            for(int i = 0; i < types.length; i++){
                System.out.print(types[i]);
                if(i < types.length-1){
                    System.out.print(", ");
                }
            }
            System.out.print(": ");

            try{
                return Animal.valueOf(scan.nextLine().toLowerCase());
            }catch(IllegalArgumentException e){
                System.out.println("Invalid type ");
            }

        }

    }

}
