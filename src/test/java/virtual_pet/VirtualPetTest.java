package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet(5,5,5,5,5,5);

    @Test
    public void hungerShouldDefaultAt5(){
        int defaultHunger = underTest.getHunger();
        assertEquals(5, defaultHunger);

    }
    @Test
    public void boredomShouldDefaultAt5(){
        int defaultBoredom = underTest.getBoredom();
        assertEquals(5, defaultBoredom);

    }
    @Test
    public void thirstShouldDefaultAt5(){
        int defaultThirsty = underTest.getThirsty();
        assertEquals(5, defaultThirsty);

    }
    @Test
    public void bathroomShouldDefaultAt5(){
        int defaultBathroom = underTest.getBathroom();
        assertEquals(5, defaultBathroom);

    }
    @Test
    public void sleepShouldDefaultAt15(){
        int defaultSleepy = underTest.getSleepy();
        assertEquals(5, defaultSleepy);

    }
    @Test
    public void playShouldDefaultAt5(){
        int defaultPlay = underTest.getPlay();
        assertEquals(5, defaultPlay);

    }
    @Test
    public void whenYouPlayHungerShouldDecreaseFrom(){
        underTest.feed();
        int defaultHunger = underTest.getHunger();
        assertEquals(10, defaultHunger);
    }
    @Test
    public void whenYouEatThirstShouldDecreaseFrom10to5(){
        underTest.drink();
        int defaultThirsty = underTest.getThirsty();
        assertEquals(10, defaultThirsty);
    }
    @Test
    public void whenYouDrinkBathroomShouldDecreaseFrom10to5(){
        underTest.pee();
        int defaultBathroom = underTest.getBathroom();
        assertEquals(10, defaultBathroom);
    }
    @Test
    public void whenYouAreBoredSleepyShouldDecreaseFrom10to5(){
        underTest.bedTime();
        int defaultSleepy = underTest.getSleepy();
        assertEquals(10, defaultSleepy);
    }
    @Test
    public void whenYouAreBoredPlayShouldDecreaseFrom10to5(){
        underTest.turnUp();
        int defaultPlay = underTest.getPlay();
        assertEquals(10, defaultPlay);
    }

}