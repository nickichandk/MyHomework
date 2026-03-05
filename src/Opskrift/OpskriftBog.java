package Opskrift;

import java.util.ArrayList;
import java.util.Scanner;

public class OpskriftBog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Opskrift> opskrifter = new ArrayList<>();
        boolean kørende = true;

        while (kørende) {
            System.out.println("\n--- Opskriftsbog ---");
            System.out.println("1. Tilføj opskrift");
            System.out.println("2. Søg på titel");
            System.out.println("3. Søg på ingrediens");
            System.out.println("4. Afslut");
            System.out.print("Vælg: ");

            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Titel: ");
                    String titel = scanner.nextLine();
                    System.out.print("Ingredienser: ");
                    String ingredienser = scanner.nextLine();
                    System.out.print("Fremgangsmåde: ");
                    String fremgangsmåde = scanner.nextLine();
                    System.out.print("Kategori: ");
                    String kategori = scanner.nextLine();
                    opskrifter.add(new Opskrift(titel, ingredienser, fremgangsmåde, kategori));
                    System.out.println("Opskrift gemt!");
                    break;
                case 2:
                    System.out.print("Søg på titel: ");
                    String søgTitel = scanner.nextLine();
                    for (Opskrift o : opskrifter) {
                        if (o.getTitle().toLowerCase().contains(søgTitel.toLowerCase())) {
                            System.out.println(o);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Søg på ingrediens: ");
                    String søgIng = scanner.nextLine();
                    for (Opskrift o : opskrifter) {
                        if (o.getIngredienser().toLowerCase().contains(søgIng.toLowerCase())) {
                            System.out.println(o);
                        }
                    }
                    break;
                case 4:
                    kørende = false;
                    break;
            }
        }
    }
}