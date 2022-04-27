package virtual_pet;

public class VirtualPet {

    private int hunger;
    private int boredom;
    private int thirsty;
    private int bathroom;
    private int sleepy;
    private int play;

    public VirtualPet(int inputHunger, int inputBoredom, int inputThirsty, int inputBathroom, int inputSleepy, int inputPlay) {
        this.hunger = inputHunger;
        this.boredom = inputBoredom;
        this.thirsty = inputThirsty;
        this.bathroom = inputBathroom;
        this.sleepy = inputSleepy;
        this.play = inputPlay;

    }

    public void introduction(){
        System.out.println("Welcome to Sam's Place");

        System.out.println("Hi!!! My name is Sam");

        System.out.println("Lets have some fun!!");

        System.out.println("What should we do first?");

    }



    public int getHunger(){
        return hunger;
    }

    public int getBoredom(){
        return boredom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getThirsty(){
        return thirsty;
    }

    public int getSleepy() {
        return sleepy;
    }

    public int getPlay() {
        return play;
    }


    public void tick() {
        hunger += 8;
        boredom += 3;
        bathroom += 7;
        thirsty += 5;
        sleepy += 1;
        play += 2;
    }


    public void feed() {
        hunger += 15;
        sleepy += 10;
        bathroom += 20;
    }

    public void drink() {
        thirsty -= 6;
        bathroom += 8;
        play += 6;
    }

    public void pee() {
        bathroom += 10;
        thirsty -= 15;
    }

    public void bedTime() {
        sleepy += 20;
        hunger -= 25;
    }

    public void turnUp() {
        play += 15;
        hunger -= 15;
        sleepy += 20;
    }
}
