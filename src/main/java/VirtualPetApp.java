package virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Forrest the bird...Please enter your name");
        String name = input.nextLine();


        VirtualPet pet = new VirtualPet(name,20,20,20,20);
        System.out.println("Hello " + pet.getName() + " Its fun time ");

        int menuOption;
        int exit = 0;

        do {

            System.out.println("pick a number");
            System.out.println("[0] Quit.");
            System.out.println("[1] Play with Forrest");
            System.out.println("[2] Feed Forrest");
            System.out.println("[3] Let Forrest Fly");

            menuOption = input.nextInt();


        }
        while (menuOption == 0);

        if (menuOption == 2) {


            if (pet.getHunger() + 1 > 6) {


                System.out.println("Im Feeling Better");

                return;
            }

            if (pet.getSleepy() + 1 > 6) {
                System.out.println("Forrest is tired ");
                return;

            }


        } else if (menuOption == 1) {


            if (pet.getHunger() + 1 < 0) {
                System.out.println("Im full now thank you.");
                return;
            }

            if (pet.getSleepy() + 1 > 6) {
                System.out.println(" I'm tired. I need some chill time. ");

                return;
            }

            System.out.println("Forrest is munchin away!.");


        } else if (menuOption == 3) {


            if (pet.getBoredom() + 1 > 6) {
                System.out.println("I'm bored. Let's go out and Play!");

                return;
            }


        } else {
            System.out.println("Invalid selection. Please select one of the numbers listed");
        }

        pet.tick();
        {
            while (menuOption != 0) ;
        }

    }
}
