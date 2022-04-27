package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPet virtualPet1 = new VirtualPet(100, 100, 100, 100, 100, 100);

        virtualPet1.introduction();

        Scanner input = new Scanner((System.in));

        String userEntered;

        do {


            System.out.println("[1] - To play with Sam");
            System.out.println("[2] - To feed Sam");
            System.out.println("[3] - To let Sam use the bathroom");
            System.out.println("[4] - To give Sam water");
            System.out.println("[5] - To put Sam to bed");
            System.out.println("[6] - To Quit");

            userEntered = input.nextLine();


            if (userEntered.equals("1")) {
                System.out.println("Sam wants to play: " + virtualPet1.getPlay());
                System.out.println("Fetch Boy Fetch!!!");
                virtualPet1.tick();
                virtualPet1.turnUp();

            } else if (userEntered.equals("2")) {
                System.out.println("Sam is hungry: " + virtualPet1.getHunger());
                System.out.println("Bell Ring..... Here boy time to eat");
                virtualPet1.tick();
                virtualPet1.feed();

            } else if (userEntered.equals("3")) {
                System.out.println("Sam has to use the bathroom: " + virtualPet1.getBathroom());
                System.out.println("Bathroom Break!!!!");
                virtualPet1.tick();
                virtualPet1.pee();

            } else if (userEntered.equals("4")) {
                System.out.println("Sam is thirsty: " + virtualPet1.getThirsty());
                System.out.println("Drink up buddy!");
                virtualPet1.tick();
                virtualPet1.drink();

            } else if (userEntered.equals("5")) {
                System.out.println("Sam is sleep: " + virtualPet1.getSleepy());
                System.out.println("Goodnight buddy!!!");
                virtualPet1.tick();
                virtualPet1.bedTime();


            }


        } while (!userEntered.equals("6"));




    }
}

